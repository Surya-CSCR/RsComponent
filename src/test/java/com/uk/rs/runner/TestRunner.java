package com.uk.rs.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\santhoshi\\workspace\\uk.rs-online.com\\src\\main\\resource\\com", //the path of the feature files
			glue={"C:\\Users\\santhoshi\\workspace\\uk.rs-online.com\\src\\test\\java\\com\\uk\\rs_online\\sdf"}, //the path of the step definition files
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
	 
	public class TestRunner {
	 
		@org.junit.Test
		public void Test()
		{
			System.out.println("test run sucessfully");
		}

}
