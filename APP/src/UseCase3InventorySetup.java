import java.util.Map;

public class UseCase3InventorySetup {

    /**
     * Application entry point.
     */
    public static void main(String[] args) {

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Create room objects
        Room single = new Room("Single Room", 1, 250, 1500.0);
        Room doubleRoom = new Room("Double Room", 2, 400, 2500.0);
        Room suite = new Room("Suite Room", 3, 750, 5000.0);

        // Get availability map
        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Hotel Room Inventory Status\n");

        displayRoom(single, availability.get(single.getType()));
        displayRoom(doubleRoom, availability.get(doubleRoom.getType()));
        displayRoom(suite, availability.get(suite.getType()));
    }

    public static void displayRoom(Room room, int available) {
        System.out.println(room.getType() + ":");
        System.out.println("Beds: " + room.getBeds());
        System.out.println("Size: " + room.getSize() + " sqft");
        System.out.println("Price per night: " + room.getPrice());
        System.out.println("Available Rooms: " + available);
        System.out.println();
    }
}