package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue={"stepdefinition","hooks"},
		tags={"@social"},
		//dryRun=true,
		plugin = { "pretty","html:reports/cucumber-pretty","json:reports/jsonreport.json","junit:reports/xmlreport.xml"}
		)

public class TestRunner {
	

}
