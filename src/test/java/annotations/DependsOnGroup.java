package annotations;

import org.testng.annotations.Test;

public class DependsOnGroup {

	@Test(groups= {"group1"})
	public void group1() {
		System.out.println(1/0);
	}
	
	@Test(groups= {"group2"})
	public void group2() {
		System.out.println("I am belongs to group2");
	}
	
	@Test(dependsOnGroups = {"group1", "group2"})
	public void group1and2() {
		System.out.println("I am belongs to group1and2");
	}
	
	@Test(dependsOnGroups = "group1")
	public void group2and3() {
		System.out.println("I am belongs to group2and3");
	}
}
