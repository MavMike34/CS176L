
import java.util.*;

public class Week5Problem1 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter first username: ");
		String userName1 = scnr.next();
		
		System.out.println("Enter second username: ");
		String userName2 = scnr.next();
		
		if(userName1.equals(userName2)) {
			System.out.println("Same Names: " + userName1);
		}
		
		else {
			System.out.println("Different Names: " + userName1 + " and " + userName2);
		}

	}

}
