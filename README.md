# smart-parking-system-for-central-university-of-kashmir
smart parking system for central university of kashmir
This code implements a basic Parking Lot Management System in Java, allowing users to park cars and view the current status of the parking lot. It manages two types of users: students and staff, with a special condition that restricts parking access to students when the lot reaches 50% capacity. Here’s a breakdown of the code:

Class: ParkingLot
This class simulates a parking lot with a limited number of parking slots and contains the core methods and attributes needed for managing parking.

Attributes:
TOTAL_SLOTS: A constant representing the total number of parking slots available (set to 20).
occupiedSlots: A variable that tracks the number of currently occupied slots.
isFull: A boolean flag indicating whether the parking lot is full.
Constructor:
ParkingLot(): Initializes occupiedSlots to 0 and isFull to false.
Methods:
parkCar(boolean isStudent):

Takes a boolean parameter isStudent, which is true if the user is a student and false if the user is a staff member.
If the parking lot is at or over 50% capacity (i.e., 10 slots filled out of 20), it restricts additional parking for students by printing a message and returning false.
If there are available slots, it increments occupiedSlots.
If occupiedSlots equals TOTAL_SLOTS, the parking lot is marked as full (isFull is set to true).
Returns true if parking is successful; otherwise, it prints a message indicating that the lot is full and returns false.
displayStatus():

Prints the current status of the parking lot: the number of occupied slots and available slots.
If the lot is at or over 50% capacity, it notifies that parking for students is restricted.
Main Method
The main method simulates an interactive command-line interface for the parking lot system.

Setup:

Instantiates the ParkingLot class.
Initializes a Scanner to read user input.
Loop:

Continuously displays the parking lot status.
Prompts the user for commands (park to park a car or exit to quit).
If the command is park, it prompts for user type (student or staff), then:
Calls parkCar() with the appropriate flag based on user type.
Displays a success or failure message based on whether parking was successful.
If the command is exit, the loop breaks, ending the program.
If an invalid command is entered, it prompts the user to try again.
Exit:

Closes the Scanner after the loop ends to free up resources.
Summary of Behavior
Staff can park at any time as long as slots are available.
Students are restricted from parking once 50% of slots are occupied.
The program provides feedback on parking availability and usage.
