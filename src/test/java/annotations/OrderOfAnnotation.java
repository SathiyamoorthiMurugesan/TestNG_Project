package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfAnnotation {

	@Test
	public void TestAnnotation( ) {
		System.out.println("+++++++++++ I am Test method++++++++++++++");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am @BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am @AfterSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am @BeforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am @AfterTest");
	}

	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am @BeforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am @AfterClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am @BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am @AfterMethod");
	}
	
	
	
	
	
	
	
}
