
public class GradeTester {

	public static void main(String[] args) {
		
		//Constructors
		StudentGrade stu1 = new StudentGrade("Mike");
		StudentGrade stu2 = new StudentGrade("Billy", 99);
		
		//Testing getGrade method.
		System.out.println(stu1.getGrade());
		System.out.println(stu2.getGrade());
		
		//Testing setGrade method.
		stu1.setGrade(-100);
		System.out.println(stu1.getGrade());
		stu1.setGrade(1000);
		System.out.println(stu1.getGrade());
		stu1.setGrade(88);
		System.out.println(stu1.getGrade());
		
		//Testing getGradeLevel method.
		System.out.println(stu2.getGradeLevel());
		System.out.println(stu1.getGradeLevel());
		stu1.setGrade(77);
		System.out.println(stu1.getGradeLevel());
		stu1.setGrade(54);
		System.out.println(stu1.getGradeLevel());
		
	}

}
