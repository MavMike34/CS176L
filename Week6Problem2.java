import java.util.*;

public class Week6Problem2 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scnr.next();
		
		System.out.println("Hello " + name + ". How many exams have you taken?");
		int exams = scnr.nextInt();
		
		int totalGrades = 0;
		
		for(int i = 1; i <= exams; i++) {
			System.out.println("Enter the Score for Exam " + i);
			
			int currentGrade = scnr.nextInt();
			
			if(currentGrade >= 0 && currentGrade <= 100) {
				totalGrades += currentGrade;
			}
			else {
				System.out.println("Invalid Score!");
				i--;
			}
		}
		
		float averageGrade = (totalGrades / (float)exams);
		
		System.out.println("Hello " + name + ", your average score of " + exams + " exams is " + averageGrade);

	}

}
