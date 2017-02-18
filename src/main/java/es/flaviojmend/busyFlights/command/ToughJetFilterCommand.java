package es.flaviojmend.busyFlights.command;

/**
 * Created by flavio on 17/02/17.
 */
public class ToughJetFilterCommand {

    private String from;
    private String to;
    private Integer departureDay;
    private Integer departureMonth;
    private Integer departureYear;
    private Integer returnDay;
    private Integer returnMonth;
    private Integer returnYear;
    private Integer numberOfAdults;


    public String getFrom() {
        return from;
    }

    public ToughJetFilterCommand setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public ToughJetFilterCommand setTo(String to) {
        this.to = to;
        return this;
    }

    public Integer getDepartureDay() {
        return departureDay;
    }

    public ToughJetFilterCommand setDepartureDay(Integer departureDay) {
        this.departureDay = departureDay;
        return this;
    }

    public Integer getDepartureMonth() {
        return departureMonth;
    }

    public ToughJetFilterCommand setDepartureMonth(Integer departureMonth) {
        this.departureMonth = departureMonth;
        return this;
    }

    public Integer getDepartureYear() {
        return departureYear;
    }

    public ToughJetFilterCommand setDepartureYear(Integer departureYear) {
        this.departureYear = departureYear;
        return this;
    }

    public Integer getReturnDay() {
        return returnDay;
    }

    public ToughJetFilterCommand setReturnDay(Integer returnDay) {
        this.returnDay = returnDay;
        return this;
    }

    public Integer getReturnMonth() {
        return returnMonth;
    }

    public ToughJetFilterCommand setReturnMonth(Integer returnMonth) {
        this.returnMonth = returnMonth;
        return this;
    }

    public Integer getReturnYear() {
        return returnYear;
    }

    public ToughJetFilterCommand setReturnYear(Integer returnYear) {
        this.returnYear = returnYear;
        return this;
    }

    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }

    public ToughJetFilterCommand setNumberOfAdults(Integer numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
        return this;
    }
}
