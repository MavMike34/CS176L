package cs176;

public class Employee {
	
	String employeeName;
	double currentSalary;
	
	public Employee(String name, double salary) {
		
		employeeName = name;
		currentSalary = salary;
		
	}
	
	public String getName() {
		return employeeName;
	}
	
	public double getSalary() {
		return currentSalary;
	}
	
	public void raiseSalary(double byPercent) {
		currentSalary += currentSalary * (byPercent / 100);
	}

}
