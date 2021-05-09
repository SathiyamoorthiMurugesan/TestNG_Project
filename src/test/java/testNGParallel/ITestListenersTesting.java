package testNGParallel;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenersTesting implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("On Test start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

}