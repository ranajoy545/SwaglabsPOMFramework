package utlities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	static WebDriver driver;
	static ChromeOptions option;
	public static WebDriver initbrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			 option= new ChromeOptions();
			//option.addArguments("--incognito");
			option.addArguments("--guest");
			//option.addArguments("--headless");	
			option.addArguments("--disable-notifications");
			//option.addArguments("--start-maximized");
			driver = new ChromeDriver(option);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}
		else {
			System.out.println("no browser instance found");
		}
		
		return driver;
	}

}
