package testNGParallel;

import org.testng.annotations.Test;

public class RunningTwoMethodsParallel {

	@Test
	public  void test1() {
		
		for(int i=0;i<=20;i++) {
			System.out.println("the value is:"+i);
		}
		System.out.println("I am test1 thread ID is = "+ Thread.currentThread().getId());
	}
	
	@Test
	public void test2() {
		for(int i=40;i<=60;i++) {
			System.out.println("the value is:"+i);
		}
		System.out.println("I am "
				+ "test2 thread ID is = "+ Thread.currentThread().getId());
	}
}
