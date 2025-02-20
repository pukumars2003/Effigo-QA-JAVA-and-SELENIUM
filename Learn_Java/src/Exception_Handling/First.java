package Exception_Handling;

public class First {
	
	double a,b;
	public double Divide(double a,double b) {
		if (b==0) {
			throw new ArithmeticException("The Number cannot be divisible");
		}
		return a/b;
	}
	public static void main(String[] args) {

		try {
			First c=new First();
			Double res=c.Divide(4, 5);
			
			System.out.println((res));
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}

	}

}
