package Lab4;

import java.util.Scanner;

public class Rectangle implements Shape {
	private double length;
	private double breadth;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void enterDimension() {
		System.out.print("Enter the length: ");
		length = sc.nextDouble();
		System.out.print("Enter the breadth: ");
		breadth = sc.nextDouble();
	}
	@Override
	public double calculateArea() {
		return (breadth * length);
	}
	public void setDimension(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
}
