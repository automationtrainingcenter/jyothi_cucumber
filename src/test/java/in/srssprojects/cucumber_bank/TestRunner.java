package in.srssprojects.cucumber_bank;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		features = {"src/test/java/features"},
		glue = {"stepdefinitions"},
		monochrome = true
		)
public class TestRunner {

}
