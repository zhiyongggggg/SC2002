package Lab4;

import java.util.Scanner;

public class Square implements Shape {
	private double length;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void enterDimension() {
		System.out.print("Enter the length for the square: ");
		length = sc.nextDouble();
	}
	@Override
	public double calculateArea() {
		return (length * length);
	}
	public void setDimension(double d) {
		// TODO Auto-generated method stub
		this.length = d;
	}

	
}
