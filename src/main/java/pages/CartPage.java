package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utlities.WaitUtil;

public class CartPage {
	
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Your Cart']")
	private WebElement Cartpagetitle;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	private WebElement Cartitemtitle;
	
	@FindBy(xpath="//div[@class='inventory_item_price']")
	private WebElement Itemprice;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement CheckOutButton;
	
	public String getcartpageTitle() {
		String title= Cartpagetitle.getText();
		return title;
	}
	
	public String getcartItemTitle() {
		String title= Cartitemtitle.getText();
		return title; 
	}
	
	public String getitemprice() {
		String price= Itemprice.getText();
		return price;
	}
	
	public void clickoncheckoutbutton() {
		WaitUtil util = new WaitUtil(driver);
		util.waitForElementClickable(CheckOutButton);
		CheckOutButton.click();
		
	}
	
	
}
