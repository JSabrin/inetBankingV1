package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	LoginPage(WebDriver rdriver){
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	
	
	
	
	
	
	
}
