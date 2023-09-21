package cs176;

public class University {
	
	public String universityName;
	public int numOfStudents;
	
	public University(String name, int students) {
	
		universityName = name;
		numOfStudents = students;
		
	}
	
	public String getName() {
		return universityName;
	}
	
	public int getStudents() {
		return numOfStudents;
	}
	
	public void setName(String name) {
		universityName = name;
	}
	
	public void setStudents(int students) {
		numOfStudents = students;
	}

	public static void main(String[] args) {
		
		University univ1 = new University("Monmouth University", 4369);
		System.out.println(univ1.getName() + " " + univ1.getStudents());
		univ1.setStudents(4198);
		System.out.println("New Number of Students: " + univ1.getStudents());
	}

}
