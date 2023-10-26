import java.util.*;

public class Week8Problem2 {
	
	public static String ReverseString(String str) {
		String reversedString = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString += str.charAt(i);
		}
		
		return reversedString;
	}

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a string you would like reversed: ");
		String userString = scnr.nextLine();
		
		
		System.out.println(ReverseString(userString));
	}

}
