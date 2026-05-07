package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.Loginpage;


public class LoginTest extends BaseTest {
	
	@Test(priority=1)
	public void validatetitle() {
		
		  String Actual = driver.getTitle();
		  logger.info("validateing the title");
		  System.out.println(Actual);
		  String Exp="Swag Labs";
		  Assert.assertEquals(Actual, Exp);
		  logger.info("title validated");
	}
	
	
    @Test(priority=0)
	public void Validatelogin() {
	  Loginpage lp = new Loginpage(driver);
	  lp.enterusername(pro1.getProperty("username"));
	  logger.info("username has entered");
	  lp.enterpassword(pro1.getProperty("password"));
	  logger.info("password has entered");
	  lp.clickloginbutton();
  }
}
