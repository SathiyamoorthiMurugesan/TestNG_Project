package annotations;

import org.testng.annotations.*;

public class AllAnnotations {
	
	@Test
	public void method1() throws InterruptedException {
		System.out.println("Hello");
		Thread.sleep(2000);
		method2();
		Thread.sleep(2000);
	}
	
	public void method2() {
		System.out.println("Hiiiii");
	}
	
	@Test (alwaysRun = true)
	public void TestAnnotationWithAlwaysRunTrue( ) {
		System.out.println("I am Test Annotation with Always Run = True");
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

	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("I am @BeforeGroups");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("I am @AfterGroups");
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
	
	@Test
	public void SimpleTestAnnotation() {
		System.out.println("I am simple test method");
	}
	
	@Test (enabled=true) 
	public void TestAnnotationWithEnabledTrue() {
		System.out.println("I am Enabled True method");
	}
	
	@Test (enabled=false) 
	public void TestAnnotationWithEnabledFalse() {
		System.out.println("I am Enabled False method");
	}
	
	@Test (invocationCount = 2)
	public void TestAnnotationWithinvocationCount2() {
		System.out.println("I am invocation count2 method");
	}
	
	@Test (priority=0)
	public void TestAnnotationWithPriority1() {
		System.out.println(" I am priority1 method");
	}
	
	@Test (priority=2)
	public void TestAnnotationWithPriority2() {
		System.out.println(" I am priority2 method");
	}
	
	public void NoAnnotationMethod() {
		System.out.println("I am No Annotation Method");
	}
		
	
}
