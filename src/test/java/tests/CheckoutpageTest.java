package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.CartPage;
import pages.Checkoutpage;
import pages.Loginpage;
import pages.Productlist;

public class CheckoutpageTest extends BaseTest {
    @Test 
	public void validatecheckoutpage() {

		Loginpage lp = new Loginpage(driver);
		lp.enterusername(pro1.getProperty("username"));
		lp.enterpassword(pro1.getProperty("password"));
		lp.clickloginbutton();

		Productlist pl = new Productlist(driver);
		String pagetitle = pl.pagetitle();
		Assert.assertEquals(pagetitle, "Products");
		System.out.println("The Page title is:" + pagetitle);
		pl.clickonaddtocartbutton();
		pl.clickoncarticon();

		CartPage cp = new CartPage(driver);
		cp.clickoncheckoutbutton();

		Checkoutpage checkout = new Checkoutpage(driver);
		checkout.enterfirstname("ranajoy");
		checkout.enterlastname("mukherjee");
		checkout.enterpostalcode("700109");
		checkout.clickoncontinuebutton();

	}

}
