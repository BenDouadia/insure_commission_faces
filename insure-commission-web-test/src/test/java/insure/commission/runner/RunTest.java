package insure.commission.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/testCases",
		glue = {"insure.commission"},
		plugin = {
				"json:target/cucumber.json",
				"pretty:target/cucumber-pretty.json",
				"junit:target/cucumber.xml"
		},
		monochrome = true
		)

public class RunTest {

}
