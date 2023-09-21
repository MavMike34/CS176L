package cs176;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Mike", 50000);
		employee1.raiseSalary(10);
		System.out.println(employee1.getName() + "\n" + employee1.getSalary());

	}
	
}
