package step_definitions;

import org.openqa.selenium.chrome.ChromeDriver;

import base_amazon_project.Base_Amazon;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks_Amazon extends Base_Amazon {
@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Before Run");
		
	}
	@After
	public void tearDown() {
		driver.quit();
		System.out.println("After Run");
	}
}
