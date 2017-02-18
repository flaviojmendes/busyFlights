package es.flaviojmend.busyFlights.controller;

import es.flaviojmend.busyFlights.command.FlightsFilterCommand;
import es.flaviojmend.busyFlights.exception.InvalidQuantityException;
import es.flaviojmend.busyFlights.service.SearchFlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/searchFlights")
public class FlightsController {

    @Autowired
    private SearchFlightsService searchFlightsService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> search(@RequestBody FlightsFilterCommand flightsFilterCommand) {
        HttpHeaders httpHeaders = new HttpHeaders();
        try {
            return new ResponseEntity<>(searchFlightsService.listFlights(flightsFilterCommand), httpHeaders, HttpStatus.OK);
        } catch (InvalidQuantityException e) {
            return new ResponseEntity<>(e.getMessage(), httpHeaders, HttpStatus.BAD_REQUEST);
        }
    }

}
