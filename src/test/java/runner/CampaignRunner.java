package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\Campaign.feature"},
		
		glue = {"steps", "hooks"},
		
		plugin = {"pretty"}
		)
public class CampaignRunner extends AbstractTestNGCucumberTests{

}
