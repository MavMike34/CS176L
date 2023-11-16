import java.util.*;

// This class rearranges a string to alphabetical order and sum of integers.
public class Week11Problem3 {

	public static String organizeString(String userStr) {
		
		ArrayList<Character> numArray = new ArrayList<Character>();
		int sumOfInts = 0;
		String orgStr = "";
		
		for(int i = 0; i < userStr.length(); i++) {
			if(Character.isDigit(userStr.charAt(i))){
				sumOfInts += Character.getNumericValue(userStr.charAt(i));
			}
			else {
				numArray.add(userStr.charAt(i));
			}
		}
		
		Collections.sort(numArray);
		
		for(int i = 0; i < numArray.size(); i++) {
			orgStr += numArray.get(i);
		}
		
		orgStr += sumOfInts;
		
		return orgStr;
	}
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a string containing uppercase letters and integers (0-9)");
		String userString = scnr.next();
		
		System.out.println(userString  + " Organized is " + organizeString(userString));
	}

}
