package cs176;

public class BugTest {

	public static void main(String[] args) {
		
		Bug bug1 = new Bug(10);
		bug1.move();
		bug1.turn();
		bug1.move();
		bug1.move();
		System.out.println(bug1.getPosition());

	}
	
}
