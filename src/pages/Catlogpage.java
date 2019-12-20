package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Catlogpage extends Baseclass{

	@FindBy(xpath="//div[@class=\"product-image-container\"]")
	WebElement prodcutselection;
	
	@FindBy(xpath="//div[@class=\"button-container\"]/a[@class=\"button ajax_add_to_cart_button btn btn-default\"]/span")
	WebElement addtocartbutton;
	@FindBy(linkText="Proceed to checkout")
	WebElement proceedforcheckout;
	@FindBy(xpath="//p[@class='cart_navigation clearfix']/a/span")
	WebElement proceedforcheckoutoncartpage;

public Catlogpage() {
	PageFactory.initElements(drivers, this);
	}

public Checkoutpage addtocart() {
	Actions action=new Actions(drivers);
	action.moveToElement(prodcutselection).perform();
	addtocartbutton.click();
	proceedforcheckout.click();
	proceedforcheckoutoncartpage.click();
	return new Checkoutpage();
	
}
}