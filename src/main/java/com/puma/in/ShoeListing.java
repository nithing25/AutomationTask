package com.puma.in;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoeListing {

	public WebDriver driver;
	public String shoeName ="";

	@FindBy(xpath = "//ul[@class='products-grid products-grid--max-4-col first last odd']/li[2]/div/h2/a")
	public WebElement secondShoe;

	public ShoeListing(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void placeOrder() {
	 shoeName = secondShoe.getText();
	 System.out.println(shoeName);
	 System.out.println(" ");
	 secondShoe.click();
	}

}
