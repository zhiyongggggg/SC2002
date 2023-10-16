package Lab1;
import java.util.*;

public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int meritpoints = sc.nextInt();
		
		if (salary >= 500 & salary < 650) {
			if (salary >= 600 & meritpoints >= 10) {
				System.out.println("Grade B");
			} else {
				System.out.println("Grade C");
			}
		} else if (salary >= 600 & salary < 800) {
			if (salary >= 700 & meritpoints >= 20) {
				System.out.println("Grade A");
			} else {
				System.out.println("Grade B");
			}
		} else {
			System.out.println("Grade A");
		}
		
	}
}
