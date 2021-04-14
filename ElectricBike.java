public class ElectricBike extends Bike {

    /**
     * ElectricBike as subclass of Bike
     *
     * private boolean batteryLevel in order to change battery level of bike
     *
     */

    private boolean batteryLevel;

    /**
     *
     * @return serialNumber including defensive copy for immutability
     *
     */

    @Override
    public SerialNumber serialNumber() {
        return new SerialNumber(this.number.getPart1(), this.number.getPart2());
    }

    /**
     * Method for isBatteryFull
     * @return Overidden methods returns whether battery is full or not as a boolean
     */

    @Override
    public boolean isBatteryFull() {
        return batteryLevel;
    }

    /**
     * Method for recharcheBatter
     * @return Overidden methods returns battery level to full as a boolean
     * */

    @Override
    public void rechargeBattery() {
        batteryLevel = true;

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
    public ElectricBike(SerialNumber number) {
        super(number);
        this.batteryLevel = true;

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

    public boolean isBikeOfType (String type){
        return type.equalsIgnoreCase("electricbike");

    }

    /**
     *
     * @return Override toString method
     */

    @Override
    public String toString() {
        return super.toString() + "\nBattery Level " + batteryLevel;
    }

    /**
     *
     * @param batteryLevel as a boolean
     *                     Setter for BatteryLevel
     *
     */

    public void setBatteryLevel (boolean batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}


