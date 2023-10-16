package Lab4;

import java.util.Scanner;

public class Triangle implements Shape {
	private double base;
	private double height;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void enterDimension() {
		System.out.print("Enter the base: ");
		base = sc.nextDouble();
		System.out.print("Enter the height: ");
		height = sc.nextDouble();
	}
	@Override
	public double calculateArea() {
		return (0.5 * height * base);
	}
	public void setDimension(double base, double height) {
		this.base = base;
		this.height = height;
	}
}
