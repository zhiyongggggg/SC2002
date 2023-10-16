package Lab4;

import java.util.Scanner;

public class Cone implements Shape {
    private double radius;
    private double length;

	Scanner sc = new Scanner(System.in);
	@Override
	public void enterDimension() {
		System.out.print("Enter the radius: ");
		radius = sc.nextDouble();
		System.out.print("Enter the length(not height): ");
		length = sc.nextDouble();
	}

    @Override
    public double calculateArea() {
    	return PI * radius * length;
    }
}
