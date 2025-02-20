package Inheritance;

public class SavingAccount extends BankAccount  {
	public SavingAccount(String accountNumber, double balance) {
        
        super(accountNumber, balance);
    }

    
    @Override
    public void withdraw(double amt) {
        
        if (getBalance() - amt < 100) {
            
            System.out.println("Minimum balance of $100 required!");
        } else {
            
            super.withdraw(amt);
        }
    }
	public static void main(String[] args) {
		
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
        
        BankAccount BA1234 = new BankAccount("BA1234", 500);

        
        System.out.println("Deposit Rs1000 into account BA1234:");
        
        BA1234.deposit(1000);
        
        System.out.println("New balance after depositing Rs1000: Rs" + BA1234.getBalance());

        
        System.out.println("Withdraw Rs600 from account BA1234:");
        
        BA1234.withdraw(600);
        
        System.out.println("New balance after withdrawing Rs600: Rs" + BA1234.getBalance());

     
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of Rs450:");
        
        SavingAccount SA1234 = new SavingAccount("SA1234", 450);

       
        SA1234.withdraw(300);
        
        System.out.println("Balance after trying to withdraw Rs300: Rs" + SA1234.getBalance());

        
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of Rs300:");
        
        SavingAccount SA1000 = new SavingAccount("SA1000", 300);

        // Print message to indicate withdrawal action
        System.out.println("Try to withdraw Rs250 from SA1000!");
        // Withdraw $250 from SA1000 (balance falls below Rs100)
        SA1000.withdraw(250);
        // Print the balance after attempting to withdraw $250
        System.out.println("Balance after trying to withdraw Rs250: $" + SA1000.getBalance());
		
	}

}
