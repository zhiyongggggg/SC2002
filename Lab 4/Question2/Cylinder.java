package Lab4;

import java.util.Scanner;

public class Cylinder implements Shape {
    private double radius;
    private double height;

	Scanner sc = new Scanner(System.in);
	@Override
	public void enterDimension() {
		System.out.print("Enter the radius: ");
		radius = sc.nextDouble();
		System.out.print("Enter the height: ");
		height = sc.nextDouble();
	}

    @Override
    public double calculateArea() {
        Circle circle = new Circle();
        circle.setDimension(this.radius);
        return circle.calculateArea() + (circle.calculateArea() * height / this.radius);
    }
}
