package Inheritance;

public class Car extends Vehicle {

	@Override
	public void drive() {
		System.out.println("Reparinf a car");
	}
	public static void main(String[] args) {
		Car car=new Car();
		
		car.drive();

	}

}
