package testNGParallel;

import org.testng.annotations.Test;

public class RunningTwoMethodsParallel {

	@Test
	public  void test1() {
		System.out.println("I am test1 thread ID is = "+ Thread.currentThread().getId());
	}
	
	@Test
	public void test2() {
		System.out.println("I am test2 thread ID is = "+ Thread.currentThread().getId());
	}
}
