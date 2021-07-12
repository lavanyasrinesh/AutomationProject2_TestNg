package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Add_A_CategoryPage;
import util.BrowserFactory;

public class Add_A_CategoryTest {

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		driver=BrowserFactory.init();
	}
	
	@Test
	public void validateAddedCategory() {
		
		Add_A_CategoryPage category=PageFactory.initElements(driver, Add_A_CategoryPage.class);
		category.verifyCategory();
	}
	
	@AfterMethod
	public void tearDown() {
		BrowserFactory.tearDown();
	}
}
