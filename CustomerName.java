

public class CustomerName {

    /**
     * private final fields for immutability reasons
     */

    private final String firstName;
    private final String lastName;

    /**
     * Constructor for CustomerName
     */

    public CustomerName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Getters to return firstName and lastName
     */

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * toString method to concatonate firstName and lastName
     *
     * @return firstName lastName
     */

    @Override
    public final String toString() {
        return firstName + " " + lastName;

    }
}


