package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\appfeatures\\Scenario_outline.feature"},
		glue= {"steps"}
		)

public class Scenario_outline_Runner extends AbstractTestNGCucumberTests{

}
