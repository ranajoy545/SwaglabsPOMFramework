package utlities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	private WebDriver driver;
    private static WebDriverWait wait;

    // Constructor
    public WaitUtil(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Wait for visibility of element
    public  WebElement waitForElementVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Wait for element to be clickable
    public  WebElement waitForElementClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Wait for presence of element
    public WebElement waitForElementPresence(org.openqa.selenium.By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Wait for title contains
    public boolean waitForTitleContains(String title) {
        return wait.until(ExpectedConditions.titleContains(title));
    }

    // Wait for URL contains
    public boolean waitForUrlContains(String url) {
        return wait.until(ExpectedConditions.urlContains(url));
    }
	
	
}
