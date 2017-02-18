package es.flaviojmend.busyFlights.persistence.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import es.flaviojmend.busyFlights.serializer.PriceSerializer;

import java.util.Date;

public class Flight {

    private String airline;
    private String supplier;

    @JsonSerialize(using = PriceSerializer.class)
    private Double fare;
    private String departureAirportCode;
    private String destinationAirportCode;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm'Z'")
    private Date departureDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm'Z'")
    private Date arrivalDate;


    public String getAirline() {
        return airline;
    }

    public Flight setAirline(String airline) {
        this.airline = airline;
        return this;
    }

    public String getSupplier() {
        return supplier;
    }

    public Flight setSupplier(String supplier) {
        this.supplier = supplier;
        return this;
    }

    public Double getFare() {
        return fare;
    }

    public Flight setFare(Double fare) {
        this.fare = fare;
        return this;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public Flight setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
        return this;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public Flight setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
        return this;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public Flight setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
        return this;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public Flight setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
        return this;
    }
}
