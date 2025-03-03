package Monday_INITIAL;

import org.testng.annotations.Test;

public class Zeorth {
	
	@Test(priority=1)
	public static void Register() {
		System.out.println("Registrartion Succesfull");
	}
	
	@Test
	public static void Login() {
		System.out.println("Login Succesfull");
	}
	@Test
	public static void LogOut() {
		System.out.println("Logout Succesfull");
	}
	
	public static void main(String[] args) {
		
	}

}
