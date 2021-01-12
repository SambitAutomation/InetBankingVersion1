package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest()throws Exception
	{
		
		
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("UserName has entered");
		
		lp.setPassword(password);
		logger.info("Password has entered");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test Passed");
		}
		
		else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test Failed");
		}
		
	}
	
	
	

}
