package OlgaVersionAirportProject;

public class Aircraft { //для пассажирских, грузовых, частных и военных самолетов
    TypeOfAircraft typeOfAircraft;
    String model;

    int lifeTime; //Срок службы
    int runwayLength; //Длина взлётно-посадочной полосы
    int length; //
    int width;
    int  height;
    int cargoLength ;
    int cargoWidth; //Ширина грузового отсека
    int cargoHeight;
    int maxRangeWithLoad; //Дальность полета при максимальной нагрузке
    int ferryRange;  //Перегоночная дальность
    int cruiseSpeed; //Крейсерская скорость
    int maxSpeed;
    int maxTakeoffWeight; //Максимальный взлетный вес
    int maxPayload; //Максимальная полезная нагрузка
    int maxFuelWeight; //Максимальный вес топлива
    int passengerCapacity;  // вместимость
    int crewTeam;

    public Aircraft(TypeOfAircraft typeOfAircraft, String model,
                    int lifeTime, int runwayLength, int length,
                    int width, int height, int cargoLength,
                    int cargoWidth, int cargoHeight, int maxRangeWithLoad,
                    int ferryRange, int cruiseSpeed, int maxSpeed,
                    int maxTakeoffWeight, int maxPayload, int maxFuelWeight,
                    int passengerCapacity, int crewTeam)
    {
        this.typeOfAircraft = typeOfAircraft;
        this.model = model;
        this.lifeTime = lifeTime;
        this.runwayLength = runwayLength;
        this.length = length;
        this.width = width;
        this.height = height;
        this.cargoLength = cargoLength;
        this.cargoWidth = cargoWidth;
        this.cargoHeight = cargoHeight;
        this.maxRangeWithLoad = maxRangeWithLoad;
        this.ferryRange = this.ferryRange;
        this.cruiseSpeed = cruiseSpeed;
        this.maxSpeed = maxSpeed;
        this.maxTakeoffWeight = maxTakeoffWeight;
        this.maxPayload = maxPayload;
        this.maxFuelWeight = maxFuelWeight;
        this.passengerCapacity = passengerCapacity;
        this.crewTeam = crewTeam;
    }

    public Aircraft(String s, int i, int lifeTime, int runwayLength, int length, TypeOfAircraft typeOfAircraft) {
    }

    public TypeOfAircraft getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
        this.typeOfAircraft = TypeOfAircraft.valueOf(typeOfAircraft);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public int getRunwayLength() {
        return runwayLength;
    }

    public void setRunwayLength(int runwayLength) {
        this.runwayLength = runwayLength;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCargoLength() {
        return cargoLength;
    }

    public void setCargoLength(int cargoLength) {
        this.cargoLength = cargoLength;
    }

    public int getCargoWidth() {
        return cargoWidth;
    }

    public void setCargoWidth(int cargoWidth) {
        this.cargoWidth = cargoWidth;
    }

    public int getCargoHeight() {
        return cargoHeight;
    }

    public void setCargoHeight(int cargoHeight) {
        this.cargoHeight = cargoHeight;
    }

    public int getMaxRangeWithLoad() {
        return maxRangeWithLoad;
    }

    public void setMaxRangeWithLoad(int maxRangeWithLoad) {
        this.maxRangeWithLoad = maxRangeWithLoad;
    }

    public int getFerryRange() {
        return ferryRange;
    }

    public void setFerryRange(int ferryRange) {
        this.ferryRange = ferryRange;
    }

    public int getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(int cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxTakeoffWeight() {
        return maxTakeoffWeight;
    }

    public void setMaxTakeoffWeight(int maxTakeoffWeight) {
        this.maxTakeoffWeight = maxTakeoffWeight;
    }

    public int getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(int maxPayload) {
        this.maxPayload = maxPayload;
    }

    public int getMaxFuelWeight() {
        return maxFuelWeight;
    }

    public void setMaxFuelWeight(int maxFuelWeight) {
        this.maxFuelWeight = maxFuelWeight;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getCrewTeam() {
        return crewTeam;
    }

    public void setCrewTeam(int crewTeam) {
        this.crewTeam = crewTeam;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "typeOfAircraft='" + typeOfAircraft + '\'' +
                ", model='" + model + '\'' +
                ", lifeTime=" + lifeTime +
                ", runwayLength=" + runwayLength +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", cargoLength=" + cargoLength +
                ", cargoWidth=" + cargoWidth +
                ", cargoHeight=" + cargoHeight +
                ", maxRangeWithLoad=" + maxRangeWithLoad +
                ", rerryRange=" + ferryRange +
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
