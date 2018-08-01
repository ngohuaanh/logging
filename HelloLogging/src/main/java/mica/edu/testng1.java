package mica.edu;

import org.testng.annotations.Test;

public class testng1 extends testng{

	@Test
	public void testcase_1() {
		logger.info("Start test case");
		PageObject p = new PageObject();
		p.printInfo();
		logger.info("End test case");
	}
	
	@Test
	public void testcase_2() {
		logger.info("Start test case");
		PageObject p = new PageObject();
		p.printInfo();
		logger.info("End test case");
	}
}
