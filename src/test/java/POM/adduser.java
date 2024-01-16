package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adduser {

	@FindBy(xpath="//a//span[text()='Admin']") private WebElement admin;
	@FindBy(xpath="//button[contains(@class, 'oxd-button oxd-')]/descendant::i") private WebElement add;
	@FindBy(xpath="(//div[text()='-- Select --'])[1]") private WebElement role;
	@FindBy(xpath="//div[@class='oxd-select-wrapper']//div//span[text()='Admin']") private WebElement ad;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]") private WebElement status;
	@FindBy(xpath="//div[@class='oxd-select-wrapper']//div//span[text()='Enabled']") private WebElement en;
	@FindBy(xpath="(//input[@type='password'])[1]") private WebElement password;
	@FindBy(xpath="(//input[@type='password'])[2]") private WebElement reenterpassword;
	@FindBy(xpath="//input[@placeholder='Type for hints...']") private WebElement empname;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]") private WebElement username;
	@FindBy(xpath="//button[@type='submit']") private WebElement save;
	@FindBy(xpath="//div[@role='listbox']//div//span") private WebElement us;
	
	public adduser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void selectemp()
	{
		us.click();
	}
	public WebElement selectenabled()
	{
		return en;
	}
	public WebElement selectadminrole()
	{
		return ad;
	}
	public void clickonadmin()
	{
		admin.click();
	}
	public void clickonadd()
	{
		add.click();
	}
	public WebElement selectadmin()
	{
		return role;
	}
	public WebElement selectstatus()
	{
		return status;
	}
	public void enterpassword(String str)
	{
		password.sendKeys(str);
	}
	public void reEnterpassword(String str)
	{
		reenterpassword.sendKeys(str);
	}
	public void EnterempName(String str)
	{
		empname.sendKeys(str);
	}
	public void Enterusename(String str)
	{
		username.sendKeys(str);
	}
	public void clickOnSave()
	{
		save.click();
	}
	
}
