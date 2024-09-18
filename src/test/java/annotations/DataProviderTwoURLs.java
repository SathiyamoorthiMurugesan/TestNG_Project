package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTwoURLs {

	WebDriver driver;

	@Test(dataProvider = "URLs")
	public void OpenTwoURLsUsingDataProvider(String URL) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_128.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		Thread.sleep(2000);
	}

//	public void OpenTwoURLsUsingDataProvider(String URL) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_128.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get(URL);
//		Thread.sleep(2000);
//	}
//	
//	public void OpenTwoURLsUsingDataProvider(String URL) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_128.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get(URL);
//		Thread.sleep(2000);
//	}

	@DataProvider
	public Object[] URLs() {
		Object[] url = new Object[2];

		url[1] = "https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/";
		url[0] = "https://www.seleniumeasy.com/testng-tutorials/dataprovider-in-testng";

		return url;
	}

	@DataProvider
	public String[][] method2() {


		String credentials[][] = { { "userName1", "password1" }, { "userName2", "password2" } };

//		int a[][] = { { 10, 20 }, { 20, 40 } };
//		a00 - 10
//		a01 = 20
//		a10 = 20
//		a11 = 40

		return credentials;
	}

	@Test(dataProvider = "method2")
	public void method3(String userName, String password) {
		System.out.println(userName);
		System.out.println(password);
	}

	/*
	 * // This method only close the browser which is active
	 * 
	 * @AfterTest() public void closeBrowser() { driver.quit(); }
	 */

	// This method will close browser immediately after each method
	@AfterMethod()
	public void closeBrowser() {
		driver.quit();
	}

}
