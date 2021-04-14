/**
 *
 * Bike factory to instantiate unique instance of object
 *
 */

public class BikeFactory {

    public static final String ROAD_BIKE = "roadbike";
    public static final String ELECTRIC_BIKE = "electricbike";

    public static Bike getInstance(String typeOfBike) {

        if (typeOfBike.equalsIgnoreCase(ROAD_BIKE)) {
            return new RoadBike(new SerialNumber());            /** If statement to create relevant object with serial number */
        } else if (typeOfBike.equalsIgnoreCase(ELECTRIC_BIKE)) {
            return new ElectricBike(new SerialNumber());
        }
        throw new IllegalArgumentException("Invalid Bike Type"); /** @throws IllegalArgumentException if biketype is not valid*/


    }


}

