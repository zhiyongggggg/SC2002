package Lab4;

import java.util.Scanner;

public class Circle implements Shape {
	private double radius;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void enterDimension() {
		System.out.print("Enter the radius for the circle: ");
		radius = sc.nextDouble();
	}
	@Override
	public double calculateArea() {
		return (radius * radius * PI);
	}
	public void setDimension(double d) {
		// TODO Auto-generated method stub
		this.radius = d;
	}
}
