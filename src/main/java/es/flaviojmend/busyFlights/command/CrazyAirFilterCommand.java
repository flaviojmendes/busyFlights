package es.flaviojmend.busyFlights.command;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by flavio on 17/02/17.
 */
public class CrazyAirFilterCommand {

    private String origin;
    private String destination;
    @JsonFormat(pattern = "MM-dd-yyyy")
    private Date departureDate;
    @JsonFormat(pattern = "MM-dd-yyyy")
    private Date returnDate;
    private Integer numberOfPassengers;


    public String getOrigin() {
        return origin;
    }

    public CrazyAirFilterCommand setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public String getDestination() {
        return destination;
    }

    public CrazyAirFilterCommand setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public CrazyAirFilterCommand setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
        return this;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public CrazyAirFilterCommand setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public CrazyAirFilterCommand setNumberOfPassengers(Integer numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
        return this;
    }
}
