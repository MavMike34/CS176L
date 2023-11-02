import java.util.*;

public class Week9Problem2 {
	
	static public int FirstRepeat(int[] arr) {
		
		int repeatVal = 0;
		boolean foundRepeat = false;
		
		for (int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					if(!foundRepeat) {
						repeatVal = arr[i];
						foundRepeat = true;
					}
				}
				
			}
			
		}
		
		
		return repeatVal;
		
		
		
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
		
		System.out.println("The first repeating element: " + FirstRepeat(arrOfInt));

	}

}
