import java.util.*;

public class Week7Problem1 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		boolean isPalidrome = true;
		System.out.print("Enter a word: ");
		String userWord = scnr.next();
		
		String finalWord = userWord.toLowerCase();
		
		for(int i = 0; i < finalWord.length(); i++) {
			if(finalWord.charAt(i) == finalWord.charAt(finalWord.length() - (i + 1))) {
				isPalidrome = true;
			}
			
			else {
				isPalidrome = false;
				break;
			}
		}
		
		if(isPalidrome) {
			System.out.println("\nYes, it is a palidrome.");
		}
		
		else {
			System.out.println("\nNo, it is not a palindrome.");
		}
	}
}
