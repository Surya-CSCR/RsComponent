package com.uk.rs_online.sdf;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.uk.rs_online.pageObjects.*;



public class SearchStepDefinitions {
public	WebDriver driver;
	
	@Given("^the user is in the homepage$")
	public void the_user_is_in_the_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhoshi\\workspace\\uk.rs-online.com\\src\\main\\resource\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://uk.rs-online.com/web/");
		String title = driver.getTitle();
		driver.manage().window().maximize();
		Assert.assertEquals(title, "RS Components | Electronic and Electrical Components");
		 
	}

	@When("^the user enters the \"([^\"]*)\" in the \"([^\"]*)\"$")
	public void the_user_enters_the_in_the(String product_name,By Search_box) throws Throwable {
	   
	 driver.findElement(Search_box).sendKeys(product_name);
	    
	}

	@When("^the user clicks on the searchbutton$")
	public void the_user_clicks_on_the_searchbutton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^the user should be navigated to \"([^\"]*)\"$")
	public void the_user_should_be_navigated_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}



}
