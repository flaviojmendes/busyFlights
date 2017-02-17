package es.flaviojmend.travix.persistence.repo;

import es.flaviojmend.travix.persistence.entity.CrazyAirFlight;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.concurrent.ThreadLocalRandom.current;

/**
 * Mocked repository.
 */
public class CrazyAirMockRepository {

    private List<CrazyAirFlight> flights;

    public CrazyAirMockRepository() {
        this.flights = new ArrayList<CrazyAirFlight>();

        for(int i=0 ; i < 30 ; i++) {
            flights.add(new CrazyAirFlight().setAirline("LATAM")
                    .setArrivalDate(retrieveRandomDate())
                    .setDepartureDate(retrieveRandomDate())
                    .setCabinclass(current().nextInt(0, 1) == 0 ? "E" : "B")
                    .setDepartureAirportCode(current().nextInt(0, 1) == 0 ? "BSB" : "RIO")
                    .setDestinationAirportCode(current().nextInt(0, 1) == 0 ? "GRU" : "CGH")
                    .setPrice(current().nextDouble(99.0, 600.0))
            );
        }

    }

    public Iterable<CrazyAirFlight> listAll() {
        return flights;
    }

    private Date retrieveRandomDate() {
        Calendar date = new GregorianCalendar();

        date.set(Calendar.HOUR_OF_DAY, current().nextInt(23));
        date.set(Calendar.MINUTE, current().nextInt(59));
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);
        date.set(Calendar.DAY_OF_MONTH, current().nextInt(29));
        date.set(Calendar.MONTH, current().nextInt(11));

        return date.getTime();

    }


}
