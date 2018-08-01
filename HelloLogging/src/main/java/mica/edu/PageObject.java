package mica.edu;

import org.apache.log4j.Logger;

public class PageObject {
	final static Logger logger = Logger.getLogger(PageObject.class);
	
	public PageObject() {
		
	}
	
	public void printInfo() {
		logger.info("Print at pageobject class");
	}
}
