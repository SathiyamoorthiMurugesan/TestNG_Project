package annotations;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 100)
	public void method1() {
		System.out.println("hello");
	}

}
