package Monday_INITIAL;

import org.testng.Assert;
import org.testng.annotations.*;

public class Hard_Assertions {
	@Test
	void test() {
		//Assert.assertEquals("abc", "abc");
		//Assert.assertEquals(123, 124);
		//Assert.assertEquals(123, "124");
		
		//Assert.assertNotEquals(123, 124);
		//Assert.assertTrue(true);//pass
		//Assert.assertFalse(false);//pass
		//Assert.assertTrue(false);//fail
		//Assert.assertTrue(0==1);//fail
		Assert.fail(); 
	}
}
