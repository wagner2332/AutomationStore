package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidacaoProdutoCarrinho {
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
		Thread.sleep(2000);
		
		WebElement escolherproduto = driver.findElement(By.linkText("Computador Completo Intel Core i5 8gb SSD 240GB Monitor Hdmi"));
		escolherproduto.click();
		Thread.sleep(2000);
		
		WebElement addCarrinho = driver.findElement(By.id("add-to-cart-button"));
		addCarrinho.click();
		
		Assert.assertEquals("Adicionado ao carrinho", driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/span")).getText());

	}

}
