package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Checkoutpage extends Baseclass {
	@FindBy(id="email_create")
	WebElement createlogin;
	@FindBy(id="SubmitCreate")
	WebElement submitcreatelogin;
	
	
	public Checkoutpage() {
		PageFactory.initElements(drivers,this);
	}
	
public Personalinforpage createlogin() {
	createlogin.sendKeys(prop.getProperty("Email_id"));
	submitcreatelogin.click();
	return new Personalinforpage();
	
}
}
