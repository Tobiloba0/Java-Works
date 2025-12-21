import java.util.Scanner;

public class MiniParkingSystem {
    public static void main(String[] args) {
        final int TOTAL_SLOTS = 20;
        int[] parkingSlots = new int[TOTAL_SLOTS]; // 0 = empty, 1 = occupied
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Car Enter\n2. Car Leave\n3. Display Parking\n4. Exit");
            System.out.print("Choose an action: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    carEnter(parkingSlots);
                    displayParking(parkingSlots);
                    break;
                case "2":
                    carLeave(parkingSlots, scanner);
                    displayParking(parkingSlots);
                    break;
                case "3":
                    displayParking(parkingSlots);
                    break;
                case "4":
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void displayParking(int[] parkingSlots) {
        System.out.println("\nParking Lot Status:");
        int available = 0;
        int occupied = 0;
        for (int i = 0; i < parkingSlots.length; i++) {
            String status = parkingSlots[i] == 0 ? "Empty" : "Occupied";
            System.out.println("Slot " + (i + 1) + ": " + status);
            if (parkingSlots[i] == 0) available++;
            else occupied++;
        }
        System.out.println("Available slots: " + available + ", Occupied slots: " + occupied + "\n");
    }

    public static void carEnter(int[] parkingSlots) {
        for (int i = 0; i < parkingSlots.length; i++) {
            if (parkingSlots[i] == 0) {
                parkingSlots[i] = 1;
                System.out.println("Car parked at slot " + (i + 1));
                return;
            }
        }
        System.out.println("Parking full! No available slots.");
    }

    public static void carLeave(int[] parkingSlots, Scanner scanner) {
        System.out.print("Enter slot number to leave (1-20): ");
        if (scanner.hasNextInt()) {
            int slotNumber = scanner.nextInt();
            scanner.nextLine(); // consume newline
            if (slotNumber >= 1 && slotNumber <= parkingSlots.length) {
                if (parkingSlots[slotNumber - 1] == 1) {
                    parkingSlots[slotNumber - 1] = 0;
                    System.out.println("Slot " + slotNumber + " is now free.");
                } else {
                    System.out.println("Slot is already empty.");
                }
            } else {
                System.out.println("Invalid slot number.");
            }
        } else {
            System.out.println("Invalid input, enter a number.");
            scanner.nextLine(); // clear invalid input
        }
    }
}

