import java.util.*;

public class Week14Problem2 {

	public static void checkList(int[] n) {
		try {
			isDuplicateError(n);
		} catch (IllegalArgumentException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
	
	public static void isDuplicateError(int[] n) {
		
		ArrayList<Integer> checkList = new ArrayList<Integer>();
		
		for(int i = 0; i < n.length; i++) {
			
			if (checkList.contains(n[i])) {
				throw new IllegalArgumentException(n[i] + " is a duplicate!");
			}
			
			else {
				checkList.add(n[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter length for list: ");
		int listLength = scnr.nextInt();
		
		int[] numList = new int[listLength];
		
		for (int i = 0; i < listLength; i++) {
			System.out.println("Enter integer #" + (i + 1) + ": ");
			numList[i] = scnr.nextInt();
		}
		
		checkList(numList);
		
		

	}

}
