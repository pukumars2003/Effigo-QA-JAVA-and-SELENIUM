package Interface;

import java.lang.Math;

public class Circle implements Shape {
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	@Override
	public void getArea() {
		System.out.println(3.14*Math.pow(radius, 2));
	}
}
