package com.mazda.automation.Cucumber;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/report/cucumber.json", 
	//Set retry count for rerunning the failed test cases
//		retryCount = 1, 
		detailedReport = true, detailedAggregatedReport = true, overviewReport = true,
		coverageReport = true,
		jsonUsageReport = "target/report/cucumber-usage.json", usageReport = true, toPDF = true, excludeCoverageTags = {
				"@flaky" }, includeCoverageTags = { "@passed" }, outputFolder = "target/report")
@CucumberOptions(plugin = { "html:target/report/cucumber-html-report",
        "json:target/report/cucumber.json", "pretty:target/report/cucumber-pretty.txt",
        "usage:target/report/cucumber-usage.json", "junit:target/report/cucumber-results.xml" }, features = { "src/test/resources/features/" }, 
        format = {"pretty", "json:target/report/cucumber.json", "html:target/report/html/" }, 
        glue = { "com.mazda.automation.StepDefs/" },
        tags = {("@Test2")}
)
public class CucumberRunner {

}
