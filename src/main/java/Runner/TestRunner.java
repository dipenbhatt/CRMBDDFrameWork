package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\QA\\CucumberWorkSpace\\FreeCRMBDDFrameWrok\\src\\main\\java\\Features\\taggedhooks.feature",
		glue= {"stepDefinitions"},
	    plugin = {"pretty","html:html_output/test-output.html","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
	    monochrome=true,
	    dryRun = false
	   // tags = "@SmokeTest or @RegressionTest"
		)

public class TestRunner {
	//ORed : tags = "@SmokeTest or @RegressionTest" -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = "@SmokeTest and @RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest

}
