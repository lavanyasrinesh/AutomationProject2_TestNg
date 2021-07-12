package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Validate_Drop_DownPage;
import util.BrowserFactory;

public class Validate_Drop_DownTest {

	WebDriver driver;
	@BeforeMethod
	public void lanchBrowser() {
		driver=BrowserFactory.init();
	}
	@Test
	public void verfiyingDropDownValues() {
		Validate_Drop_DownPage dropdown=PageFactory.initElements(driver, Validate_Drop_DownPage.class);
		dropdown.clickAndValidatingAllMonths();
	}
	@AfterMethod
	public void closingBrowser() {
		BrowserFactory.tearDown();
	}
}
