package annotations;

import org.testng.annotations.Test;

public class Grouping {
	
	
	  
	/* 
	 * @Test(groups= {"group2"}) public void group2() {
	 * System.out.println("I am belongs to group-2"); }
	 * 
	 * //
	 * https://howtodoinjava.com/testng/testng-test-groups-meta-group-default-group-
	 * examples/ // For reference
	 * 
	 * @Test(groups= {"group1", "group2"}) public void group1and2() {
	 * System.out.println("I am belongs to group1and2"); }
	 * 
	 * @Test(groups= {"group2", "group3","Regression"},priority=1) public void
	 * group2and3() { System.out.println("I am belongs to group2and3"); }
	 */
	
	@Test(priority=3)
	public void test5() {
		
		System.out.println("I am test5");
	}
	
	
	@Test(priority=2)
	public void test6() {
		
		System.out.println("I am test6");
	}
	
	@Test(groups= {"group1", "group2"})
	public void group1and2() {
		 System.out.println("I am belongs to group1and2"); }
	
	@Test(dependsOnMethods= {"test7"}) 
	  public void group2() {
	  System.out.println("I am belongs to group-2"); }
	
	@Test(dependsOnMethods= {"test8"}) 
	  public void group1() {
	  System.out.println("I am belongs to group-1"); }
	
	@Test()
	 public void test7()
	{
		
		System.out.println("I am test 7");
	}
	@Test()
	 public void test8()
	{
		
		System.out.println("I am test 8");
	}
	

}
