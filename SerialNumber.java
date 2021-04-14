public class SerialNumber {


    /**
     * Private fields for defensive programming
     */

    private static int NumberGenerator = 200;

    private String part1;
    private int part2;


    /**
     *
     * @return part1 and part2 of Serial Number
     */

    public String getPart1() {
        return part1;
    }

    public int getPart2() {
        return part2;
    }


    /**
     * Serial number incrementing to ensure uniqueness
     */

    public SerialNumber() {

        this.part1 = "BK";
        this.part2 = NumberGenerator++;

    }

    /**
     *

     * @param part1
     * @param part2
     *
     * Defensive copying for immutability
     */

    public SerialNumber (String part1, int part2) {
        this.part1 = part1;
        this.part2 = part2;
    }

    /**
     *
     * @return part 1 + part2 to override toString method and create Serial Number
     */


@Override
    public String toString (){
        return part1 + part2;
    }

}
