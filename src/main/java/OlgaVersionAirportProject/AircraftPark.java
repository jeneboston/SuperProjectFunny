package OlgaVersionAirportProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AircraftPark {
        private List<Aircraft> allAircrafts;
        private Map<TypeOfAircraft, List<Aircraft>> categorizedAircrafts;

        public AircraftPark() {
            this.allAircrafts = new ArrayList<>();
            this.categorizedAircrafts = new HashMap<>();
            initializeCategorizedAircraftMap();
        }

        private void initializeCategorizedAircraftMap() {
            for (TypeOfAircraft type : TypeOfAircraft.values()) {
                categorizedAircrafts.put(type, new ArrayList<>());
            }
        }
        public void addAircraft (Aircraft aircraft){
            allAircrafts.add(aircraft);
            categorizedAircrafts.get(aircraft.typeOfAircraft).add(aircraft);
        }

        public void removeAircraft (Aircraft aircraft){
        allAircrafts.remove(aircraft);
        categorizedAircrafts.get(aircraft.typeOfAircraft).remove(aircraft);
        }
        public List<Aircraft>getAllAircrafts(TypeOfAircraft typeOfAircraft){
            return categorizedAircrafts.get(typeOfAircraft);
        }

    public Map<TypeOfAircraft, List<Aircraft>> getCategorizedAircrafts() {
        return categorizedAircrafts;
    }
}