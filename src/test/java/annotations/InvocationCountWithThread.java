package annotations;

import org.testng.annotations.Test;

public class InvocationCountWithThread {
	
	@Test(invocationCount = 3, threadPoolSize = 3)
	public void invocationCountTest() {
		System.out.println("I am invocation count method");
		System.out.println(Thread.currentThread());
	}

}
