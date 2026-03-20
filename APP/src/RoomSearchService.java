import java.util.Map;


public class RoomSearchService {


    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Room Search\n");

        // Single Room
        if (availability.get("Single Room") > 0) {
            displayRoom(singleRoom, availability.get("Single Room"));
        }

        // Double Room
        if (availability.get("Double Room") > 0) {
            displayRoom(doubleRoom, availability.get("Double Room"));
        }

        // Suite Room
        if (availability.get("Suite Room") > 0) {
            displayRoom(suiteRoom, availability.get("Suite Room"));
        }
    }

    private void displayRoom(Room room, int available) {
        System.out.println(room.getType() + ":");
        System.out.println("Beds: " + room.getBeds());
        System.out.println("Size: " + room.getSize() + " sqft");
        System.out.println("Price per night: " + room.getPrice());
        System.out.println("Available: " + available);
        System.out.println();
    }
}