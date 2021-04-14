public abstract class Bike implements BikeTemplate {

    /**

     Abstract Bike Class that implements serial number nd custoemr number from interface

     protected final for immutability and protected for defensive programming

     */

    protected final SerialNumber number;
    protected CustomerNumber customerNumber;


    /**
     *
     * @param customerNumber Setter for customer number
     */

    public void setCustomerNumber(CustomerNumber customerNumber) {
        this.customerNumber = customerNumber;
    }


    /**
     *
     * Bike constructor for Serial Number. Deep copying for defensive programming
     */

    public Bike(SerialNumber number) {
        this.number = new SerialNumber(number.getPart1(), number.getPart2());

    }

    /**
     *
     * @param type
     * @return Serial number and Customer number on seperate lines
     *
     * Abstract method to create Serial Number and Customer Number Strings
     *
     */

    public abstract boolean isBikeOfType (String type);
    public String toString () {
        return ("Serial Number " + number + "\nCustomer number " + customerNumber);

    }

}
