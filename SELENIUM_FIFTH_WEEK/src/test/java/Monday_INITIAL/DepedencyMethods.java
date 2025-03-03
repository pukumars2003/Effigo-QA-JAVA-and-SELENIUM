package Monday_INITIAL;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DepedencyMethods {

	@Test(priority=1)
	public static void Register() {
		System.out.println("Registrartion Succesfull");
		Assert.assertTrue(false);
	}
	
	@Test(priority=2,dependsOnMethods= {"Register"})
	public static void Login() {
		System.out.println("Login Succesfull");
	}
	@Test(priority=3,dependsOnMethods= {"Register"},groups= {"abc"})
	public static void LogOut() {
		System.out.println("Logout Succesfull");
	}
	
	public static void main(String[] args) {
		
	}

}
