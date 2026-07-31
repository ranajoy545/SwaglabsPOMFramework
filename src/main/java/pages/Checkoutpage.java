package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
  
	WebDriver driver;
	
	public Checkoutpage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);		
	}
	
	@FindBy(xpath = "//input[@id ='first-name']")
    private WebElement Firstname;
    
    @FindBy(xpath="//input[@id ='last-name']")
    private WebElement Lastname;
    
    @FindBy(xpath="//input[@id ='postal-code']")
    private WebElement Postalcode;
    
    @FindBy(xpath="//input[@id ='continue']")
    private WebElement Continuebtn;
	
    public void enterfirstname(String firstname1) {
    	Firstname.sendKeys(firstname1);
    	
    }
    public void enterlastname(String lastname1) {
    	Lastname.sendKeys(lastname1);
    }
    
    public void enterpostalcode(String postalcode) {
    Postalcode.sendKeys(postalcode);    	    	
    }
    
    public void clickoncontinuebutton() {
    	Continuebtn.click();
    }
	
	
}
