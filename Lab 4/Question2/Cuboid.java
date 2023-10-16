package Lab4;

import java.util.Scanner;

public class Cuboid implements Shape{
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
        Rectangle rectangle = new Rectangle();
        rectangle.setDimension(this.length, this.breadth);
        Square square = new Square();
        square.setDimension(this.length);
        return 4 * rectangle.calculateArea() + square.calculateArea();
    }
}
