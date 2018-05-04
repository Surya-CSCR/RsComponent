package com.uk.rs_online.sdf;

import junit.framework.Assert;

import com.uk.rs.base.TestBase;
import com.uk.rs_online.pageObjects.LandingPage;
import com.uk.rs_online.pageObjects.SearchResultsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewSearchStepDefinitions extends TestBase
{
	LandingPage landingpage;
	SearchResultsPage searchresultpage;
	@Given("^user opens a browser$")
	public void user_opens_a_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    TestBase.initialization();

	  }

	@When("^user is in LandingPage$")
	public void user_is_in_LandingPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		Assert.assertEquals(title,"RS Components | Electronic and Electrical Components");
	}
	@When("^user enters RsStockNo in SearchBox click on searchbutton$")
	public void user_enters_RsStockNo_in_SearchBox_click_on_searchbutton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		landingpage = new LandingPage();
		searchresultpage=landingpage.LandingpageSearch(prop.getProperty("RsStockNo"));
		}
	
	@Then("^user should be navigated to searchresultspage$")
	public void user_should_be_navigated_to_searchresultspage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean flag = searchresultpage.validateSearchPage();
		Assert.assertTrue(flag);  
	}

}
