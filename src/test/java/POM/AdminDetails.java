package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDetails {

	@FindBy(xpath="//a//span[text()='Admin']") private WebElement admin;
	
	public AdminDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
