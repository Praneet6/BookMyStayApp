import java.util.*;

/**
 * CLASS - Reservation
 * Represents a confirmed booking
 */
class Reservation {

    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }
}

/**
 * CLASS - BookingHistory
 * Stores confirmed reservations
 */
class BookingHistory {

    private List<Reservation> confirmedReservations;

    public BookingHistory() {
        confirmedReservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        confirmedReservations.add(reservation);
    }

    public List<Reservation> getConfirmedReservations() {
        return confirmedReservations;
    }
}

/**
 * CLASS - BookingReportService
 * Generates reports from history
 */
class BookingReportService {

    public void generateReport(BookingHistory history) {

        System.out.println("\nBooking History Report");

        List<Reservation> list = history.getConfirmedReservations();

        if (list.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        for (Reservation r : list) {
            System.out.println(
                    "Guest: " + r.getGuestName() +
                            ", Room Type: " + r.getRoomType()
            );
        }
    }
}

/**
 * MAIN CLASS
 * Use Case 8: Booking History & Reporting
 */
public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        System.out.println("===== Booking History and Reporting =====");

        BookingHistory history = new BookingHistory();
        BookingReportService reportService = new BookingReportService();

        // Simulating confirmed bookings (from UC6)
        history.addReservation(new Reservation("Abhi", "Single"));
        history.addReservation(new Reservation("Subha", "Double"));

        // Generate report
        reportService.generateReport(history);
    }
}