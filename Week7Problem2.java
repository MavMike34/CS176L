import java.util.*;

public class Week7Problem2 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = scnr.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = scnr.nextInt();
		
		//Determines which number is greater.
		int a = 0;
		int b = 0;
		
		if(num1 >= num2) {
			a = num1;
			b = num2;
		}
		else if(num1 < num2){
			a = num2;
			b = num1;
		}
		
		//Actual GCD Code.
		int gcd = 1;
		
		for(int i = b; i >= 1; i--) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
				break;
			}
			else {
				continue;
			}
		}
		
		System.out.println("GCD(" + num1 + ", " + num2 + ") = " + gcd);
	}	
}
