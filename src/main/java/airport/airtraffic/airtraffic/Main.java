package airport.airtraffic.airtraffic;

public class Main {
    public static void main(String[] args) {
        Aircraft boeing747 = new Aircraft("747", "Пассажирский", 416, 987000, 913, 7240);

        Flight flight1 = new Flight("ABC123", false, false, boeing747);

        FlightScheduleSystem scheduleSystem = new FlightScheduleSystem();

        scheduleSystem.addFlight(flight1);

        Aircraft aircraftOnFlight = scheduleSystem.getFlight().get(0).getAircraft();

        System.out.println("Модель самолета: " + aircraftOnFlight.getModel());
        System.out.println("Тип самолета: " + aircraftOnFlight.getTypeOfAircraft());
        System.out.println("Вместимость: " + aircraftOnFlight.getCapacity() + " пассажиров");
        System.out.println("Вес: " + aircraftOnFlight.getWeight() + " кг");
        System.out.println("Максимальная скорость: " + aircraftOnFlight.getMaxSpeed() + " км/ч");
        System.out.println("Дальность полета: " + aircraftOnFlight.getRange() + " км");
    }
}