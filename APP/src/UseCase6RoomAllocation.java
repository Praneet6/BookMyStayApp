/**
 * MAIN CLASS - UseCase6RoomAllocation
 */
public class UseCase6RoomAllocation {

    public static void main(String[] args) {

        System.out.println("Room Allocation Processing");

        // Inventory
        RoomInventory inventory = new RoomInventory();

        // Booking queue
        BookingRequestQueue queue = new BookingRequestQueue();

        // Add requests
        queue.addRequest(new Reservation("Abhi", "Single Room"));
        queue.addRequest(new Reservation("Subha", "Single Room"));
        queue.addRequest(new Reservation("Vanmathi", "Suite Room"));

        // Allocation service
        RoomAllocationService allocationService = new RoomAllocationService();

        // Process FIFO
        while (queue.hasPendingRequests()) {
            Reservation r = queue.getNextRequest();
            allocationService.allocateRoom(r, inventory);
        }
    }
}