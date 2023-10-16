package Lab4;

import java.util.Scanner;

public class Cube implements Shape {
	private double length;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void enterDimension() {
		System.out.print("Enter the length for the cube: ");
		length = sc.nextDouble();
	}
	
	@Override
	public double calculateArea() {
	    Square square = new Square();
	    square.setDimension(this.length);
	    return 6 * square.calculateArea();
	}
}
