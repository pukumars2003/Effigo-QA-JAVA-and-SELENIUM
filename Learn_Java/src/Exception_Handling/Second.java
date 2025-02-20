package Exception_Handling;

public class Second {
	
	int a;
	public int Even(int a) {
		if (a%2!=0){
			throw new ArithmeticException("Not a Correct Number");
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Second c=new Second();
			int b=c.Even(3);
			System.out.println(b);
		}catch(ArithmeticException e) {
			System.out.println("Error : "+e.getMessage());
		}
	}

}
