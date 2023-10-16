package Lab1;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		if (height <= 0) {
			System.out.println("Error input!!");
			return;
		}
		
		for (int i=1; i<=height; i++) {
			int flag = 1;
			for (int j=1; j<=i; j++) {
				if (i % 2 == 1) {
					if (flag == 1) {
						System.out.print("AA");
					} else {
						System.out.print("BB");
					}
				} else {
					if (flag == 1) {
						System.out.print("BB");
					} else {
						System.out.print("AA");
					}
				}
				flag = -flag;
			}
			System.out.println();
		}
	}

}
