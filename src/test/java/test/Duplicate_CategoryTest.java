package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Duplicate_CategoryPage;
import util.BrowserFactory;

public class Duplicate_CategoryTest {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		driver = BrowserFactory.init();
	}

	@Test
	public void insertandverfityCategoryItem() {
		Duplicate_CategoryPage duplicate = PageFactory.initElements(driver, Duplicate_CategoryPage.class);
		duplicate.insertingDuplicateItem();
	}

	@AfterMethod
	public void tearDown() {
		BrowserFactory.tearDown();
	}
}
