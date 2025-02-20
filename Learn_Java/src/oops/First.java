package oops;

import org.w3c.dom.Node;

public class First {
	
	Node next;
	public void hello(float f,int b) {
		System.out.println("Hello"+f);
	}
	
	public void hello(int a,float c) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First a=new First();
		a.hello(4,5f);
		a.hello(4f,5);
	}

}
