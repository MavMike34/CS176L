package cs176;

public class Car {
	
	double fuelEfficiency;
	double currentFuel = 0;
	
	public Car(double mpg) {
		fuelEfficiency = mpg;
	}
	
	public void addGas(double gas) {
		currentFuel += gas;
	}
	
	public void drive(double miles) {
		currentFuel -= (miles / fuelEfficiency);
	}
	
	public double getGasInTank() {
		return currentFuel;
	}

}
