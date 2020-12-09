package com.Test_Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="feature_file"
		,glue={"com.Orange_steps"}
		,plugin={"json:target/cucumber.json"}
		,tags={"@Invalid_Login,@Username_Empty,@Password_Empty,@Empty_Credentials,@Successful_Login"
				+ ",@Configuration_field,@Custom_fields,@Employee_details,@Add_Employee,@Reports,@Myinfo,@Employee_login,@Logout"}
		)

public class TestRunnerwithTestNG extends AbstractTestNGCucumberTests {

}
