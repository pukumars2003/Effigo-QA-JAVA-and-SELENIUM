package Constructor;

public class Account {

	private String accnu;
	double balance;
	public Account(String accnu, double balance) {
		if (accnu==null || accnu.isEmpty()) {
			System.err.println("Error");
		}
		
		if (balance<0) {
			System.err.println("Error Balance");
			
	
		}
		this.accnu=accnu;
		this.balance=balance;
	}
	
	public void getDeatils() {
		System.out.println("Account : "+accnu+" Balance : "+balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a=new Account("",500);
		Account b=new Account("",-0.25);
		Account c=new Account("ABC",-1);
		Account d=new Account("ABC",525);
		
		a.getDeatils();
		b.getDeatils();
		c.getDeatils();
		d.getDeatils();
		

	}

}
