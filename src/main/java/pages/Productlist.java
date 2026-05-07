package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productlist {

	WebDriver driver;

	public Productlist(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addtocartbtn;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement carticon;

	@FindBy(xpath = "//span[text()='Products']")
	private WebElement productpagetitle;

	public void clickonaddtocartbutton() {
		addtocartbtn.click();

	}

	public void clickoncarticon() {
		carticon.click();

	}

	public String pagetitle() {
		String title = productpagetitle.getText();
		return title;
	}

}
