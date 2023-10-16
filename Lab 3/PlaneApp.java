package Lab3;
import java.util.Scanner;

public class PlaneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("(1)Show number of empty seats\n"
						+ "(2)Show the list of empty seats\n"
						+ "(3)Show the list of seat assignments by seat ID\n"
						+ "(4)Show the list of seat assignments by customer ID\n"
						+ "(5)Assign a customer to a seat\n"
						+ "(6)Remove a seat assignment\n" + "(7) Exit");
		
		Scanner sc = new Scanner(System.in);
		int userChoice, userSeatId, userCustId;
		Plane plane = new Plane();
		
		do {
			System.out.print("Enter a number of your choice: ");
			userChoice = sc.nextInt();
			switch (userChoice) {
			case 1:
				plane.showNumEmptySeats();
				break;
			case 2:
				plane.showEmptySeats();
				break;
			case 3:
				plane.showAssignedSeats(true);
				break;
			case 4:
				plane.showAssignedSeats(false);
				break;
			case 5:
				System.out.println("Assigning Seat ..");
				System.out.print("Please enter SeatID: ");
				userSeatId = sc.nextInt();
				System.out.print("Please enter Customer ID: ");
				userCustId = sc.nextInt();
				plane.assignSeat(userSeatId, userCustId);
				break;
			case 6:
				System.out.print("Enter SeatID to unassign customer from: ");
				userSeatId = sc.nextInt();
				plane.unAssignSeat(userSeatId);
				System.out.println("Seat Unassigned!");
				break;
			case 7:
				return;
			default:
				System.out.println("Invalid input");
			}
		} while (userChoice != 7);
		
	}

}
