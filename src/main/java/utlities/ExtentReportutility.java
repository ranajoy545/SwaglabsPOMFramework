package utlities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportutility {
	static ExtentReports report;
	static ExtentSparkReporter reporter;
	static ExtentTest test;

	public static void setupreport() {
		report = new ExtentReports();
		reporter = new ExtentSparkReporter(
				"G:\\Selenium Automation Framework\\SwaglabsPOMFramework\\Reports\\Reports.html");
		report.attachReporter(reporter);
	}

	public static ExtentTest starttest(String testname) {
		test = report.createTest(testname);
		return test;
	}

	public static void flushreport() {
		report.flush();

	}

}
