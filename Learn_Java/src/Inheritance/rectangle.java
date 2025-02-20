package Inheritance;

public class rectangle extends Shape {
	@Override
	public void getArea(int l,int b) {
		System.out.println(l*b);
	}
	public static void main(String[] args) {
		rectangle rec=new rectangle();
		rec.getArea(5,2);

	}

}
