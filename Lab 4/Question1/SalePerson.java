package Lab4;

public class SalePerson implements Comparable<SalePerson>{
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public SalePerson(String firstName, String lastName, int totalSales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}
	
	
	public String toString() {
		String s = String.format("%s , %s : %d", lastName, firstName, totalSales);
		return s;
	}
	public boolean equals(Object o) {
		if (((SalePerson) o).getFirstName() == this.getFirstName() && ((SalePerson) o).getLastName() == this.getLastName()) {
			return true;
		} else return false;
	}
	
	public int compareTo(SalePerson o) { //Double confirm this.
		if (o.getTotalSales() > this.getTotalSales()){
			return -1;
		} else if (o.getTotalSales() < this.getTotalSales()){
			return 1;
		}
		if ((this.getLastName()).compareTo(o.getLastName()) < 0){ //Double check what it means by in ascending alphabetical order.
			return 1;
		} else return -1;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public int getTotalSales() {
		return this.totalSales;
	}
}
