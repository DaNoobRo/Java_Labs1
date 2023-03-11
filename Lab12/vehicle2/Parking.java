package Lab12.vehicle2;

import java.util.ArrayList;
import java.util.Collections;

public class Parking {

    ArrayList<Vehicle> parkedVehicles = new ArrayList<>();
    public void parkVehicle(Vehicle e){
        parkedVehicles.add(e);
    }

    /**
     * Sort vehicles by length.
     */
    public void sortByWeight(){
        Collections.sort(parkedVehicles);
    }

    public Vehicle get(int index){
        return parkedVehicles.get(index);
    }

}
