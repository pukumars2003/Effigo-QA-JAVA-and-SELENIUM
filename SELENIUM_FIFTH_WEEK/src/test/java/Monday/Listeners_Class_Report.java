package Monday;

import org.testng.ITestContext;
import org.testng.*;
import org.testng.ITestListener;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.*;
public class Listeners_Class_Report implements ITestListener {
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
		sparkReporter =new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/report.html");
		sparkReporter.config().setDocumentTitle("Demo Testing");
		sparkReporter.config().setReportName("Demo Testing");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Tester name", "Ajay");
	}
	
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS,"Test case Passed "+ result.getName());
		
	}
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,"Test case failed "+result.getName());
		test.log(Status.FAIL, "Test Case Failed cause is: "+result.getThrowable());
	}
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
}
