package com.Test_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:target/cucumber.json"},
		features="feature_file"
		,glue={"com.Orange_steps"}
		//,tags={"@Invalid_Login"}
		)


public class TestRunner {

}
