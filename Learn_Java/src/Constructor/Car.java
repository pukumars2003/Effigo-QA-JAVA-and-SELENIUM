package Constructor;

public class Car {
	
	private String model;
	private String make;
	private int year;
	public Car(String model,String make,int year) {
		this.model=(model.isEmpty()|| model==null)?"Unknow Model":model;
		this.make=(make.isEmpty()||make==null)?"Unknow Make":make;
		this.year=(year<0)?2000:year;
	}
	
	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Corolla", 2021);
        
        System.out.println("Car 1 Make: " + car1.make);
        System.out.println("Car 1 Model: " + car1.model);
        System.out.println("Car 1 Year: " + car1.year);

        
        Car car2 = new Car("", "", -1);
        
        System.out.println("Car 2 Make: " + car2.make);
        System.out.println("Car 2 Model: " + car2.model);
        System.out.println("Car 2 Year: " + car2.year);
	}

}
