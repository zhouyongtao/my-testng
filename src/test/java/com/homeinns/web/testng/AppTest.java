package com.homeinns.web.testng;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
	}

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp() {
		AssertJUnit.assertTrue(true);
	}
	
	//忽略
	@Test(enabled = false)
	public void testGeneratorNum() {
		GeneratorRandomNum rNum = new GeneratorRandomNum();
		String num = rNum.generate().toString();
		Assert.assertNotNull(num);
		//Assert.assertEquals(num, "999");
	}
	
	
	
}
