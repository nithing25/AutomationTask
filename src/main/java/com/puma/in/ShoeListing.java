package com.puma.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoeListing {

	public WebDriver driver;
	public String shoeName = "";

	@FindBy(xpath = "//ul[@class='products-grid products-grid--max-4-col first last odd']/li[2]/div/h2/a")
	public WebElement secondShoe;

	public ShoeListing(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void placeOrder() {

		shoeName = secondShoe.getText();
		waitElement(secondShoe);
		secondShoe.click();
	}

	public void waitElement(WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

}
