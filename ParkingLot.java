import java.util.Scanner;

public class ParkingLot {
    private static final int TOTAL_SLOTS = 20;
    private int occupiedSlots;
    private boolean isFull;

    public ParkingLot() {
        this.occupiedSlots = 0;
        this.isFull = false;
    }

    public boolean parkCar(boolean isStudent) {
        if (isStudent && occupiedSlots >= TOTAL_SLOTS / 2) {
            System.out.println("Parking is at 50% capacity. No more parking allowed for students.");
            return false;
        }

        if (occupiedSlots < TOTAL_SLOTS) {
            occupiedSlots++;
            if (occupiedSlots == TOTAL_SLOTS) {
                isFull = true;
            }
            return true;
        } else {
            System.out.println("Parking lot is full.");
            return false;
        }
    }

    public void displayStatus() {
        System.out.println("Occupied slots: " + occupiedSlots);
        System.out.println("Available slots: " + (TOTAL_SLOTS - occupiedSlots));
        if (occupiedSlots >= TOTAL_SLOTS / 2) {
            System.out.println("Parking is at 50% capacity. No more parking allowed for students.");
        }
    }

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Parking Lot Management System!");

        while (true) {
            parkingLot.displayStatus();
            System.out.print("Enter 'park' to park a car, or 'exit' to quit: ");
            command = scanner.nextLine().trim().toLowerCase();

            if (command.equals("exit")) {
                System.out.println("Exiting the parking lot management system. Goodbye!");
                break;
            } else if (command.equals("park")) {
                System.out.print("Enter 'student' if you are a student, or 'staff' if you are a staff member: ");
                String userType = scanner.nextLine().trim().toLowerCase();
                boolean isStudent = userType.equals("student");

                if (parkingLot.parkCar(isStudent)) {
                    System.out.println("Car parked successfully.");
                } else {
                    System.out.println("Unable to park car. Please try again later.");
                }
            } else {
                System.out.println("Invalid command. Please enter 'park' or 'exit'.");
            }
        }

        scanner.close();
    }
}
