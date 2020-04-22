package testNGParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenersTesting.class)

public class TwoParallelBrowser {
	
	WebDriver driver;
	
	@Test
	public void openFirstBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	public void openSecondBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/testng-tutorials/parallel-execution-of-classes-in-testng");
		System.out.println(Thread.currentThread().getId());
	}

}
