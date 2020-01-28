package com.unimoni.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersEx implements ITestListener {

	// When Test case get failed, this method is called.
	public void onTestFailure(ITestResult result) {
		System.out.println("The name of the testcase failed is :" + result.getName());
	}

	// When Test case get Skipped, this method is called.
	public void onTestSkipped(ITestResult Result) {
		System.out.println("The name of the testcase Skipped is :" + Result.getName());
	}

	// When Test case get Started, this method is called.
	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName() + " test case started");
	}

	// When Test case get passed, this method is called.
	public void onTestSuccess(ITestResult Result) {
		System.out.println("The name of the testcase passed is :" + Result.getName());
	}

	// ISuiteListener, IInvokedMethodListener
	public void onFinish(ITestContext Result) {
		System.out.println("On finishing..");
	}

	public void onStart(ITestContext iTestContext) {
		System.out.println("On start..");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
	}

}
