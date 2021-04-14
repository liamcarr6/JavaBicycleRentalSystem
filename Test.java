import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {


    public static void main(String[] args) {

        System.out.println("****Customer Records Created****\n");

        CustomerRecord cr = new CustomerRecord(new CustomerName("John", "Testman"),new GregorianCalendar(1982, Calendar.FEBRUARY, 11).getTime(), new Date(), false);
        CustomerRecord cr1 = new CustomerRecord(new CustomerName("Sarah", "TestWoman"), new GregorianCalendar(2012, Calendar.MARCH, 1).getTime(), new Date(), true);
        CustomerRecord cr2 = new CustomerRecord(new CustomerName("Barry", "Anderson"), new GregorianCalendar(1991, Calendar.DECEMBER, 15).getTime(), new Date(), true);
        CustomerRecord cr3 = new CustomerRecord(new CustomerName("Harry ","Potter"),new GregorianCalendar(1990, Calendar.DECEMBER, 26).getTime(),new Date(),true);

        System.out.println("Name: " + cr.getName());
        System.out.println("Date of Birth: " + cr.getDOB());
        System.out.println("Age: " + cr.getAge());
        System.out.println("Customer Number: " + cr.getNumber());
        System.out.println("Rented Bikes: " + cr.getRentedBike());
        System.out.println("Gold Class Member: " + cr.isGoldClass());
        System.out.println("Date of Issue: " + cr.getDOI());

        System.out.println("\nName: " + cr2.getName());
        System.out.println("Date of Birth: " + cr2.getDOB());
        System.out.println("Age: " + cr2.getAge());
        System.out.println("Customer Number: " + cr2.getNumber());
        System.out.println("Rented Bikes: " + cr2.getRentedBike());
        System.out.println("Gold Class Member: " + cr2.isGoldClass());
        System.out.println("Date of Issue: " + cr2.getDOI());

        System.out.println("\nName: " + cr3.getName());
        System.out.println("Date of Birth: " + cr3.getDOB());
        System.out.println("Age: " + cr3.getAge());
        System.out.println("Customer Number: " + cr3.getNumber());
        System.out.println("Rented Bikes: " + cr3.getRentedBike());
        System.out.println("Gold Class Member: " + cr3.isGoldClass());
        System.out.println("Date of Issue: " + cr3.getDOI());



        System.out.println("\n");
        System.out.println("****Bikes Created*****");
        System.out.println("\n");

        ElectricBike eb = new ElectricBike(new SerialNumber());

        System.out.println("Electric Bike1 Serial Number: " + eb.serialNumber());
        System.out.println("Battery Charge? "  + eb.isBatteryFull());
        System.out.println("Bike Currently Rented? "+ eb.isRented());

        RoadBike rb = new RoadBike(new SerialNumber());
        RoadBike rb2 = new RoadBike(new SerialNumber());

        System.out.println("\nRoad Bike1 Serial Number: " + rb.serialNumber());
        System.out.println("Road Bike2 Serial Number: " + rb2.serialNumber());



        RentalManager rental = new RentalManager();
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ELECTRIC_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));
        rental.addBike(BikeFactory.getInstance(BikeFactory.ROAD_BIKE));





        System.out.println("\n");
        System.out.println("****Bikes available to rent****");
        System.out.println("\n");
        System.out.println("Available electric rental bikes: " + rental.availableBikes(BikeFactory.ELECTRIC_BIKE));
        System.out.println("Available road rental bikes: " + rental.availableBikes(BikeFactory.ROAD_BIKE));
//
        System.out.println("Rented Bikes ");
        ArrayList<Bike> rentedBikes = rental.getRentedBikes();
        for (Bike b : rentedBikes) {
            System.out.println(b);

        }

//        rental.issueBike(cr, BikeFactory.ELECTRIC_BIKE);  // Exception thrown - Customer is not goldclass member and cannot rent electricbike
//        rental.issueBike(cr1, BikeFactory.ELECTRIC_BIKE); // Exception thrown - Customer is not aged 21 and cannot rent electricbike

        rental.issueBike(cr2, BikeFactory.ROAD_BIKE);
//        rental.issueBike(cr2,BikeFactory.ROAD_BIKE); // Exception thrown - Customer can only rent one bike at a time
        rental.issueBike(cr3, BikeFactory.ELECTRIC_BIKE);


        System.out.println("\n");
        System.out.println("****Available Bikes After Rental****");
        System.out.println("\n");

        System.out.println("Available electric rental bikes: " + rental.availableBikes(BikeFactory.ELECTRIC_BIKE));
        System.out.println("Available road rental bikes: " + rental.availableBikes(BikeFactory.ROAD_BIKE));

        System.out.println("\n");
        System.out.println("****List of Bikes Currently Rented Out*****");
        System.out.println("\n");

        System.out.println("List of Rented Bikes: ");
        rentedBikes = rental.getRentedBikes();
        for (Bike b : rentedBikes) {
            System.out.println(b);

        }

        System.out.println("\n");
        System.out.println("****Bikes Currently Rented Out*****");
        System.out.println("\n");

//
        System.out.println("Bike Rented to: " + cr2.getName() + "\n " + rental.getBike(cr2) + "\n") ;
        System.out.println("Bike Rented to: " + cr3.getName() + "\n " + rental.getBike(cr3));



        System.out.println("\n");
        System.out.println("****Cr2 Terminate Rental Test - Bike now*****");
        System.out.println("\n");


        System.out.println("Customers rented bike: \n" + cr2.getRentedBike());


        System.out.println("\nBike: \n");
        Bike b = rental.getBike(cr2);
        System.out.println(b);

        System.out.println("\n");
        System.out.println("****Bike After rental after Termination*****");
        System.out.println("\n");

        rental.terminateRental(cr2);
        System.out.println(b);
//
        System.out.println(rental.getBike(cr2));

        System.out.println("\n");
        System.out.println("****Cr2 After rental after Termination*****");
        System.out.println("\n");

        System.out.println("Name: " + cr2.getName() + "\nRented bike: " + cr2.getRentedBike());


        System.out.println("\n");
        System.out.println("****Bike Currently Rented to Cr3*****");
        System.out.println("\n");

//
        System.out.println("Name: " + cr3.getName());
        System.out.println("Date of Birth: " + cr3.getDOB());
        System.out.println("Age: " + cr3.getAge());
        System.out.println("Rented Bike: " + cr3.getRentedBike());



























    }

}
