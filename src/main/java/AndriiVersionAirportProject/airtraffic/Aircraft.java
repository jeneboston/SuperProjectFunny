package AndriiVersionAirportProject.airtraffic;

public class Aircraft {
    private String model;
    private String typeOfAircraft;
    private int capacity;
    private double weight;
    private double maxSpeed;
    private double range;

    public Aircraft(String model, String typeOfAircraft, int capacity, double weight, double maxSpeed, double range) {
        this.model = model;
        this.typeOfAircraft = typeOfAircraft;
        this.capacity = capacity;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.range = range;
    }

    public String getModel() {
        return model;
    }

    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getRange() {
        return range;
    }

    //TODO Create database for any aircrafts
}
