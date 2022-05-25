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

	@Test(priority=0)
	public void Znnotation( ) {
		System.out.println("Annotation");
	}
	
	@Test(priority=0)
	public void Sum( ) {
		System.out.println("TestSum");
	}
	
	@Test(priority=1)
	public void Calculation( ) {
		System.out.println("calculation");
	}
	
	@Test(priority=2)
	public void MiminumCalc( ) {
		System.out.println("TMinimum Clc");
	}
	
	
	
}
