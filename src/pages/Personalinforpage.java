package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Baseclass;
import uitility.XlsReader;

public class Personalinforpage extends Baseclass implements Personaldetails   {

	@FindBy(id="uniform-id_gender2")
	WebElement Title;
	@FindBy(id="customer_firstname")
	WebElement Firstname;
	@FindBy(id="customer_lastname")
	WebElement Lastname;
	@FindBy(xpath="//input[@id=\"passwd\"]")
	WebElement Password;
	@FindBy(id="days")
	WebElement Date;
	@FindBy(id="months")
	WebElement Month;	
	@FindBy(xpath="//div[@class='col-xs-4']/div/select [@id='years']")
	WebElement years;	
	@FindBy(id="address1")
	WebElement address;		
	@FindBy(id="city")
	WebElement city;		
	@FindBy(id="uniform-id_state")
	WebElement state;		
	@FindBy(id="postcode")
	WebElement postalcode;	
	@FindBy(id="id_country")
	WebElement country;	
	@FindBy(id="phone_mobile")
	WebElement Mobilephone;		
	@FindBy(id="alias")
	WebElement address_alias;	
	@FindBy(id="submitAccount")
	WebElement Resister;
	
	public Personalinforpage(){
	PageFactory.initElements(drivers,this);
	}
	

	String firstName;
	String lastName;
	String password;
     String days;
	String month;
	String yearsnum;
	String useraddress;
	String usercity;
	String userstate;
	String mobile;

	
	public void readxls() throws Exception {
		XlsReader.setExcelFile("D://Yatra/src/Data/Registerdata.xlsx", "Testcases");
		firstName=XlsReader.getCellData(0, 1);
		 lastName=XlsReader.getCellData(1, 1);
		password=XlsReader.getCellData(2, 1);
		days=XlsReader.getCellData(3, 1);
		month=XlsReader.getCellData(4, 1);
		yearsnum=XlsReader.getCellData(5, 1);
		useraddress=XlsReader.getCellData(6, 1);
		usercity=XlsReader.getCellData(7, 1);
		userstate=XlsReader.getCellData(8, 1);
		mobile=XlsReader.getCellData(9, 1);

		
	}	
	public void Title() {
		Title.click();
	}
	
	@Override
	public void EnterFirstName() {
		// TODO Auto-generated method stub
		Firstname.sendKeys(firstName);
	}

	@Override
	public void EnterLastName() {
		// TODO Auto-generated method stub
		Lastname.sendKeys(lastName);	
	}

	@Override
	public void EnterPassword() {
		// TODO Auto-generated method stub
		Password.sendKeys(password);	
	}
   
	

	@Override
	public void SelectDate() {
		// TODO Auto-generated method stub
		Select Dateselection=new Select(Date);
		Dateselection.selectByValue("12");
	}

	@Override
	public void SelectMonth() {
		// TODO Auto-generated method stub
		Select Monthselection=new Select(Month);
		Monthselection.selectByValue("9");
	}

	@Override
	public void Selectyears() {
		// TODO Auto-generated method stub
		Select yearselection=new Select(years);
		yearselection.selectByValue("1989");
	}

	@Override
	public void Enteraddress() {
		// TODO Auto-generated method stub
		address.sendKeys(useraddress);
		
	}

	@Override
	public void Entercity() {
		// TODO Auto-generated method stub
		city.sendKeys(usercity);
	}

	@Override
	public void Selectstate() {
		// TODO Auto-generated method stub
		Select Stateselection=new Select(state);
		Stateselection.selectByVisibleText(userstate);
		
	}

	@Override
	public void Enterpostalcode() {
		// TODO Auto-generated method stub
		postalcode.sendKeys("73301");
	}

	@Override
	public void Selectcountry() {
		// TODO Auto-generated method stub
		if(country.isSelected()) {
			System.out.println(country.getText());
		}
	}

	@Override
	public void EnterMobilephone() {
		// TODO Auto-generated method stub
		Mobilephone.sendKeys(mobile);
	}

	@Override
	public void Enteraddress_alias() {
		// TODO Auto-generated method stub
		address_alias.sendKeys("Test1");
		
	}

	public void ClickResister() {
		Resister.click();
		
	}
}
