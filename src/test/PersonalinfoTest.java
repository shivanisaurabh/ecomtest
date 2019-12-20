package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.Catlogpage;
import pages.Checkoutpage;
import pages.Loginpage;
import pages.Personalinforpage;
import uitility.XlsReader;

public class PersonalinfoTest extends Baseclass{
	Loginpage loginpage;
	Catlogpage catlogpage;
	Checkoutpage checkoutpage;
	Personalinforpage personalinfopage;
	XlsReader readxls;
	PersonalinfoTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		intialization();
		loginpage=new Loginpage();
		catlogpage=new Catlogpage();
		checkoutpage=new Checkoutpage();
		personalinfopage=new Personalinforpage();
		loginpage.womansection();
		catlogpage.addtocart();
		checkoutpage.createlogin();
		 

	
	}
	@Test
	public void Resisterforwebsite() throws Exception {
		personalinfopage.readxls();
	personalinfopage.Title();
	personalinfopage.EnterFirstName();
	personalinfopage.EnterLastName();
	personalinfopage.EnterPassword();
	personalinfopage.SelectDate();
	personalinfopage.SelectMonth();
	personalinfopage.Selectyears();
	personalinfopage.Enteraddress();
	personalinfopage.Entercity();
	personalinfopage.Selectstate();
	personalinfopage.Enterpostalcode();
	personalinfopage.Selectcountry();
	personalinfopage.EnterMobilephone();
	personalinfopage.Enteraddress_alias();
	personalinfopage.ClickResister();
		
	}
	@AfterMethod

	public void teardown() {
		drivers.quit();
	}
}
