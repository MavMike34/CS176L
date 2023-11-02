import java.util.*;

public class Week9Problem1 {
	
	static public void ReverseArray(int[] arr, int num) {
		
		int[] reversedArray = new int[num];
		
		for (int i = 0; i < num; i++) {
			reversedArray[i] = arr[arr.length - 1 - i];
		}
		
		System.out.println("Normal Array: " + Arrays.toString(arr));
		System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
		
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
		
		ReverseArray(arrOfInt, numOfInts);

	}

}
