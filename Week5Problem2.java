
import java.util.*;

public class Week5Problem2 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int n = scnr.nextInt();
		
		System.out.println("Enter operation: (+, -, *, /)");
		char op = scnr.next().charAt(0);
		
		System.out.println("Enter second number: ");
		int m = scnr.nextInt();
		
		System.out.print(n + " " + op + " " + m + " = ");
		
		if(op == '+') {
			System.out.println(n + m);
		}
		
		else if(op == '-') {
			System.out.println(n - m);
		}
		
		else if(op == '*') {
			System.out.println(n * m);
		}
		
		else if(op == '/') {
			System.out.println(n / m);
		}
		
		else {
			System.out.println("Error!");
		}
		

	}

}
