package annotations;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test 
	public void group1() {
//		System.out.println(1/0);
		System.out.println("I am group1 method");
	}
	
	@Test (dependsOnMethods = "group1")
	public void group2() {
		System.out.println("I am belongs to group2");
	}
	
	//No need of testNG.xml, we can even run it from here.
}
