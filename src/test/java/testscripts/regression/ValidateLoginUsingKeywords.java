package testscripts.regression;

import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateLoginUsingKeywords extends BaseTest {
	
	@Test
	public void loginTest()
	{	
		
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.startBrowser();
		
		app.launchApp();
		
		app.type("username_textbox", "reyaz0806");
		
		app.type("password_textbox", "reyaz123");
		
		app.click("login_button");
		
		app.verifyTitle("Adactin.com - Search Hotel");
		
	}

}