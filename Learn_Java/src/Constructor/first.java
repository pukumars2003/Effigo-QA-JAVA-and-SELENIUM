package Constructor;

public class first {

	
	private String name;
	private int Clas;
	public first() {
		this.name="Unknown";
		this.Clas=5;
	}
	
	public String getName() {
		return name;
	}
	
	public int getClas() {
		return Clas;
	}
	
	public static void main(String[] args) {
		first a=new first();
		System.out.println(a.getName());
		System.out.println(a.getClas());	
		}

}
