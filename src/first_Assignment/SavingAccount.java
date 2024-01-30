package first_Assignment;

public class SavingAccount extends BankAccount {

	private double interestRate;
	public SavingAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance= balance;
		this.interestRate = interestRate;
	
	}
	
	  public double getInterestRate() { 
		  return interestRate;
		  }
	  
	  public void setInterestRate(double interestRate) { 
		  this.interestRate = interestRate; 
		  }
	 

	@Override
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Deposite is " + amount + " \u20ac success, save diposite");

	}

	@Override
	public void withDrow(double amount) {

		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("withdrow:" + amount + " \u20ac successfule withdraw, from account.");

		} else {
			System.out.println("transection failed.");
		}

	}

	@Override
	public void display() {
		System.out.println("Account number is: "+accountNumber);
		System.out.println("Account holderis: "+accountHolder);
		System.out.println("Balance is: " + balance + " \u20ac");
		System.out.println("Interest rate: " + interestRate + " %");
		

	}
}
