package OlgaVersionAirportProject;

public class PassangerFlights implements FlightDescribtion {
    private int weight;
    private int capacity;
    private int range;
    private int tankVolume;
    private String model;
    private AirFlightType airFlightType;

    public PassangerFlights(int weight, int capacity, int range, int tankVolume, String model, AirFlightType airFlightType) {
        this.weight = weight;
        this.capacity = capacity;
        this.range = range;
        this.tankVolume = tankVolume;
        this.model = model;
        this.airFlightType = airFlightType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public AirFlightType getAirFlightType() {
        return airFlightType;
    }

    public void setAirFlightType(AirFlightType airFlightType) {
        this.airFlightType = airFlightType;
    }

    @Override
    public String toString() {
        return "PassangerFlights{" +
                "weight=" + weight +
                ", capacity=" + capacity +
                ", range=" + range +
                ", tankVolume=" + tankVolume +
                ", model='" + model + '\'' +
                ", airFlightType=" + airFlightType +
                '}';
    }
}
