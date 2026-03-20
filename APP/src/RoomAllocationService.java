import java.util.*;

/**
 * CLASS - RoomAllocationService
 * Use Case 6: Reservation Confirmation & Room Allocation
 */
public class RoomAllocationService {

    // Stores all allocated room IDs (global uniqueness)
    private Set<String> allocatedRoomIds;

    // Stores assigned room IDs by room type
    private Map<String, Set<String>> assignedRoomsByType;

    public RoomAllocationService() {
        allocatedRoomIds = new HashSet<>();
        assignedRoomsByType = new HashMap<>();
    }

    /**
     * Allocates room and confirms booking
     */
    public void allocateRoom(Reservation reservation, RoomInventory inventory) {

        String roomType = reservation.getRoomType();

        // Get current availability
        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (!availability.containsKey(roomType) || availability.get(roomType) <= 0) {
            System.out.println("No rooms available for " + reservation.getGuestName());
            return;
        }

        // Generate unique room ID
        String roomId = generateRoomId(roomType);

        // Store globally
        allocatedRoomIds.add(roomId);

        // Store by type
        assignedRoomsByType
                .computeIfAbsent(roomType, k -> new HashSet<>())
                .add(roomId);

        // Decrease inventory
        inventory.updateAvailability(roomType, availability.get(roomType) - 1);

        // Confirmation message
        System.out.println("Booking confirmed for Guest: "
                + reservation.getGuestName()
                + ", Room ID: "
                + roomId);
    }

    /**
     * Generate unique room ID
     */
    private String generateRoomId(String roomType) {

        int count = 1;
        String roomId;

        do {
            roomId = roomType + "-" + count;
            count++;
        } while (allocatedRoomIds.contains(roomId));

        return roomId;
    }
}