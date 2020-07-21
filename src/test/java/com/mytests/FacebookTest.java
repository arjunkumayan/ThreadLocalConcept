package com.mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.factory.TLDriverFactory;

public class FacebookTest extends TestBase{
	
	
	@Test
	public void FBTitleTest_1()
	{
		TLDriverFactory.getTLDriver().get("https://www.facebook.com");
		
		String title = TLDriverFactory.getTLDriver().getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}
	
	@Test
	public void FBTitleTest_2()
	{
		TLDriverFactory.getTLDriver().get("https://www.facebook.com");
		
		String title = TLDriverFactory.getTLDriver().getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}


}
