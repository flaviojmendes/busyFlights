package es.flaviojmend.busyFlights.command;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class FlightsFilterCommand {

    private String origin;
    private String destination;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm'Z'")
    private Date departureDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm'Z'")
    private Date returnDate;
    private Integer numberOfPassengers;

    public String getOrigin() {
        return origin;
    }

    public FlightsFilterCommand setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public String getDestination() {
        return destination;
    }

    public FlightsFilterCommand setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public FlightsFilterCommand setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
        return this;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public FlightsFilterCommand setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public FlightsFilterCommand setNumberOfPassengers(Integer numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
        return this;
    }
}
