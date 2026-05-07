package base;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import utlities.ExtentReportutility;
import utlities.LoggerManager;
import utlities.Screenshotutil;
import utlities.WebDriverFactory;

public class BaseTest {
	public WebDriver driver;
	public Properties pro1;
	public ExtentTest test;
	protected Logger logger;
   
	@BeforeClass
	public void Setup() {
		logger = LoggerManager.getlogger(this.getClass());
		pro1=new Properties();
		try {
			FileInputStream fis = new FileInputStream(".//src//test//resources//config.properties");
			pro1.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		driver = WebDriverFactory.initbrowser(pro1.getProperty("Browser"));
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 	driver.get(pro1.getProperty("url"));
	 	ExtentReportutility.setupreport();
	}
	@BeforeMethod
	public void starttest(Method meth) {
		
		test=ExtentReportutility.starttest(meth.getName());
	}
	
	@AfterMethod
	public void teardown(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
	     test.log(Status.FAIL, "Test is failed");
		Screenshotutil.getscreenshot(driver, result.getName());
		}	
		if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test is passed");
		}
	}
	
	@AfterTest
	public void generateReport() {
		ExtentReportutility.flushreport();
	}
	
}
