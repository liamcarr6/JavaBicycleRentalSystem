import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import java.util.Date;
import java.util.Calendar;


public class CustomerRecord {

    /**
     * Fields made private for defensive programming
     *
     */

    private CustomerName name;
    private final Date DOB;    /** private final to make immutable */
    private CustomerNumber number;
    private final Date DOI; /** private final to make immutable */
    private boolean goldClass;
    private Bike rentedBike;

    /**
     *  Constructor for CustomerRecord. Defensive copies for name, DOB, DOI
     *
     * @param name object for customers name
     * @param DOB object for customers Date of Birth
     * @param DOI object for Date of Issue
     * @param goldClass object for whether customer is gold glass or not as boolean
     *
     *  No defensive copies for goldclass as can be changed and rentedBike as null
     */

    public CustomerRecord(CustomerName name, Date DOB, Date DOI, boolean goldClass) {
        this.name = new CustomerName(name.getFirstName(),name.getLastName());
        this.DOB = new Date(DOB.getTime());
        this.DOI = new Date(DOI.getTime());
        this.goldClass = goldClass;
        this.rentedBike = null;
        this.generateCustomerNumber();
    }

    /**
     *
     * @return CustomerName with defensive copy
     */

    public CustomerName getName() {
        return new CustomerName(this.name.getFirstName(), this.name.getLastName());

    }

    /**
     *
     * @return DOB with defensive copy
     */
    public Date getDOB() {
        return new Date(this.DOB.getTime());
    }


    public CustomerNumber getNumber() {
        return number;
    }

    /**
     *
     * @return DOI with defensive copy
     */

    public Date getDOI() {
        return new Date(this.DOI.getTime());
    }

    /**
     *
     * @return goldClass
     */

    public boolean isGoldClass() {
        return goldClass;
    }

    /**
     *
     * @return rentedBike
     */

    public Bike getRentedBike() {
        return rentedBike;
    }

    /**
     *
     *
     * @param rentedBike setter for RentedBike as null
     */

    public void setRentedBike(Bike rentedBike) {
        this.rentedBike = rentedBike;
    }


    /**
     *
     * Method for generating unique CustomerNumber. Append the first two charachters from getFirstName and getLastName and year from DOI.
     * Printed as a string in CustomerNumber
     */

    private void generateCustomerNumber (){


        String fname = name.getFirstName();
        String lname = name.getLastName();
        String part1 = new String (new StringBuilder().append(fname.charAt(0)).append(lname.charAt(0)));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime( getDOI() );
        number = new CustomerNumber(part1, calendar.get(Calendar.YEAR));



    }

    /**
     *
     * Method to calculate age of customer
     *
     * @return Age of customer
     */


    public int getAge() {

        LocalDate dob = LocalDate.ofInstant(getDOB().toInstant(), ZoneId.systemDefault());
        LocalDate now = LocalDate.now();
        Period period = Period.between(dob, now);
        return period.getYears();

}
}


