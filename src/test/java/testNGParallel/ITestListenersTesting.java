package testNGParallel;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenersTesting implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}