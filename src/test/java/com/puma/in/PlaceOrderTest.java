package com.puma.in;

import org.testng.annotations.Test;

import com.puma.in.HomePage;
import com.puma.in.ShoeListing;

import resource.Base;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PlaceOrderTest extends Base {

	private static Logger log = LogManager.getLogger(PlaceOrderTest.class.getName());

	@Test
	public void pumaBooking() throws Exception {

		driver.get(prop.getProperty("url"));

		Assert.assertEquals(driver.getTitle(), prop.getProperty("titleExpected"), "Not navigated to right URL");

		log.info("Navigated to" + prop.getProperty("url"));

		HomePage home = new HomePage(driver);
		home.running();

		log.info("Clicked on Men Running");

		ShoeListing sl = new ShoeListing(driver);
		sl.placeOrder();

		log.info("Order Placed");

		Set<String> allWindows = driver.getWindowHandles();
		for (String curWindow : allWindows) {
			driver.switchTo().window(curWindow);
		}

		ProductDetailPage pd = new ProductDetailPage(driver);
		pd.addToCart();

		log.info("Added to cart");

		CartPage cp = new CartPage(driver);

		Assert.assertTrue(cp.productName.getText().contains(sl.shoeName));

		log.info("Finished order successfully");
		
		System.out.println(" Adding sysouts in place order test");
		

	}

	@BeforeTest
	public void beforeTest() throws IOException {
		initializeDriver("chrome");

	}

	@AfterTest
	public void afterTest() {

		driver.quit();

	}

}
