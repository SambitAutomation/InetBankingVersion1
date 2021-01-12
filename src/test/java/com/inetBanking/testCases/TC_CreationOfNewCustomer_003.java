package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.pageObjects.NewCustomerPage;

public class TC_CreationOfNewCustomer_003 extends BaseClass {

	  @Test
	  public void creationofNewCUSTOMER()throws Exception
	  {
		  try
		  {
		  LoginPage lpc=new LoginPage(driver);
			
			lpc.setUserName("mngr302930");
			logger.info("UserName has entered");
			
			lpc.setPassword("AmEsyzE");
			logger.info("Password has entered");
			
			lpc.clickSubmit(); 
			logger.info("Login button Clicked");
			
		  NewCustomerPage cs=new NewCustomerPage(driver);
		  
		  cs.CreateNewCustomer();
		  Thread.sleep(2000);
		  logger.info("New  customer link clicked");
		  
		  cs.CustomerName("TestUserBankTwo");
		  Thread.sleep(2000);
		  logger.info("Customer Name has entered");
		  
		  cs.choosingOfGender();
		  Thread.sleep(2000);
		  logger.info("Gender has chosen");
		  
		  cs.enterCustomerDateOfBirth(11);
		  cs.enterCustomerDateOfBirth(12);
		  cs.enterCustomerDateOfBirth(2008);
		  Thread.sleep(2000);
		  logger.info("DOB has entered");
		  
		  cs.addresOfCustomer("USA");
		  Thread.sleep(2000);
		  logger.info("Address has entered");
		  
		  cs.CityNameOfCustomer("Californiazz");
		  Thread.sleep(2000);
		  logger.info("CityName has entered");
		  
		  cs.StateNameOfCustomer("UA");
		  Thread.sleep(2000);
		  logger.info("StateName has entered");
		  
		  cs.PinNumberOfCustomer(1092883);
		  Thread.sleep(2000);
		  logger.info("PinCode has entered");
		  
		  cs.mobileNumber(1239562983);
		  Thread.sleep(2000);
		  logger.info("MobileNumber has entered");
		  
		  cs.customerEmailId();
		  Thread.sleep(2000);
		  logger.info("Emailid has entered");
		  
		  cs.customerPassword("sdkhtfwf");
		  Thread.sleep(2000);
		  logger.info("Password has entered");
		  
		  cs.clickOnSubmit();
		  Thread.sleep(5000);
		  logger.info("Newcutomer account has entered");
		  
		  }
		  catch(Exception e)
		  {
			  captureScreen(driver, "FailedCase");
			  System.out.println(e.getMessage());
		  }
		  
	  }
	
	
	
}
