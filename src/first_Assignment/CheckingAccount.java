package first_Assignment;

public class CheckingAccount extends BankAccount {

	private double overDraft;

	

	public CheckingAccount(String accountNumber, String accountHolder, double balance, double overDraft) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.overDraft= overDraft;
	}

	

	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}

	@Override

	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Deposite of " + amount + " \\u20ac success");

	}

	@Override
	public void withDrow(double amount) {
		if (balance + overDraft >= amount) {
			balance = balance-amount;
			System.out.println("withdrow:" + overDraft + " \u20ac successfule, current balance is ");
		} else {
			System.out.println("transection failed.");
		}

	}

	@Override
	public void display() {
		System.out.println("Account number is: "+accountNumber);
		System.out.println("Account holderis: "+accountHolder);
		System.out.println("Balance is: " + balance + " \u20ac");
		System.out.println("Interest rate: " + overDraft);
		

	}

}
