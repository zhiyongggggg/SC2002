package Lab4;

import java.util.Scanner;

public class Shape2DApp {

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
			System.out.println("1.Square  2.Rectangle  3.Circle  4.Triangle");
			shapeID = sc.nextInt();
			switch(shapeID) {
			case 1:
				Square sq = new Square();
				sq.enterDimension();
				objectHolder[i] = sq;
				break;
			case 2:
				Rectangle rt = new Rectangle();
				rt.enterDimension();
				objectHolder[i] = rt;
				break;
			case 3:
				Circle cl = new Circle();
				cl.enterDimension();
				objectHolder[i] = cl;
				break;
			case 4:
				Triangle tr = new Triangle();
				tr.enterDimension();
				objectHolder[i] = tr;
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
