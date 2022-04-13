package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\java\\com\\features",	 //path of package of runner class
		glue = "com.stepdefs",							//path of package of step definition	
		dryRun = false, 									//true = compile feature file | false = execute feature file
		monochrome = true,								//to make output readable otherwise unreadable symbols will appear in output
		plugin = "html:target",						//to create a html report in target package created by maven
		tags = "@jbk"								// execute scenarios only with tag, don't execute others
		)


public class TestRunner {

	
}
