package in.srssprojects.cucumber_bank;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		features = {"src/test/java/features"},
		glue = {"stepdefinitions"},
		monochrome = true,
		plugin = {"pretty", "html:target/report"}
		,tags = {"@invalid_rolename or @invalid_username"}
		)
public class TestRunner {

}
/* anding of tags
 * {"@tag1", "@tag2"} executes scenarios which contains both tag1 and tag2
 * 
 * oring of tags
 * {"@tag1,@tag2"} executes scenarios which contains either tag1 or tag2
 * In latest version of cucumber the above oring will not work
 * we have to following syntax
 * {"@tag1 or @tag2"} 	
 */
