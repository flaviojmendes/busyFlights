package es.flaviojmend.travix.persistence.entity;


import java.util.Date;

public class CrazyAirFlight {

    private String airline;
    private Double price;
    private String cabinclass;
    private String departureAirportCode;
    private String destinationAirportCode;
    private Date departureDate;
    private Date arrivalDate;


    public String getAirline() {
        return airline;
    }

    public CrazyAirFlight setAirline(String airline) {
        this.airline = airline;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public CrazyAirFlight setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getCabinclass() {
        return cabinclass;
    }

    public CrazyAirFlight setCabinclass(String cabinclass) {
        this.cabinclass = cabinclass;
        return this;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public CrazyAirFlight setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
        return this;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public CrazyAirFlight setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
        return this;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public CrazyAirFlight setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
        return this;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public CrazyAirFlight setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
        return this;
    }
}
