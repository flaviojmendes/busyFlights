package es.flaviojmend.busyFlights.controller;

import es.flaviojmend.busyFlights.command.ToughJetFilterCommand;
import es.flaviojmend.busyFlights.persistence.entity.ToughJetFlight;
import es.flaviojmend.busyFlights.service.ToughJetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toughJet")
public class ToughJetController {


    @Autowired
    ToughJetService toughJetService;

    @RequestMapping(method = RequestMethod.POST)
    public Iterable<ToughJetFlight> search(@RequestBody ToughJetFilterCommand toughJetFilterCommand) {
        return toughJetService.listFlights(toughJetFilterCommand);
    }




}