import java.util.*;

public class Week8Problem1 {
	
	public static String RemoveWhitespace(String str) {
		String finalString = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			if(!Character.isWhitespace(str.charAt(i))) {
				finalString += str.charAt(i);
			}
			
		}
		
		return finalString;
	}
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String userString = scnr.nextLine();
		
		System.out.println(RemoveWhitespace(userString));
		

	}

}
