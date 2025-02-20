package oops;

public class prog {

	public static void main(String[] args) {
		int even=0;
		int odd=0;
		for(int i=1;i<=10;i++){
			if(i%2==0) {
				even+=i;
			}
			else {
				odd+=i;
			}
			
		}
		System.out.println(even+" "+odd);
	}

}
