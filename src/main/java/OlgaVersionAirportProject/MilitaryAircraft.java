package OlgaVersionAirportProject;

public class MilitaryAircraft extends Aircraft{
    public MilitaryAircraft(String typeOfAircraft, String model, int lifeTime,
                            int runwayLength, int length, int width, int height,
                            int cargoLength, int cargoWidth, int cargoHeight,
                            int maxRangeWithLoad, int ferryRange, int cruiseSpeed,
                            int maxSpeed, int maxTakeoffWeight, int maxPayload,
                            int maxFuelWeight, int passengerCapacity, int crewTeam) {
        super(TypeOfAircraft.valueOf(typeOfAircraft), model, lifeTime, runwayLength, length, width, height,
                cargoLength, cargoWidth, cargoHeight, maxRangeWithLoad, ferryRange,
                cruiseSpeed, maxSpeed, maxTakeoffWeight, maxPayload, maxFuelWeight,
                passengerCapacity, crewTeam);
    }

    @Override
    public String toString() {
        return "MilitaryAircraft{" +
                "typeOfAircraft='" + typeOfAircraft + '\'' +
                ", model='" + model + '\'' +
                ", runwayLength=" + runwayLength +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", cargoLength=" + cargoLength +
                ", cargoWidth=" + cargoWidth +
                ", cargoHeight=" + cargoHeight +
                ", maxRangeWithLoad=" + maxRangeWithLoad +
                ", ferryRange=" + ferryRange +
                ", cruiseSpeed=" + cruiseSpeed +
                ", maxSpeed=" + maxSpeed +
                ", maxTakeoffWeight=" + maxTakeoffWeight +
                ", maxPayload=" + maxPayload +
                ", maxFuelWeight=" + maxFuelWeight +
                ", passengerCapacity=" + passengerCapacity +
                ", crewTeam=" + crewTeam +
                '}';
    }
}
