package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)

@CucumberOptions(
		features = ".//Features/LogInFeature.feature",
		glue = "StepDefinition",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber-reports/reports1.html"}
		
		)

public class Run {
/*This class will be empty*/
}
