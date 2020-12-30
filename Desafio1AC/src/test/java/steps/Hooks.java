package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	private static WebDriver driver;
	
	@Before
	public static void inicializa() {
		WebDriver driver = new ChromeDriver();
	    driver.get("http://sampleapp.tricentis.com/101/app.php");
	}
	
	@After
	public static void finaliza() {
		driver.quit();
	}

}
