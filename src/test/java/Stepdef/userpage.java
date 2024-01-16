package Stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import POM.POMManager;
import POM.adduser;
import TestBase.manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userpage {
	
	
	public manager manager;
	public POMManager POMmanager;
	public userpage(manager manager)
	{
		this.manager=manager;
	}
	@Given("Click admin tab")
	public void click_admin_tab() {
	   
		 POMmanager=new POMManager(manager.driver);
		POMmanager.adduser.clickonadmin();
		 
	}
	@When("User add new user using add button")
	public void user_add_new_user_using_add_button() {
		POMmanager.adduser.clickonadd();
	}
	@When("User add the details in user form")
	public void user_add_the_details_in_user_form(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps();
		String emname = data.get(0).get("Employee_Name");
		String username =data.get(0).get("Username");
		String password = data.get(0).get("Password");
		String cpass = data.get(0).get("Confirm_Password");
		Thread.sleep(2000);
		WebElement role = POMmanager.adduser.selectadmin();
		//JavascriptExecutor js= (JavascriptExecutor)manager.driver;
		//js.executeScript("arguments[0].click();", role);
		Actions act=new Actions(manager.driver);
		act.click(role).build().perform();
		WebElement ad = POMmanager.adduser.selectadminrole();
		act.click(ad).build().perform();
		
		
		Thread.sleep(2000);
	WebElement status = POMmanager.adduser.selectstatus();
	act.moveToElement(status).build().perform();
	act.click(status).build().perform();
	WebElement st = POMmanager.adduser.selectenabled();
	act.click(st).build().perform();
	
		POMmanager.adduser.enterpassword(password);
		POMmanager.adduser.reEnterpassword(cpass);
		POMmanager.adduser.EnterempName(emname);
		POMmanager.adduser.selectemp();
		POMmanager.adduser.Enterusename(cpass);
		POMmanager.adduser.clickOnSave();
		
		
		
		
	}
	@Then("to verify user should be add")
	public void to_verify_user_should_be_add() {
	    
	}
}
