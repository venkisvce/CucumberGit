package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:/Users/Venkat/eclipse-workspace/CRMcucumber/src/main/java/Features/login.feature", //the path of the feature files
			glue={"StepDefinitions"}, //the path of the step definition files
			format= {"pretty","html:test-outout","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
			dryRun= false,
			strict= true,
			monochrome= true
			)
public class TestRunner {

	
	
	
}
  