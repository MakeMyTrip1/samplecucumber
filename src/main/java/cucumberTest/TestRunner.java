package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature",glue={"stepDefinition"},plugin={"html:target/StatusReport"})

public class TestRunner {
	
	
	

}
