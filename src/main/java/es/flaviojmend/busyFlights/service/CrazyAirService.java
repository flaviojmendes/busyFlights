package es.flaviojmend.busyFlights.service;

import es.flaviojmend.busyFlights.command.CrazyAirFilterCommand;
import es.flaviojmend.busyFlights.persistence.entity.CrazyAirFlight;
import es.flaviojmend.busyFlights.persistence.repo.CrazyAirMockRepository;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CrazyAirService {


    public Iterable<CrazyAirFlight> listFlights(CrazyAirFilterCommand crazyAirFilter) {
        CrazyAirMockRepository mockRepository = new CrazyAirMockRepository();

        List<CrazyAirFlight> flights = mockRepository.listAll();

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

        return flights.stream()
                .filter(flight ->
                        crazyAirFilter.getOrigin() == null ||
                        flight.getDepartureAirportCode().equals(crazyAirFilter.getOrigin())
                ).filter(flight ->
                        crazyAirFilter.getDestination() == null ||
                        flight.getDestinationAirportCode().equals(crazyAirFilter.getDestination())
                ).filter(flight ->
                        crazyAirFilter.getDepartureDate() == null ||
                        sdf.format(flight.getDepartureDate()).equals(sdf.format(crazyAirFilter.getDepartureDate()))
                ).filter(flight ->
                        crazyAirFilter.getReturnDate() == null ||
                        sdf.format(flight.getArrivalDate()).equals(sdf.format(crazyAirFilter.getReturnDate()))
                ).collect(Collectors.toList());


    }
}
