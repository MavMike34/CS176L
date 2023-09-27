
public class StudentGrade {

	//Attributes
	private int studentGrade;
	private String studentName;
	
	//Constants
	final int DEFAULT_GRADE = 60;
	final int MAXIMUM_GRADE = 100;
	final int MINIMUM_GRADE = 0;
	final int AGRADE = 90;
	final int BGRADE = 80;
	final int CGRADE = 70;
	
	//Constructor 1
	public StudentGrade(String name) {
		
		studentName = name;
		studentGrade = DEFAULT_GRADE;
		
	}
	
	//Constructor 2
	public StudentGrade(String name, int grade) {
		
		studentName = name;
		studentGrade = grade;
		
	}

	//Sets student grade between 0-100.
	public void setGrade(int grade) {
		
		if(grade >= MINIMUM_GRADE && grade <= MAXIMUM_GRADE) {
			
			studentGrade = grade;
			
		}
		
		else {
			studentGrade = DEFAULT_GRADE;
		}
	}
	
	//Returns the student grade.
	public int getGrade() {
		
		return studentGrade;
		
	}
	
	//Returns the student grade level. A-D.
	public String getGradeLevel() {
		
		if(studentGrade >= AGRADE) {
			return "A";
		}
		
		else if(studentGrade >= BGRADE && studentGrade < AGRADE) {
			return "B";
		}
		
		else if(studentGrade >= CGRADE && studentGrade < BGRADE) {
			return "C";
		}
		
		else {
			return "D";
		}
		
	}
	
}
