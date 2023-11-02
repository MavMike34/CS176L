import java.util.*;

public class Week9Problem3 {
	
	static public int FirstNoRepeat(int[] arr) {
		
		int nonRepeatVal = 0;
		boolean repeats = false;
		boolean foundNoRepeat = false;
		
		for (int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					repeats = true;
				}
				
				if(j == arr.length - 1 && !repeats && !foundNoRepeat) {
					nonRepeatVal = arr[i];
					foundNoRepeat = true;
				}
				
				
				repeats = false;
				
			}
			
		}
		
		
		return nonRepeatVal;
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("How many integers would you like in your array? ");
		int numOfInts = scnr.nextInt();
		System.out.println();
		
		int[] arrOfInt = new int[numOfInts];
		
		for(int i = 0; i < numOfInts; i++) {
			System.out.print("Enter an integer ");
			arrOfInt[i] = scnr.nextInt();
			System.out.println();
		}
		
		System.out.println("The first non-repeating element: " + FirstNoRepeat(arrOfInt));

	}

}
