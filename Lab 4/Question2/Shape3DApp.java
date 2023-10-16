package Lab4;

import java.util.Scanner;

public class Shape3DApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfShapes;
		int shapeID;
		int calculationID;
		double totalArea = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total number of shapes: ");
		numOfShapes = sc.nextInt();
		Shape []objectHolder = new Shape[numOfShapes];
		for (int i=0; i<numOfShapes; i++) {
			System.out.println("Choose the shape: ");
			System.out.println("1.Cube  2.Cuboid  3.Sphere  4.Pyramid  5.Cone  6.Cylinder");
			shapeID = sc.nextInt();
			switch(shapeID) {
			case 1:
				Cube cube = new Cube();
				cube.enterDimension();
				objectHolder[i] = cube;
				break;
			case 2:
				Cuboid cuboid = new Cuboid();
				cuboid.enterDimension();
				objectHolder[i] = cuboid;
				break;
			case 3:
				Sphere sphere = new Sphere();
				sphere.enterDimension();
				objectHolder[i] = sphere;
				break;
			case 4:
				Pyramid pyramid = new Pyramid();
				pyramid.enterDimension();
				objectHolder[i] = pyramid;
				break;
			case 5:
				Cone cone = new Cone();
				cone.enterDimension();
				objectHolder[i] = cone;
				break;
			case 6:
				Cylinder cylinder = new Cylinder();
				cylinder.enterDimension();
				objectHolder[i] = cylinder;
				break;
			}
		}
		//System.out.println("Choose the type of calculation: ");
		//System.out.println("1. Area 2. Volume");
		//calculationID = sc.nextInt();
		calculationID = 1;
		switch(calculationID) {
		case 1:
			for (Shape i : objectHolder) {
				totalArea += i.calculateArea();
			}
			System.out.printf("The total area is: %.2f\n", totalArea);
			break;
		case 2:
			break;
		}
		
	}

}
