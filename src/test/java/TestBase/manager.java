package TestBase;

import org.openqa.selenium.WebDriver;

import POM.POMManager;

public class manager{
	public POMManager POMManager;
	public TestBaseClass TestBaseClass;
	public WebDriver driver;
	
	public void getDriver()
	{
		TestBaseClass=new TestBaseClass();
		driver=TestBaseClass.Openbrowser();
		POMManager=new POMManager(driver);
		
	}

}
