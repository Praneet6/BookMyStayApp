import java.util.*;

/**
 * CLASS - Service
 * Use Case 7: Add-On Service Selection
 */
class Service {

    private String serviceName;
    private double cost;

    public Service(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getCost() {
        return cost;
    }
}

/**
 * CLASS - AddOnServiceManager
 * Manages services for each reservation
 */
class AddOnServiceManager {

    // Map<ReservationId, List of Services>
    private Map<String, List<Service>> servicesByReservation;

    public AddOnServiceManager() {
        servicesByReservation = new HashMap<>();
    }

    // Add service to a reservation
    public void addService(String reservationId, Service service) {

        // If reservation not present, create new list
        servicesByReservation.putIfAbsent(reservationId, new ArrayList<>());

        // Add service
        servicesByReservation.get(reservationId).add(service);

        System.out.println(service.getServiceName() + " added to " + reservationId);
    }

    // Calculate total cost
    public double calculateTotalServiceCost(String reservationId) {

        double total = 0;

        List<Service> services = servicesByReservation.get(reservationId);

        if (services != null) {
            for (Service s : services) {
                total += s.getCost();
            }
        }

        return total;
    }

    // Display services (optional but useful)
    public void displayServices(String reservationId) {

        List<Service> services = servicesByReservation.get(reservationId);

        if (services == null || services.isEmpty()) {
            System.out.println("No add-on services selected.");
            return;
        }

        System.out.println("\nServices for " + reservationId + ":");
        for (Service s : services) {
            System.out.println("- " + s.getServiceName() + " (₹" + s.getCost() + ")");
        }
    }
}

/**
 * MAIN CLASS
 * Use Case 7: Add-On Service Selection
 */
public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddOnServiceManager manager = new AddOnServiceManager();

        System.out.println("===== Add-On Service Selection =====");

        // Simulated confirmed reservation
        System.out.print("Enter Reservation ID: ");
        String reservationId = sc.nextLine();

        while (true) {
            System.out.println("\n1. Add Breakfast (₹500)");
            System.out.println("2. Add Spa (₹1000)");
            System.out.println("3. Add Airport Pickup (₹800)");
            System.out.println("4. View Total Cost");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    manager.addService(reservationId, new Service("Breakfast", 500));
                    break;

                case 2:
                    manager.addService(reservationId, new Service("Spa", 1000));
                    break;

                case 3:
                    manager.addService(reservationId, new Service("Airport Pickup", 800));
                    break;

                case 4:
                    manager.displayServices(reservationId);
                    double total = manager.calculateTotalServiceCost(reservationId);
                    System.out.println("\nTotal Add-On Cost: " + total);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}