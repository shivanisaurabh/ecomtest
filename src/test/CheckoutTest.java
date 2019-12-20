package test;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.Catlogpage;
import pages.Checkoutpage;
import pages.Loginpage;

public class CheckoutTest extends Baseclass {
	Loginpage loginpage;
	Catlogpage catlogpage;
	Checkoutpage checkoutpage;
	
	
	public CheckoutTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		loginpage=new Loginpage();
		catlogpage=new Catlogpage();
		checkoutpage=new Checkoutpage();
	}
	
	@Test(priority=3)
	
	public void createloginforcheckout() {
		loginpage.womansection();
		catlogpage.addtocart();
		checkoutpage.createlogin();
		
	}
	
	@AfterMethod

	public void teardown() {
		drivers.quit();
	}
}
