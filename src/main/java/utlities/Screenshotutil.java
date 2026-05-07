package utlities;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;

public class Screenshotutil {
 
	public static void getscreenshot(WebDriver driver,String testname) {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("G:\\Selenium Automation Framework\\SwaglabsPOMFramework\\Screenshots\\"+testname+".png");
		try {
			Files.copy(src, trg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
