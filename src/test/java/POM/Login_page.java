package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	@FindBy(xpath="//input[@name='username']") private WebElement un;
	@FindBy(xpath="//input[@name='password']") private WebElement pw;
	@FindBy(xpath="//button[@type='submit']") private WebElement log;
	@FindBy(xpath="//*[text()='Invalid credentials']") private WebElement err;
	
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(String str)
	{
		un.sendKeys(str);
	}
	public void enterpassword(String str)
	{
		pw.sendKeys(str);
	}
	public void clickonlogin()
	{
		log.click();
	}
	public String error()
	{
		return err.getText();
	}
	
}
