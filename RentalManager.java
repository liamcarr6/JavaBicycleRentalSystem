import java.util.ArrayList;

public class RentalManager {

    /**
     *
     * ArrayList acts as a list for the bikes
     */

    private ArrayList<Bike> bikeList;

    public RentalManager () {
        bikeList = new ArrayList<Bike>();
    }

    /**
     * Method for adding bikes to the Arraylist
     * @param typeOfBike
     * @return bikes b to bikeList
     */

    public int availableBikes(String typeOfBike) {
        int count = 0;
        for (Bike b : bikeList) {
            if (b.isBikeOfType(typeOfBike) && !b.isRented()) {
                count++;
            }
        }
        return count;
    }

    /**
     *
     * @return getRentedBikes
     * Adding bikes after bike is rented
     */

    public ArrayList<Bike> getRentedBikes() {
        ArrayList<Bike> rentedBikes = new ArrayList<Bike>();
        for (Bike b : bikeList) {
            if (b.isRented()) {
                rentedBikes.add(b);
            }
        }
        return rentedBikes;
    }

    /**
     *
     * @param customerRecord
     * @return getBike to customerRecord
     */


    public Bike getBike(CustomerRecord customerRecord) {
        return customerRecord.getRentedBike();
    }

    /**
     *
     * @param customerRecord
     * @param typeOfBike
     * @return issueBike
     *
     */

    public boolean issueBike(CustomerRecord customerRecord, String typeOfBike) {
        if (!customerRecord.isGoldClass() && typeOfBike.equalsIgnoreCase("Electricbike")) {
            throw new IllegalArgumentException("Customer must be a Gold Class member to rent and electric bike");
            /** if customer is goldclass and wants electric bike. If customer not gold class exception is thrown **/

        }
        if (customerRecord.getRentedBike() != null)
        {throw new IllegalArgumentException("Customers can only rent one bike at a time") ;}

        /** Check customer record, if customer already has a bike
         * @throws IllegalArgumentException
         * */

        if (customerRecord.getAge() >= 21) {
            for (Bike b : bikeList) {
                if (!b.isRented() && b.isBikeOfType(typeOfBike)) {
                    b.setCustomerNumber(customerRecord.getNumber());
                    customerRecord.setRentedBike(b);
                    b.setBatteryLevel(false);

                    return true;
                }

            }
        }
        return false;
    }
    /** if customer is >21 and wants electric bike. If customer not 21 years of age or over exception is thrown.
     * Battery level set to false after bike rented **/

    /**
     *
     * @param customerRecord
     * Method to terminate rental. customerRecord.getRentedBike set back to null and battery recharged
     * Bike customerNumber set to null
     */

    public void terminateRental(CustomerRecord customerRecord) {
        if (customerRecord.getRentedBike() == null) {
            return;
        }
        Bike b = customerRecord.getRentedBike();
        customerRecord.setRentedBike(null);
        b.setCustomerNumber(null);
        b.rechargeBattery();
    }


    /**
     *
     * @param bike
     * Method to create bike object. if statement to ensure that there are 10 electric bikes and 50 road bikes.
     * Adds bike back to bikelist.
     */

    public void addBike (Bike bike) {


        if (bike.isBikeOfType(BikeFactory.ELECTRIC_BIKE)) {
            if (getNumberOfBikeType(BikeFactory.ELECTRIC_BIKE) >= 10) {
                return;
            }
        } else if (bike.isBikeOfType(BikeFactory.ROAD_BIKE)) {
            if (getNumberOfBikeType(BikeFactory.ROAD_BIKE) >= 50) {
                return;
            }
        }

        bikeList.add(bike);


    }

    /**
     *
     * @param type
     * @returnnumber of types of bike back to bikelist
     */

    private int getNumberOfBikeType (String type) {
        int count = 0;
        for (Bike b: bikeList) {
            if (b.isBikeOfType(type)) {count++;}


        } return count;
    }


}


