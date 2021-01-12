package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.XLutils;



public class TC_LoginDDT_002  extends BaseClass{
	
	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pwd)throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		logger.info("user name provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();    //close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login Failed");
		}
		
		else {
			 Assert.assertTrue(true);
			 logger.info("Login Passed");
			 
			 lp.clickLogout();
			 driver.switchTo().alert().accept(); 
			 Thread.sleep(3000);//close the logout alert
			 driver.switchTo().defaultContent();
		}
	}
	
	public boolean isAlertPresent()
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}
		
		catch (Exception e) {
			return false;
		}
	}
	

	@DataProvider(name = "LoginData")
	public String[][] getuserdata()throws Exception
	{
		XLutils HelperData=new XLutils();
		String[][] data=HelperData.getDataFromSheet("D:\\Selenium_Practice\\InetBanking\\src\\test\\java\\com\\inetBanking\\testData\\LoginData.xlsx","Sheet1");
	   
		return data;
	}
	
	
}
