package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryFailedTestCase {
	//retryAnalyzer used to rerun the falied test cases
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void failTestCase() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.co/");
	}
}
