package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.CartPage;
import pages.Loginpage;
import pages.Productlist;
import utlities.WaitUtil;

public class CartPageTest extends BaseTest {

	@Test(priority = 1)
	public void validatecartpageTitle() {

		Loginpage lp = new Loginpage(driver);
		lp.enterusername(pro1.getProperty("username"));
		lp.enterpassword(pro1.getProperty("password"));
		lp.clickloginbutton();

		Productlist pl = new Productlist(driver);
		String pagetitle = pl.pagetitle();
		Assert.assertEquals(pagetitle, "Products");
		System.out.println("The Page title is:" + pagetitle);
		logger.info("validating the product page title");
		pl.clickonaddtocartbutton();
		pl.clickoncarticon();

		CartPage cp = new CartPage(driver);
		String ActualTitle = cp.getcartpageTitle();
		String ExpectTitle = "Your Cart";
		Assert.assertEquals(ActualTitle, ExpectTitle);
		logger.info("validateing the Cart page title");

	}
	
	@Test(priority = 2)
	public void validateCartitemtitle() {
		CartPage cp = new CartPage(driver);
		String ActualItemTitle = cp.getcartItemTitle();
		String ExpectedItemTitle = "Sauce Labs Backpack";
		Assert.assertEquals(ActualItemTitle,ExpectedItemTitle );
		
	}
	@Test(priority = 3)
	public void validateItemprice() {
		CartPage cp = new CartPage(driver);
		String ActualPrice = cp.getitemprice();
		String Expectedprice = "$29.99";
		Assert.assertEquals(ActualPrice,Expectedprice );
		
	}
	@Test(priority = 4)
	public void checkoutbuttonclick(){
		CartPage cp = new CartPage(driver);
		//Thread.sleep
		cp.clickoncheckoutbutton();
		
		
	}
}
