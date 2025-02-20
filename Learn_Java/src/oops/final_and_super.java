package oops;

public class final_and_super {
	
	final int a =4;
	final void AB() {
		int a=5;
		System.out.println("HEllo This is final method");
	}
	
	public static void main(String[] a) {
		final_and_super b=new final_and_super();
		b.AB();
		System.out.println(b.a);
	}
}
