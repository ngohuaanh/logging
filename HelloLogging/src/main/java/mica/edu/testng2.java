package mica.edu;

import org.testng.annotations.Test;

public class testng2 extends testng{

	@Test
	public void testcase_3() {
		logger.info("Start test case");
		PageObject p = new PageObject();
		p.printInfo();
		logger.info("End test case");
	}
	
	@Test
	public void testcase_4() {
		logger.info("Start test case");
		PageObject p = new PageObject();
		p.printInfo();
		logger.info("End test case");
	}
}
