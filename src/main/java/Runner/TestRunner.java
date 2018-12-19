package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="F:\\Sample Work Space\\FreeCRMBDDPractise\\src\\main\\java\\Features\\tagging.feature",
		glue={"Stepdefinitions"},
		format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome=true,
		dryRun=false,
		strict=true,
		tags={"~@End2End","~@SmokeTest"} // , means OR operator
		)

	//	OR:{"@End2End,@SmokeTest"} - execute all tests tagged as @End2End OR @SmokeTest
	// AND : tags={"@End2End","@SmokeTest"} - Execure all tests tagged as @End2End and @smokeTest
	// {"~@End2End","@SmokeTest"} ignore End2End use this ~@End2End


public class TestRunner {

}
