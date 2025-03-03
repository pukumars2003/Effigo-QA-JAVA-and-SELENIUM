package Monday_INITIAL;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Second {

	@Test
	public static void testOK() {
		String exp_title="Hello";
		String title="Hello1";
		Assert.assertEquals(exp_title, title);
		
		//Assert.assertTrue()
		
		
	}
}
