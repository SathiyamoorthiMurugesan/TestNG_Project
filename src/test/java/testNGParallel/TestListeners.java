package testNGParallel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenersTesting.class)

@Test
public class TestListeners {

	public void success() {
		System.out.println(" I am a success class");
	}
	
	public void failure() {
		System.out.println(1/0);
		System.out.println("I am a failure class");
	}
}
