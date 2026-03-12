package app;

/**
 * Use Case 2 – Basic Room Types & Static Availability
 *
 * Demonstrates inheritance, abstraction and simple availability
 * variables before introducing data structures.
 *
 * @author Praneet
 * @version 2.1
 */
public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("      Book My Stay - Version 2.1     ");
        System.out.println("  Basic Room Types & Availability    ");
        System.out.println("=====================================");

        // Create room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Display room details
        System.out.println("\nRoom Details:\n");

        single.displayRoomDetails();
        System.out.println("Available Rooms: " + singleAvailable);
        System.out.println();

        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleAvailable);
        System.out.println();

        suite.displayRoomDetails();
        System.out.println("Available Rooms: " + suiteAvailable);
    }
}