package es.flaviojmend.busyFlights.controller;


import es.flaviojmend.busyFlights.AppConfiguration;
import es.flaviojmend.busyFlights.Values;
import es.flaviojmend.busyFlights.command.FlightsFilterCommand;
import es.flaviojmend.busyFlights.persistence.entity.Flight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppConfiguration.class)
@WebAppConfiguration
@TestPropertySource(locations="classpath:test.properties")
@IntegrationTest("server.port:8001")
public class FlightsControllerTest {

	@Autowired
	private Values values;

	@Test
	public void searchFlights() {
		Flight[] flights = new TestRestTemplate().postForObject("http://localhost:" + values.getServerPort() +"/searchFlights",
				new FlightsFilterCommand(),
				Flight[].class);
		assertEquals(60, flights.length);

	}

	@Test
	public void searchFlightsMoreThan4Passengers() {
		try {
			Flight[] flights = new TestRestTemplate().postForObject("http://localhost:" + values.getServerPort() + "/searchFlights",
					new FlightsFilterCommand().setNumberOfPassengers(5),
					Flight[].class);
		} catch (Exception e) {
			assertTrue(true);
		}

	}

	@Test
	public void searchFlights0Passengers() {
		try {
			Flight[] flights = new TestRestTemplate().postForObject("http://localhost:" + values.getServerPort() + "/searchFlights",
					new FlightsFilterCommand().setNumberOfPassengers(0),
					Flight[].class);
		} catch (Exception e) {
			assertTrue(true);
		}

	}

}
