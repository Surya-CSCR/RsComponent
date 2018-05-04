package com.uk.rs_online.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uk.rs.base.TestBase;

public class SearchResultsPage extends TestBase
{
	@FindBy(xpath= "//div[@class='basket']/div/span[contains(text(),'In stock')]")
	WebElement InStock;
	
	public SearchResultsPage()
	{
		PageFactory.initElements(driver,this);
	}
//	
	public boolean validateSearchPage()
	{
		return InStock.isDisplayed();
	}
	
}
