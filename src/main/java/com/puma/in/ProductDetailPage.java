package com.puma.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

	public WebDriver driver;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	public WebElement addCart;

	public ProductDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void addToCart() {
		addCart.click();
	}
}
