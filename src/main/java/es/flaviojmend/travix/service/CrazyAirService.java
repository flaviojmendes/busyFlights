package es.flaviojmend.travix.service;

import es.flaviojmend.travix.persistence.entity.CrazyAirFlight;
import es.flaviojmend.travix.persistence.repo.CrazyAirMockRepository;
import org.springframework.stereotype.Service;

@Service
public class CrazyAirService {


    public Iterable<CrazyAirFlight> listFlights(CrazyAirFlight crazyAirFlight) {
        CrazyAirMockRepository mockRepository = new CrazyAirMockRepository();

        return mockRepository.listAll();
    }
}
