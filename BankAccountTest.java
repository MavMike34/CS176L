package cs176;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount(560);
		BankAccount account3 = new BankAccount("Mike", 1690);
		
		System.out.println("Account 1 Balance: " + account1.getBalance());
		
		account2.deposit(650);
		System.out.println("Account 2 Balance: " + account2.getBalance());
		
		account3.withdraw(55);
		System.out.println("Account 3 Balance: " + account3.getBalance());

		

	}
	
}
