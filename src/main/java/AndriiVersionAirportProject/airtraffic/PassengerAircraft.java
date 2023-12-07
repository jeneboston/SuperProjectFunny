package AndriiVersionAirportProject.airtraffic;

import airport.airtraffic.airtraffic.Aircraft;

public class PassengerAircraft extends Aircraft {
    private int numberOfSeats;

    public PassengerAircraft(String model,String typeOfAircraft, int capacity, double weight, double maxSpeed, double range, int numberOfSeats) {
        super(model, typeOfAircraft, capacity, weight, maxSpeed, range);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "PassengerAircraft{" +
                "model='" + getModel() + '\'' +
                ", type=" + getTypeOfAircraft() +
                ", capacity=" + getCapacity() +
                ", weight=" + getWeight() +
                ", maxSpeed=" + getMaxSpeed() +
                ", range=" + getRange() +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
