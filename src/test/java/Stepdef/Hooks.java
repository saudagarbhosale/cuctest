package Stepdef;

import org.openqa.selenium.WebDriver;

import TestBase.TestBaseClass;
import TestBase.manager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;



public class Hooks {
	
 public manager manager;
	public Hooks(manager manager)
	{
		this.manager=manager;
	}
	
	
	@After
	public void closebrowser()
	{
		manager.driver.close();
		
		
	}
	@AfterStep
	public void getsc(Scenario sce)
	{
		if(sce.isFailed())
		{
			System.out.println("I am taking screenshot");
		}
	}
}
