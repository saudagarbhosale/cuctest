package POM;

import org.openqa.selenium.WebDriver;

import TestBase.TestBaseClass;

public class POMManager {
	
	public Login_page log;
	public POMManager(WebDriver driver)
	{
		
		log=new Login_page(driver);
	}
	
		 
	
}
