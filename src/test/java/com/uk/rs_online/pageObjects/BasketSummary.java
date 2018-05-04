package com.uk.rs_online.pageObjects;

import junit.framework.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uk.rs.base.TestBase;

public class BasketSummary extends TestBase
{
	
	@FindBy(xpath= "//div[@class='pageTitleBlack']")
	WebElement MyBasket;
	
	public BasketSummary()
	{
		PageFactory.initElements(driver,this);
	}

	public boolean validateBasketPage()
	{
		Assert.assertEquals("My Basket", MyBasket.getText());
		return true;
	}

}
