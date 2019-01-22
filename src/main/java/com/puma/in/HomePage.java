package com.puma.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='digimeg-nav-item'][@ data-subnav='men-subnav']")
	public WebElement menSubnav;
	
	@FindBy(xpath="(//a[@href='https://in.puma.com/men/shoes/running.html?dir=asc&order=position&in-stock=1'])[2]")
	public WebElement menRunning;


	
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void running() {
		
		Actions mact = new Actions(driver);
		mact.moveToElement(menSubnav).build().perform();
		menRunning.click();
	}

	
}
