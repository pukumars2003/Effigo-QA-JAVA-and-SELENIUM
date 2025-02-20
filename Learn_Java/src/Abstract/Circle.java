package Abstract;

public class Circle extends Shape {

	int r;
   Circle(int r) {
		this.r=r;
	}
   @Override
	void CalculateArea() {
		System.out.println(r*r);
	}
   @Override
	void Shae() {
		System.out.println("Circle Shape");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape c=new Circle(5);
		c.CalculateArea();
		c.Shae();
	}

}
