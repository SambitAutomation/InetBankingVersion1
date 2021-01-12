package com.inetBanking.pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	
	WebDriver ndriver;
	
	public NewCustomerPage(WebDriver rdriver)
	{
		ndriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(linkText = "New Customer")
	@CacheLookup
	WebElement NewCustomerAccount;
	
	@FindBy(xpath = "//input[@name='name']")
	@CacheLookup
	WebElement customerName;
	
	@FindBy(xpath = "(//input[@name='rad1'])[1]")
	@CacheLookup
	WebElement chooseGender;
	
	@FindBy(xpath = "//input[@name='dob']")
	@CacheLookup
	WebElement DateOfBirth;
	
	@FindBy(xpath = "//textarea[@name='addr']")
	@CacheLookup
	WebElement Address;
	
	@FindBy(xpath = "//input[@name='state']")
	@CacheLookup
	WebElement stateName;
	
	
	@FindBy(xpath = "//input[@name='city']")
	@CacheLookup
	WebElement cityName;
	
	@FindBy(xpath = "//input[@name='pinno']")
	@CacheLookup
	WebElement PinNumber;
	
	@FindBy(xpath = "//input[@name='telephoneno']")
    @CacheLookup
    WebElement MobileNumber;
	
	@FindBy(xpath = "//input[@name='emailid']")
	@CacheLookup
	WebElement EmailId;
	
	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath = "//input[@name='sub']")
	@CacheLookup
	WebElement SubmitOption;
	
	public void CreateNewCustomer()
	{
		NewCustomerAccount.click();
	}
	
	public void CustomerName(String NameOfTheCustomer)
	{
		customerName.sendKeys(NameOfTheCustomer);
	}
	
	public void choosingOfGender() 
	{
		chooseGender.click();
	}
	
	public void enterCustomerDateOfBirth(int DOB)
	{
		DateOfBirth.sendKeys(String.valueOf(DOB));
	}
	
	public void addresOfCustomer(String Adress)
	{
		Address.sendKeys(Adress);
	}
	
	public void CityNameOfCustomer(String cityNAme)
	{
		cityName.sendKeys(cityNAme);
	}
	
	public void StateNameOfCustomer(String stateNAme)
	{
		stateName.sendKeys(stateNAme);
	}
	
	
	public void PinNumberOfCustomer(int pinno)
	{
		PinNumber.sendKeys(String.valueOf(pinno));
	}
	
	public void mobileNumber(int MobileNumberz)
	{
		MobileNumber.sendKeys(String.valueOf(MobileNumberz));
	}
	
	public void customerEmailId()
	{
		
		EmailId.sendKeys(randomvalue()+"@gmail.com");
	}
	
	public void customerPassword(String pwdz)
	{
		Password.sendKeys(pwdz);
	}
	
	public void clickOnSubmit()
	{
		SubmitOption.click();
	}
	
	public String randomvalue()
	{
		String EMAILID=RandomStringUtils.randomAlphabetic(5);
		return EMAILID;
	}
	
	
}
