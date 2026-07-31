package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Loginpage;
import pages.Productlist;

public class ProductlistTest extends BaseTest {

	@Test()
	public void validateproductincart() {
		  Loginpage lp = new Loginpage(driver);
		  lp.enterusername(pro1.getProperty("username"));
		  lp.enterpassword(pro1.getProperty("password"));
		  lp.clickloginbutton();
		  Productlist pl = new Productlist(driver);
		  String pagetitle = pl.pagetitle();
		  Assert.assertEquals(pagetitle, "Products");
		  System.out.println("The Page title is:"+pagetitle);
		  pl.clickonaddtocartbutton();
		  pl.clickoncarticon();		
	} 
}
