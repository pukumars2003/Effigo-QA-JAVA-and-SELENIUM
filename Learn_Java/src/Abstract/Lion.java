package Abstract;

public class Lion extends Animal{

	void Sound() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal l=new Lion();
		l.Sound();
	}

}
