public class CustomerNumber {

    /**
     *
     * variables serperated into parts to create unique customer number
     */

    private String part1;
    private int part2;
    private int part3;
    private static int NumberGenerator = 10;

    /**
     *
     *
     * @param part1 first part of CustomerNumber
     * @param part2 second part of CustomerNumber
     *
     *
     */

    public CustomerNumber(String part1, int part2) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = NumberGenerator++; /** NumberGenerator increasing incrementally to provide uniqueness of CustomerNumber  */
    }

    /**
     *
     * @return part1-part2-part3
     *
     * toString to merge CustomerNumber together
     */

    @Override
    public String toString  () {
        return part1 + "-" + part2 + "-" + part3;
    }
}
