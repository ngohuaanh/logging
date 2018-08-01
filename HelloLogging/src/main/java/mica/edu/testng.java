package mica.edu;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class testng {
	final static Logger logger = Logger.getLogger(testng.class);
	
	@BeforeSuite
    public void beforeSuite()
    {   
        logger.info("Start before suite");
    }
	
	@BeforeClass
    public void beforeClass()
    {   
		String className = this.getClass().getName();
		Thread.currentThread().setName(className);
        logger.info("Start before class");
    }
	
	@BeforeMethod
    public void handleTestMethodName(Method method)
    {
        String testName = method.getName(); 
        Thread.currentThread().setName(testName);
        logger.info("Start before method");
    }
	
	@AfterMethod
	public void after() {
		logger.info("Start before method");
	}
}
