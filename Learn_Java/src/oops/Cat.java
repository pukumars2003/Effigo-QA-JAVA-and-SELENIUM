package oops;


public class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}

	public static void main(String[] args) {
		Cat cat=new Cat();
		Animal ani=new Animal();
		
		cat.makeSound();
		ani.makeSound();

	}

}
