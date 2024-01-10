package TestRun;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(features="@target/faileds.txt", glue="Stepdef")
	public class TestFailure extends AbstractTestNGCucumberTests{

		@DataProvider(parallel=true)
		public Object[][] scenarios()
		{
			return  super.scenarios();
		}
	}


