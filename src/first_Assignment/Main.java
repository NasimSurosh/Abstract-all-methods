package first_Assignment;

public class Main {

	public static void main(String[] args) {
		
		BankAccount account = new SavingAccount("MBN 76576", "Karim", 8765.0, 4);
		
		account.display();
		System.out.println();
		
		account.display();
		account.deposit(453);
		account.withDrow(900);
		account.setAccountHolder("kh");
		account.setAccountNumber("234");
		account.setBalance(300);
		
		
		
		
        
		CheckingAccount balance = new CheckingAccount("234", "kh", 400, 5);
		
	     System.out.println();
		balance.display();
		
		
		
		
		
		
	}

	

}
