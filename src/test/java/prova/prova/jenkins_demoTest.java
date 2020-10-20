package prova.prova;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import static org.gaslini.printo.driver.DriverManager.Browser.CHROME;
import static org.junit.jupiter.api.Assertions.assertEquals;

class jenkins_demoTest {
	//static DriverManager.Browser testBrowser = CHROME;
	protected static WebDriver driver;
	private WebElement res;
	@Test
	void TestProva() throws InterruptedException {
		// Initialize browser
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// Open Google
		driver.get("https://it.wikipedia.org/wiki/Ciao");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		res=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
		assertEquals(res.getText(),"Ciao");
	}

}
