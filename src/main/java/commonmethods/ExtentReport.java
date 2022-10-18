package commonmethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	static ExtentReports extent;
	static ExtentSparkReporter spark ;
	static ExtentTest test;
	public void extentsetup() {
		
		 extent = new ExtentReports();
		 spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		 test=extent.createTest("popitemstext");

	}
	
	public void pass() {
		test.pass("text of the product matches with expected");
		
	}

	public void fail() {
		test.fail("text of the product notmatches with expected");
		test.addScreenCaptureFromPath("C:\\\\Users\\\\kiran\\\\eclipse-workspace\\\\mavenseleniumproject\\\\resource\\\\schot\\\\error1.png");
	}
	
	public void genre () {
		
		extent.flush();
	}
	
}
