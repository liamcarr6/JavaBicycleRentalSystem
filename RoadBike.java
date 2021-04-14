public final class RoadBike extends Bike {


    /**
     *
     * @return serialNumber
     * Deep copy to ensure defensive programming
     */

    @Override
    public SerialNumber serialNumber() {
        return new SerialNumber(this.number.getPart1(), this.number.getPart2());
    }

    /**
     *
     * @return false for is BatteryFull because it is a RoadBike
     */
    @Override
    public boolean isBatteryFull() {
        return false;
    }

    /**
     * Override rechargeBattery
     * no return value because RoadBike batterys do not need to be recharged
     *
     */

    @Override
    public void rechargeBattery() {

    }

    /**
     *
     * @return isRented as null - set bike as not rented untill a customer rents it
     */

    @Override
    public boolean isRented() {
        return customerNumber != null;
    }

    /**
     *
     * @param number called from the Super Class
     *
     */

    public RoadBike(SerialNumber number) {
        super (number);

    }

    /**
     *
     * @param customerNumber Setter for customer number
     */

    public void setCustomerNumber(CustomerNumber customerNumber) {
        this.customerNumber = customerNumber;
    }

    /**
     *
     * @param type to return correct type
     * @return allows for the issuing of electricbike
     */


    @Override
    public boolean isBikeOfType (String type){
        return type.equalsIgnoreCase("Roadbike");

    }

    /**
     *
     * @param batteryLevel
     * No return value as BatteryLevel does not need to be set for RoadBike
     */

    public void setBatteryLevel (boolean batteryLevel) {

    }


}
