package test;
import org.apache.log4j.*;
import org.testng.annotations.AfterMethod;

//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.Catlogpage;
import pages.Loginpage;

public class LoginTest extends Baseclass {
	Loginpage loginpage;
	Catlogpage catlogpage;
	
	private static Logger log = LogManager.getLogger(LoginTest.class.getName());
	public LoginTest(){
		super();
	}
@BeforeTest
	public void setup() {
	intialization();
		loginpage=new Loginpage();
		catlogpage=new Catlogpage();
	
	}
@Test (priority=1)
public void womancolth() {
	loginpage.womansection();
	log.info("Womens section");
	//log.error(message, t);
	
}
@AfterMethod
public void teardown() {
	drivers.quit();
}
}
