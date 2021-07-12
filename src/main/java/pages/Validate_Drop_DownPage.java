package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Validate_Drop_DownPage {
WebDriver driver;

public Validate_Drop_DownPage(WebDriver driver) {
	this.driver=driver;
}



@FindBy(name="due_month") WebElement MonthDropDown_Field;
public void clickAndValidatingAllMonths() {
	MonthDropDown_Field.click();
	String[] excepetedValues= {"None","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	Select sel=new Select(MonthDropDown_Field);
	List<WebElement> dropdown=sel.getOptions();
	for(int i=0;i<dropdown.size();i++) {
		Assert.assertEquals(dropdown.get(i).getText(), excepetedValues[i], "Verfication success");
	}
	
	
}
}
