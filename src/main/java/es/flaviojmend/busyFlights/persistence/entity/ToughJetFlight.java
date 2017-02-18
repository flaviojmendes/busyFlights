package es.flaviojmend.busyFlights.persistence.entity;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import es.flaviojmend.busyFlights.serializer.PriceSerializer;

public class ToughJetFlight {

    private String carrier;

    @JsonSerialize(using = PriceSerializer.class)
    private Double basePrice;

    @JsonSerialize(using = PriceSerializer.class)
    private Double tax;

    @JsonSerialize(using = PriceSerializer.class)
    private Double discount;

    private String departureAirportName;
    private String arrivalAirportName;

    private Integer departureDay;
    private Integer departureMonth;
    private Integer departureYear;

    private Integer returnDay;
    private Integer returnMonth;
    private Integer returnYear;


    public String getCarrier() {
        return carrier;
    }

    public ToughJetFlight setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public ToughJetFlight setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    public Double getTax() {
        return tax;
    }

    public ToughJetFlight setTax(Double tax) {
        this.tax = tax;
        return this;
    }

    public Double getDiscount() {
        return discount;
    }

    public ToughJetFlight setDiscount(Double discount) {
        this.discount = discount;
        return this;
    }

    public String getDepartureAirportName() {
        return departureAirportName;
    }

    public ToughJetFlight setDepartureAirportName(String departureAirportName) {
        this.departureAirportName = departureAirportName;
        return this;
    }

    public String getArrivalAirportName() {
        return arrivalAirportName;
    }

    public ToughJetFlight setArrivalAirportName(String arrivalAirportName) {
        this.arrivalAirportName = arrivalAirportName;
        return this;
    }

    public Integer getDepartureDay() {
        return departureDay;
    }

    public ToughJetFlight setDepartureDay(Integer departureDay) {
        this.departureDay = departureDay;
        return this;
    }

    public Integer getDepartureMonth() {
        return departureMonth;
    }

    public ToughJetFlight setDepartureMonth(Integer departureMonth) {
        this.departureMonth = departureMonth;
        return this;
    }

    public Integer getDepartureYear() {
        return departureYear;
    }

    public ToughJetFlight setDepartureYear(Integer departureYear) {
        this.departureYear = departureYear;
        return this;
    }

    public Integer getReturnDay() {
        return returnDay;
    }

    public ToughJetFlight setReturnDay(Integer returnDay) {
        this.returnDay = returnDay;
        return this;
    }

    public Integer getReturnMonth() {
        return returnMonth;
    }

    public ToughJetFlight setReturnMonth(Integer returnMonth) {
        this.returnMonth = returnMonth;
        return this;
    }

    public Integer getReturnYear() {
        return returnYear;
    }

    public ToughJetFlight setReturnYear(Integer returnYear) {
        this.returnYear = returnYear;
        return this;
    }
}
