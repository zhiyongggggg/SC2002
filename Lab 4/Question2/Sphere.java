package Lab4;

import java.util.Scanner;

public class Sphere implements Shape{
    private double radius;

	Scanner sc = new Scanner(System.in);
	@Override
	public void enterDimension() {
		System.out.print("Enter the radius: ");
		radius = sc.nextDouble();
	}

    @Override
    public double calculateArea() {
        Circle circle = new Circle();
        circle.setDimension(this.radius);
        return 4 * circle.calculateArea();
    }
}
