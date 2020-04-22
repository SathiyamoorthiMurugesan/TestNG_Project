package testNGParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestingClass {

	@Test
	public void testing() {
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.mozilla.org/en-US/");
			driver.getTitle();
	}

}
