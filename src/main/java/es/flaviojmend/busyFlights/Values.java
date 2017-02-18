package es.flaviojmend.busyFlights;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Values {

    @Value("${server.port}")
    private Integer serverPort;

    public Integer getServerPort() {
        return this.serverPort;
    }
}
