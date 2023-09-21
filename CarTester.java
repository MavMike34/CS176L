package cs176;

public class CarTester {

	public static void main(String[] args) {
		
		Car myCar1 = new Car(50);
		myCar1.addGas(20);
		myCar1.drive(100);
		System.out.println("Gas Remaining: " + myCar1.getGasInTank());

	}
	
}
