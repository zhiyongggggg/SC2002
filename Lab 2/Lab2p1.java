package Lab2;

import java.util.*;

public class Lab2p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in); 
		do {
			System.out.println("Perform the following methods:"); 
			System.out.println("1: multiplication test"); 
			System.out.println("2: quotient using division by subtraction"); 
			System.out.println("3: remainder using division by subtraction"); 
			System.out.println("4: count the number of digits"); 
			System.out.println("5: position of a digit"); 
			System.out.println("6: extract all odd digits"); 
			System.out.println("7: quit");
			choice = sc.nextInt();
			int m, n, digit;
			switch (choice) {
			case 1: /* add mulTest() call */
				mulTest();
				break;
			case 2: /* add divide() call */
				m = sc.nextInt();
				n = sc.nextInt();
				System.out.println(m + "/" + n + " = " + divide(m,n));
				break;
			case 3: /* add modulus() call */
				m = sc.nextInt();
				n = sc.nextInt();
				System.out.println(m + " % " + n + " = " + modulus(m, n));
				break;
			case 4: /* add countDigits() call */
				n = sc.nextInt();
				if (n < 0) {
					System.out.println("Error input!!");
				} else {
					System.out.println("count = " + countDigits(n));
				}
				break;
			case 5: /* add position() call */
				n = sc.nextInt();
				digit = sc.nextInt();
				System.out.println("position = " + position(n, digit));
				break;
			case 6: /* add extractOddDigits() call */
				n = sc.nextInt();
				if (n < 0) {
					System.out.println("oddDigits = Error input!!");
				} else {
					System.out.println("oddDigits = " + extractOddDigits(n));
				}
				break;
			case 7: 
				System.out.println("Program terminating ...."); 
			}
		} while (choice < 7); 
		/* add method code here */
	}
	
	public static void mulTest() {
		int firstNum, secondNum, userInput, correctAns, count;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		count = 0;
		for (int i=0; i<5; i++) {
			firstNum = rand.nextInt(9) + 1;
			secondNum = rand.nextInt(9) + 1;
			System.out.println("How much is " + firstNum + " times " + secondNum + "? ");	
			userInput = sc.nextInt();
			correctAns = firstNum * secondNum;
			if (userInput == correctAns) {
				count++;
			}
		}
		System.out.println(count + " answers out of 5 are correct.");
	}
	
	public static int divide(int m, int n) {
		int count;
		count = -1;
		while (m >= 0) {
			m -= n;
			count++;
		}
		return count;
	}
	
	public static int modulus(int m, int n) {
		int intermediate = m;
		while (m >= 0) {
			intermediate = m;
			m -= n;
		}
		return intermediate;
	}
	
	public static int countDigits(int n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}
	
	public static int position(int n, int digit) {
		int remainder, count = 1;
		while (n > 0) {
			remainder = n % 10;
			if (remainder == digit) {
				return count;
			}
			count++;
			n /= 10;
		}
		return -1;
	}
	
	public static long extractOddDigits(long n) {
		long oddDigits = 0, remainder;
		int power = 1;
		while (n > 0) {
			remainder = n % 10;
			if (remainder % 2 == 1) {
				oddDigits += (remainder * power);
				power *= 10;
			}
			n /= 10;
		}
		if (oddDigits == 0) {
			return -1;
		} else {
			return oddDigits;
		}
	}
}
