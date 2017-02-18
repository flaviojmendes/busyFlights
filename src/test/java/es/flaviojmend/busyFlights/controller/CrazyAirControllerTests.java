package es.flaviojmend.busyFlights.controller;


import es.flaviojmend.busyFlights.AppConfiguration;
import es.flaviojmend.busyFlights.Values;
import es.flaviojmend.busyFlights.command.CrazyAirFilterCommand;
import es.flaviojmend.busyFlights.command.ToughJetFilterCommand;
import es.flaviojmend.busyFlights.persistence.entity.CrazyAirFlight;
import es.flaviojmend.busyFlights.persistence.entity.ToughJetFlight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppConfiguration.class)
@WebAppConfiguration
@TestPropertySource(locations="classpath:test.properties")
@IntegrationTest("server.port:8001")
public class CrazyAirControllerTests {

	@Autowired
	private Values values;

	@Test
	public void searchFlights() {
		CrazyAirFlight[] flights = new TestRestTemplate().postForObject("http://localhost:" + values.getServerPort() +"/crazyAir",
				new CrazyAirFilterCommand(),
				CrazyAirFlight[].class);
		assertEquals(30, flights.length);

	}

}
