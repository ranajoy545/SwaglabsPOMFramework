package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
    WebDriver driver;
    
    public Loginpage(WebDriver driver) {
    	
    	this.driver=driver;
    	PageFactory.initElements(driver, this); 	
    }
    
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernamefield;
    
    @FindBy(xpath="//input[@id='password']")
    private WebElement passwordfield;
    
    @FindBy(xpath="//input[@id='login-button']")
    private WebElement loginbtn;
    
    public void enterusername(String username) {
    	//usernamefield.clear();
    	usernamefield.sendKeys(username);
    	
    }
    public void enterpassword(String password) {
    	//passwordfield.clear();
    	passwordfield.sendKeys(password);    	
    }
    public void clickloginbutton() {
    	loginbtn.click();
    }
    
    
    
    

}
