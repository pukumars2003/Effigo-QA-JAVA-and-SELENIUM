package Monday_INITIAL;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First {

	@Test
	public static void OK() {
		System.out.println("Registrartion Succesfull");
	}
	
	@BeforeMethod
	public static void Login() {
		System.out.println("Login Succesfull");
	}
	@AfterMethod
	public static void LogOut() {
		System.out.println("Logout Succesfull");
	}
	
	public static void main(String[] args) {
		
	}
}
