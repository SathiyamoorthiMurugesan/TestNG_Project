package testNGParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserTesting {
	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
	public void selectBrowser(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe"); 
		driver = new ChromeDriver();
		}
	}
	
	@Test
	public void getTitleofPage() {
		System.out.println(Thread.currentThread().getId());
		driver.get("https://www.mozilla.org/en-US/");
		driver.getTitle();
	}
	
}
