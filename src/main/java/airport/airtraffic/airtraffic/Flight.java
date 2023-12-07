package airport.airtraffic.airtraffic;

public class Flight {
    private String flightNumber;
    private boolean delayed;
    private boolean cancelled;
    private Aircraft aircraft;

    public Flight(String flightNumber, boolean delayed, boolean cancelled, Aircraft aircraft) {
        this.flightNumber = flightNumber;
        this.delayed = delayed;
        this.cancelled = cancelled;
        this.aircraft = aircraft;
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
    public Aircraft getAircraft() {
        return aircraft;
    }
}