package annotations;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"group1"})
	public void group1() {
		System.out.println("I am belongs to group1");
	}
	
	@Test(groups= {"group2"})
	public void group2() {
		System.out.println("I am belongs to group2");
	}
	
//	https://howtodoinjava.com/testng/testng-test-groups-meta-group-default-group-examples/
// For reference
	
	@Test(groups= {"group1", "group2"})
	public void group1and2() {
		System.out.println("I am belongs to group1and2");
	}
	
	@Test(groups= {"group2", "group3"})
	public void group2and3() {
		System.out.println("I am belongs to group2and3");
	}

}
