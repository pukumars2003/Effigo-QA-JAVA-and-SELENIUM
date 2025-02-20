package Interface;

public class Rectangle implements Shape {

	int length,width;
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
	
	public void getArea() {
		System.out.println(length*width);
	}
}
