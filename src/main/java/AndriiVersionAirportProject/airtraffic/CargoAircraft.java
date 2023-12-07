package AndriiVersionAirportProject.airtraffic;

import airport.airtraffic.airtraffic.Aircraft;

public class CargoAircraft extends Aircraft {
    private double cargoCapacity;

    public CargoAircraft(String model, String typeOfAircraft, int capacity, double weight, double maxSpeed, double range, double cargoCapacity) {
        super(model, typeOfAircraft, capacity, weight, maxSpeed, range);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public String toString() {
        return "CargoAircraft{" +
                "model='" + getModel() + '\'' +
                ", type=" + getTypeOfAircraft() +
                ", capacity=" + getCapacity() +
                ", weight=" + getWeight() +
                ", maxSpeed=" + getMaxSpeed() +
                ", range=" + getRange() +
                ", cargoCapacity=" + cargoCapacity +
                '}';
    }
}