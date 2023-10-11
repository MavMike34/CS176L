import java.util.*;

public class Week6Problem3 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a sentence: ");
		
		String sentence = scnr.nextLine();
		boolean hasNumbers = false;
		
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == '0' || sentence.charAt(i) == '1' 
			|| sentence.charAt(i) == '2' || sentence.charAt(i) == '3'
			|| sentence.charAt(i) == '4' || sentence.charAt(i) == '5'
			|| sentence.charAt(i) == '6' || sentence.charAt(i) == '7' 
			|| sentence.charAt(i) == '8' || sentence.charAt(i) == '9') {
				
				hasNumbers = true;
				
			}
			
			else {
				hasNumbers = false;
			}
		}
		
		if(hasNumbers) {
			System.out.println(sentence + " contains numerical characters.");
		}
		
		else {
			System.out.println(sentence + " does not contain any numerical characters.");
		}

	}

}
