package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_A_CategoryPage {
	WebDriver driver;
	
	public Add_A_CategoryPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	//div[3]/a[130]/span[contains(text(),'JavaTestNg')]
	@FindBy(xpath="//div[3]/a[130]/span[contains(text(),'JavaTestNg')]") WebElement ElementPresent;
	
	

	public void verifyCategory() {
		boolean item=ElementPresent.isDisplayed();
		System.out.println("Add item is displayed:"+item);
		System.out.println("The category name is:"+ElementPresent.getText());
		
	}

}
