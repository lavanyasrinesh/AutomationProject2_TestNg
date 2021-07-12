package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class Duplicate_CategoryPage {
	WebDriver driver;
	public Duplicate_CategoryPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(name = "categorydata")
	WebElement AddCategoryTextBox_Flied;
	@FindBy(name="submit") WebElement AddCategoryButton_Field;
	@FindBy(xpath="//div[3]/a[130]/span[contains(text(),'JavaTestNg')]") WebElement ElementPresent;
	
	public void insertingDuplicateItem() {
		String currentWindow=driver.getWindowHandle();
		System.out.println("name of current window"+currentWindow);
		AddCategoryTextBox_Flied.sendKeys("JavaTestNg");
		AddCategoryButton_Field.click();
		boolean itemispresent=ElementPresent.isDisplayed();
		System.out.println("The category you want to add already exists: <duplicated category name>.JavaTestNg is exist  :"+itemispresent);
	}

}
