package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PesquisarProduto {
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com.br");

		
	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Computador");
		
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
	}

}
