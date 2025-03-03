package Monday_INITIAL;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert_ {
	@Test
	void test() {
		System.out.println("Test1");
		System.out.println("Test2");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);
		System.out.println("Test3");
		System.out.println("Test4");
		sa.assertAll();
	}
}
