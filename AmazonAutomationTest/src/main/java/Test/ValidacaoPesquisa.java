package Test;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidacaoPesquisa {
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
		WebElement buscar = driver.findElement(By.id("twotabsearchtextbox"));
		buscar.sendKeys("Computador");
		
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		
		WebElement resultadoPesquisa = driver.findElement(By.linkText("Computador Completo Intel Core i5 8gb SSD 240GB Monitor Hdmi"));
		
		String resultado = resultadoPesquisa.getText();
		resultado = resultado.toLowerCase();
		
		if(resultado.contains("computador") || resultado.contains("pc")) {
			System.out.println("Sucesso");
		}
		else {
			System.out.println("Resultado nao condiz com pesquisa realizada");
		}
		
	}

}
