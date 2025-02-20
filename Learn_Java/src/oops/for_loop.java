package oops;

public class for_loop {

	public static void main(String[] args) {
		/*for(int i=1;i<=3;i++){
			System.out.println(i);
		}
		System.out.println("End");
*/
		//For prining reverse pyramid
		for(int i=1;i<=5;i++){
		   for(int j=6;j>=i;j--){
			System.out.print("*");
		}	
		   System.out.println();
		}
		
		//For prinitng pyramid
				for(int i=0;i<=5;i++){
				   for(int j=1;j<=i;j++){
					System.out.print("*");
				}	
				   System.out.println();
				}
			}
	}


