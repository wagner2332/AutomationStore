package Test;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;



public class AcessarSite {
	
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		
	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.amazon.com.br");
		
	}
}
