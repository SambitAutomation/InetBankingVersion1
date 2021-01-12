package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		
		try
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is "+ e.getMessage()) ;
		}
	}

	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
		String username=pro.getProperty("usename");
		return username;
	}
	
	public String getPassword()
	{
		String pwd=pro.getProperty("password");
		return pwd;
	}
	
	public String getChromePath()
	{
		String chromePAth=pro.getProperty("chromepath");
		return chromePAth;
	}
	
	public String getIEPath()
	{
		String IEpath=pro.getProperty("iepath");
		return IEpath;
	}
	
	public String getFireFoxPath()
	{
		String FireFoxPAth=pro.getProperty("firefoxpath");
		return FireFoxPAth;
	}
}
