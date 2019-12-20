package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Loginpage extends Baseclass {
	@FindBy(xpath="//div[@id=\"block_top_menu\"]/ul/li/a[contains(@href,\"http://automationpractice.com/index.php?id_category=3&controller=category\")]")
	WebElement Woman_dress;
	
	@FindBy(linkText="Casual Dresses")
	WebElement Woman_casualdress;
	
	public Loginpage() {
		PageFactory.initElements(drivers, this);
	}
	

	
	public Catlogpage womansection() {
		
	Actions action=new Actions(drivers);
	action.moveToElement(Woman_dress).perform();
	Woman_casualdress.click();
	return new Catlogpage();
	
	}

	

}