package airport.airtraffic.airtraffic;

public class Flight {
    private String flightNumber;
    private boolean delayed;
    private boolean cancelled;

    public Flight(String flightNumber, boolean delayed, boolean cancelled) {
        this.flightNumber = flightNumber;
        this.delayed = delayed;
        this.cancelled = cancelled;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public boolean isCancelled() {
        return cancelled;
    }
}