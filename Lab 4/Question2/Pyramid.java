package Lab4;

import java.util.Scanner;

public class Pyramid implements Shape {
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
        Triangle triangle = new Triangle();
        triangle.setDimension(this.base, this.height);
        return 4 * triangle.calculateArea();
    }
}
