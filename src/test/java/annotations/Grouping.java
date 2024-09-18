package annotations;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"A1"})
	public void group1() {
		System.out.println("I am belongs to group1");
	}
	
	@Test(groups= {"A2"})
	public void group2() {
		System.out.println("I am belongs to group2");
	}
	
//	https://howtodoinjava.com/testng/testng-test-groups-meta-group-default-group-examples/
// For reference
	
	@Test(groups= {"A1", "A2"})
	public void group1and2() {
		System.out.println("I am belongs to group1and2");
	}
	
	@Test(groups= {"A2", "A3"})
	public void group2and3() {
		System.out.println("I am belongs to group2and3");
	}

}
