package com.puma.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//h2[@class='product-name']/a")
	public WebElement productName;
	
	
	public CartPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
