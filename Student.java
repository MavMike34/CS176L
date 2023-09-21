package cs176;

public class Student {
		
	public String studentName;
	public int totalScore;
	private int quizzesTaken;
		
	public Student(String name) {
			
		studentName = name;
			
	}
		
	public String getName() {
			
		return studentName;
			
	}
	
	public void addQuiz(int score) {
			
		totalScore += score;
		quizzesTaken++;
		
	}
		
	public int getTotalScore() {
		return totalScore;
	}
		
	public int getAverageScore() {
			
		int averageScore = totalScore / quizzesTaken;
		return averageScore;
			
	}

	public static void main(String[] args) {
		
		
		Student student1 = new Student("Mike");
		student1.addQuiz(27);
		student1.addQuiz(69);
		student1.addQuiz(85);
		student1.addQuiz(92);
		student1.addQuiz(98);
		System.out.println(student1.getTotalScore() + " " + student1.getName() + " " + student1.getAverageScore());
		

	}

}

