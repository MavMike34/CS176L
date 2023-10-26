import java.util.*;

public class Week8Problem3 {
	
	public static String RemoveChar(String str, Character c) {
		
		String newString = "";
		
		newString = str.replace(c.toString(), "");
		
		return newString;
	}
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String userString = scnr.nextLine();
		
		System.out.println("Enter a character: ");
		String userCharS = scnr.next();
		char userChar = userCharS.charAt(0);
		
		System.out.println(RemoveChar(userString, userChar));

	}

}
