package Constructor;

public class Dog {

	String name;
	String color;
	public Dog(String name,String color) {
		this.name=name;
		this.color=color;
	}
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog a=new Dog("AHHNAHS","RED");
		
		System.out.println(a.name);
		System.out.println(a.color);
	}

}
