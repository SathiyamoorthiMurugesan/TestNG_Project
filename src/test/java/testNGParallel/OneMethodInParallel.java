package testNGParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OneMethodInParallel {
	WebDriver driver;
	@Test(invocationCount = 2)
	public void openFirstBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//		driver.findElement(By.id("gsr")).sendKeys("Sathya");
		System.out.println(Thread.currentThread().getId());
	}
}
