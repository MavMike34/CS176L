package cs176;

public class BankAccount {
	
	String accountName;
	double balance;
	
	public BankAccount() {
		accountName = "Default Name";
		balance = 0.0;
	}
	
	public BankAccount(double bal) {
		accountName = "Default Name";
		balance = bal;
	}
	
	public BankAccount(String name, double bal) {
		accountName = name;
		balance = bal;
	}
	
	public void deposit(double depositAmount) {
		balance += depositAmount;
	}
	
	public void withdraw(double withdrawAmount) {
		balance -= withdrawAmount;
	}
	
	public double getBalance() {
		return balance;
	}

}
