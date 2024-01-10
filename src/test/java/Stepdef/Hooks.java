package Stepdef;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;



public class Hooks {

	@AfterStep
	public void getsc(Scenario sce)
	{
		if(sce.isFailed())
		{
			System.out.println("I am taking screenshot");
		}
	}
}
