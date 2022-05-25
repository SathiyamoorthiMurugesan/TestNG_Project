package annotations;

import org.testng.annotations.Test;

public class InvocationCount {
	
	
	@Test(invocationCount = 3)
	public void invocationCountTest() {
		System.out.println("I am invocation count method");
		System.out.println(Thread.currentThread());
	}

}
