public interface BikeTemplate {





    public SerialNumber serialNumber ();
    public boolean isBatteryFull ();

    /**
     * rechargeBattery used when electric bike is returned and battery will be recharged
     *
     */

    public void rechargeBattery();

    /**
     * isRented to check whether bike is rented
     *
     */

    public boolean isRented();

    /**
     * setBatteryLevel to set bike battery level after rent
     *
     */


    public void setBatteryLevel(boolean batteryLevel);

}
