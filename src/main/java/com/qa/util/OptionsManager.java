package com.qa.util;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsManager {
	
	// get Chrome Options
	
	public static ChromeOptions getChromeOptions()
	{
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--start-maximized");
		//co.addArguments("--headless");
		co.addArguments("--ignore-certificate-errors");
		co.addArguments("--disable-popup-blocking");
	//	co.addArguments("--incognito");
		
		return co;
		
	}
	
	// get FireFox options
	public static FirefoxOptions getFirefoxOptions()
	{
		FirefoxOptions fo= new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		
		fo.setCapability(FirefoxDriver.PROFILE, profile);
		return fo;
	}
	
	
	
	
	
	

}
