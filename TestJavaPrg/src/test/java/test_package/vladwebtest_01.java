package test_package;

import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;	

public class vladwebtest_01 {
	private WebDriver driver;		
	@Test				
	public void testOne() {	
		System.setProperty("webdriver.gecko.driver","/opt/selenium/bin/geckodriver"); 
		driver.get("http://rhel73test:6080/vladwebtest-0.0.1-SNAPSHOT/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Insert")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.gecko.driver","/opt/selenium/bin/geckodriver"); 
	    driver = new FirefoxDriver();  
	}		
	@AfterTest
	public void afterTest() {
		System.setProperty("webdriver.gecko.driver","/opt/selenium/bin/geckodriver"); 
		driver.quit();			
	}		
}
