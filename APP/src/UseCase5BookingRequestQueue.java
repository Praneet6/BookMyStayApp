/**
 * MAIN CLASS - UseCase5BookingRequestQueue
 * Use Case 5: Booking Request (First-Come-First-Served)
 */
public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        System.out.println("Booking Request Queue");

        // Initialize queue
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Create requests
        Reservation r1 = new Reservation("Abhi", "Single");
        Reservation r2 = new Reservation("Subha", "Double");
        Reservation r3 = new Reservation("Vanmathi", "Suite");

        // Add to queue
        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        // Process requests (FIFO)
        while (bookingQueue.hasPendingRequests()) {
            Reservation r = bookingQueue.getNextRequest();

            System.out.println(
                    "Processing booking for Guest: " +
                            r.getGuestName() +
                            ", Room Type: " +
                            r.getRoomType()
            );
        }
    }
}