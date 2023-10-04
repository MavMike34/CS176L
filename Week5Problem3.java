
import java.util.*;

public class Week5Problem3 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s = scnr.next();
		
		//Second part of the string that won't be replaced.
		String secondPart = s.substring(1, s.length());
		
		//Checks if the first character is numerical.
		if(s.charAt(0) == '0') {
			System.out.println("zero" + secondPart);
		}
		
		else if(s.charAt(0) == '1') {
			System.out.println("one" + secondPart);
		}
		
		else if(s.charAt(0) == '2') {
			System.out.println("two" + secondPart);
		}
		
		else if(s.charAt(0) == '3') {
			System.out.println("three" + secondPart);
		}
		
		else if(s.charAt(0) == '4') {
			System.out.println("four" + secondPart);
		}

		else if(s.charAt(0) == '5') {
			System.out.println("five" + secondPart);
		}
		
		else if(s.charAt(0) == '6') {
			System.out.println("six" + secondPart);
		}
		
		else if(s.charAt(0) == '7') {
			System.out.println("seven" + secondPart);
		}
		
		else if(s.charAt(0) == '8') {
			System.out.println("eight" + secondPart);
		}
		
		else if(s.charAt(0) == '9') {
			System.out.println("nine" + secondPart);
		}
		
		else{
			System.out.println(s);
		}

	}

}
