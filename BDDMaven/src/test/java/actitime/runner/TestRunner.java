package actitime.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		 features = {"src/test/resources/features/ActitimeLogin.feature"},//feature file or folder name
			        glue = {"stepdefinitions"},//step definition package name
			       plugin = {"html:target/cucumber-html-report"},// reporting
			        monochrome = true
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}

