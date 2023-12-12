import java.util.*;

public class Week14Problem1 {

	public static void checkNumber(int n) {
		try {
			isPositiveError(n);
			System.out.println(n + " is negative.");
		} catch (IllegalArgumentException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
	
	public static void isPositiveError(int n) {
		if (n >= 0) {
			throw new IllegalArgumentException(n + " is a positive number!");
		}
	}
	
	public static void main(String[] args) {
		
		int[] numList = new int[] {-2,-4,-8,-16,4,-34,5};
		
		for(int i = 0; i < numList.length; i++) {
			checkNumber(numList[i]);
		}
		
		

	}

}
