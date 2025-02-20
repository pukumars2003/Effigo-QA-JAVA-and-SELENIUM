package Method_Overloading;

public class Add {
	
	int a=10;
	int b=20;
	int c;
	int sum() {
		return a+b;
	}
	int sum(int a,int b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}

}
