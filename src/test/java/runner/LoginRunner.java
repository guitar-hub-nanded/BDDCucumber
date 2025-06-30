package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"C:\\Users\\dheeraj.singh\\eclipse-workspace\\BddTest\\src\\test\\resources\\appfeatures\\login.feature"},
		glue = {"steps"}
		
		)

public class LoginRunner extends AbstractTestNGCucumberTests
{

}
