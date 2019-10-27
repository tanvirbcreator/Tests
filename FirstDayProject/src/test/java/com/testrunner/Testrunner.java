package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= "Cucumber",
		glue= "com.stepdef"
		)
		
	public class Testrunner extends AbstractTestNGCucumberTests {
		


}
// key word features to connect feature folder
// key word glue 
//tag to use scenerio 
//EXAMPLE OF ABSTRACT CLASS