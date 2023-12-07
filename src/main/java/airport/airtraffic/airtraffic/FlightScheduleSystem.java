package airport.airtraffic.airtraffic;

import java.util.ArrayList;
import java.util.List;

public class FlightScheduleSystem {
    private List<Flight> flights;

    public FlightScheduleSystem() {
        this.flights = new ArrayList<>();
    }
    public List<Flight> getFlight() {
        return flights;
    }
    public void setFlight(List<Flight> flight) {
        this.flights = flight;
    }
    public void addFlight(Flight flight) {
        flights.add(flight);
    }
    public void updateFlight(Flight flight) {
    }
    public List<Flight> getAllFlights() {
        return new ArrayList<>(flights);
    }
    public void handleDelays() {
        for (Flight flight : flights) {
            if (flight.isDelayed()) {
                System.out.println("Flight " + flight.getFlightNumber() + " is delayed.");
            }
        }
    }

    public void handleCancellations() {
        for (Flight flight : flights) {
            if (flight.isCancelled()) {
                System.out.println("Flight " + flight.getFlightNumber() + " is cancelled.");
            }
        }
    }

}