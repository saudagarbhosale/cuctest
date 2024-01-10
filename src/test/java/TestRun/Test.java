package TestRun;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Featurefile", glue="Stepdef", tags="@first", plugin={"rerun:target/faileds.txt"})
public class Test extends AbstractTestNGCucumberTests{

	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return  super.scenarios();
	}
}
