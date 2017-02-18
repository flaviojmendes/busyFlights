package es.flaviojmend.busyFlights.persistence.repo;

import es.flaviojmend.busyFlights.persistence.entity.ToughJetFlight;

import java.util.*;

import static java.util.concurrent.ThreadLocalRandom.current;

/**
 * Mocked repository.
 */
public class ToughJetMockRepository {

    private List<ToughJetFlight> flights;

    public ToughJetMockRepository() {
        this.flights = new ArrayList<ToughJetFlight>();

        for(int i=0 ; i < 30 ; i++) {
            flights.add(new ToughJetFlight().setCarrier("Lufthansa")
                    .setBasePrice(current().nextDouble(99.0, 600.0))
                    .setTax(current().nextDouble(0.0, 50.0))
                    .setDiscount(current().nextDouble(0.0, 99.0))
                    .setDepartureAirportName(current().nextInt(0, 2) == 0 ? "FRA" : "MAN")
                    .setArrivalAirportName(current().nextInt(0, 2) == 0 ? "AMS" : "BCN")
                    .setDepartureDay(current().nextInt(1, 31))
                    .setDepartureMonth(current().nextInt(1, 13))
                    .setDepartureYear(2017)
                    .setReturnDay(current().nextInt(1, 31))
                    .setReturnMonth(current().nextInt(1, 13))
                    .setReturnYear(2017)

            );
        }

    }

    public List<ToughJetFlight> listAll() {
        return flights;
    }



}
