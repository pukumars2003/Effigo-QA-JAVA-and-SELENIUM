package Method_Overloading;

public class Main_Add {

	public static void main(String[] args) {
		Add addobj=new Add();
		System.out.println(addobj.sum());
		System.out.println(addobj.sum(1,2));
		System.out.println(addobj.sum(1,2,3));
	}

}
