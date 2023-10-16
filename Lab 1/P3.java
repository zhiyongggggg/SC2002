package Lab1;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double RATE = 1.82;
		Scanner sc = new Scanner(System.in);
		
		//First table;
		int starting = sc.nextInt();
		int ending = sc.nextInt();
		int interval = sc.nextInt();
		if (starting > ending) {
			System.out.println("Error input!!");
			return;
		}
		System.out.println("US$         S$");
		System.out.println("--------------");
		for (int i=starting ; i<=ending; i += interval) {
			System.out.printf("%-11d %-7.2f%n", i, (i*RATE));
			//System.out.println(i + "           " + (i * RATE));
		}
		
		
		//Second table;
		starting = sc.nextInt();
		ending = sc.nextInt();
		interval = sc.nextInt();
		if (starting > ending) {
			System.out.println("Error input!!");
			return;
		}
		System.out.println("US$         S$");
		System.out.println("--------------");
		int counter = starting;
		while (counter <= ending) {
			System.out.printf("%-11d %-7.2f%n", counter, (counter*RATE));
			counter += interval;
		}
		
		
		//Third table;
		starting = sc.nextInt();
		ending = sc.nextInt();
		interval = sc.nextInt();
		if (starting > ending) {
			System.out.println("Error input!!");
			return;
		}
		System.out.println("US$         S$");
		System.out.println("--------------");
		counter = starting;
		do {
			System.out.printf("%-11d %-7.2f%n", counter, (counter*RATE));
			counter += interval;
		} while (counter <= ending);
		
		
	}

}
