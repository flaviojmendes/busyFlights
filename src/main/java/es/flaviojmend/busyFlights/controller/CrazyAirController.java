package es.flaviojmend.busyFlights.controller;

import es.flaviojmend.busyFlights.command.CrazyAirFilterCommand;
import es.flaviojmend.busyFlights.persistence.entity.CrazyAirFlight;
import es.flaviojmend.busyFlights.service.CrazyAirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crazyAir")
public class CrazyAirController {


    @Autowired
    CrazyAirService crazyAirService;

    @RequestMapping(method = RequestMethod.POST)
    public Iterable<CrazyAirFlight> search(@RequestBody CrazyAirFilterCommand crazyAirFilterCommand) {

        return crazyAirService.listFlights(crazyAirFilterCommand);
    }




}