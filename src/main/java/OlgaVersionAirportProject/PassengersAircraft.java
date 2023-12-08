package OlgaVersionAirportProject;

public class PassengersAircraft extends Aircraft {


    public PassengersAircraft(String typeOfAircraft, String model,
                              int lifeTime, int runwayLength, int length,
                              int width, int height, int cargoLength,
                              int cargoWidth, int cargoHeight, int maxRangeWithLoad,
                              int ferryRange, int cruiseSpeed, int maxSpeed,
                              int maxTakeoffWeight, int maxPayload, int maxFuelWeight,
                              int passengerCapacity, int crewTeam) {
        super(TypeOfAircraft.valueOf(typeOfAircraft), model, lifeTime, runwayLength, length, width, height,
                cargoLength, cargoWidth, cargoHeight, maxRangeWithLoad, ferryRange,
                cruiseSpeed, maxSpeed, maxTakeoffWeight, maxPayload, maxFuelWeight,
                passengerCapacity, crewTeam);
    }

    @Override
    public String toString() {
        return "PassengersAircraft{" +
                "typeOfAircraft='" + typeOfAircraft + '\'' +
                ", model='" + model + '\'' +
                ", runwayLength=" + runwayLength +
                ", cargoLength=" + cargoLength +
                ", cargoWidth=" + cargoWidth +
                ", cargoHeight=" + cargoHeight +
                ", maxRangeWithLoad=" + maxRangeWithLoad +
                ", cruiseSpeed=" + cruiseSpeed +
                ", maxTakeoffWeight=" + maxTakeoffWeight +
                ", maxPayload=" + maxPayload +
                ", maxFuelWeight=" + maxFuelWeight +
                ", passengerCapacity=" + passengerCapacity +
                ", crewTeam=" + crewTeam +
                '}';
    }
}
