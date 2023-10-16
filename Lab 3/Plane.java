package Lab3;

public class Plane {
	private PlaneSeat[] seat;
	private static int numEmptySeat;
	public static final int MAX_SEATS = 12;
	
	public Plane() {
		numEmptySeat = MAX_SEATS;
		seat = new PlaneSeat[12];
		for (int i=0; i<seat.length; i++) {
			seat [i] = new PlaneSeat(i+1);
		}
	}
	
	private PlaneSeat[] sortSeats() {
		PlaneSeat [] copySeat = new PlaneSeat[MAX_SEATS-numEmptySeat];
		int smallestNum;
		int floor = -1;
		int position = 0;
		int copySeatTracker = 0;
		while (copySeatTracker < (MAX_SEATS-numEmptySeat)) {
			//Find the smallest in the array
			smallestNum = 1000000;
			for (int i=0; i<seat.length; i++) {
				if (seat[i].isOccupied()) {
					if (seat[i].getCustomerID() < smallestNum & seat[i].getCustomerID() > floor) {
						smallestNum = seat[i].getCustomerID();
						position = i;
					}
				}
			}
			floor = smallestNum;
			//Add it into the new array
			copySeat[copySeatTracker] = new PlaneSeat(position+1);
			copySeat[copySeatTracker].assign(seat[position].getCustomerID());
			copySeatTracker++;
		}
		return copySeat;
	}
	
	//DONE
	public void showNumEmptySeats() {
		System.out.println("There are " + numEmptySeat + " empty seats");
	}
	
	//DONE
	public void showEmptySeats() {
		//Method to display the list of empty seats
		System.out.println("The following seats are empty:");
		for (int i=0; i<seat.length; i++) {
			if (!seat[i].isOccupied()) {
				System.out.println("SeatID " + seat[i].getSeatID());
			}
		}
	}
	
	public void showAssignedSeats(boolean bySeatId) {
		//By seat ID - no need to use sortSeats()
		System.out.println("The seat assignments are as follow: ");
		if (bySeatId) {
			for (int i=0; i<seat.length; i++) {
				if (seat[i].isOccupied()) {
					System.out.printf("SeatID %d assigned to CustomerID %d\n", seat[i].getSeatID(), seat[i].getCustomerID()); 
				}
			}
		} else {
			PlaneSeat [] copySeat = sortSeats();
			for (int i=0; i<copySeat.length; i++) {
				if (copySeat[i].isOccupied()) {
					System.out.printf("SeatID %d assigned to CustomerID %d\n", copySeat[i].getSeatID(), copySeat[i].getCustomerID()); 
				}
			}
		}
	}
	
	//DONE
	public void assignSeat(int seatId, int cust_id) {
		//Assign a customer id to an empty seat
		if (seat[seatId-1].isOccupied()) {
			System.out.println("Seat already assigned to a customer.");
		} else {
			seat[seatId-1].assign(cust_id);
			numEmptySeat--;
			System.out.println("Seat Assigned!");
		}
	}
	
	//DONE
	public void unAssignSeat(int seatId) {
		seat[seatId-1].unAssign();
		numEmptySeat++;
	}
	
}
