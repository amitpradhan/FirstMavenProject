package com.testing;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest {

	 @Test
	    public void testYahoo(){
	    	WebDriver driver = new FirefoxDriver();
	    	driver.get("http://yahoo.com");
	    	driver.close();
	    	
}
}