package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.Catlogpage;

public class CatlogTest extends Baseclass {
	Catlogpage catlogpage;
	public CatlogTest() {
		super();
	}
	@BeforeMethod
public void setup() {
	intialization();
	catlogpage=new Catlogpage();
}
@Test(priority=2)
public void cartpage() {
	catlogpage.addtocart();
}
@AfterMethod

public void teardown() {
	drivers.quit();
}
}
