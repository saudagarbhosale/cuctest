package Stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import TestBase.manager;
public class firststepclass {
	
	public manager manager;
	@Given("Pass url {string} b")
	public void pass_url_b(String str) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}
	@Given("open url entername {string} a")
	public void open_url_entername_a(String string) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}
	
	@Given("open")
	public void open()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//button[@class='abc']")).click();
		driver.close();
	}
	@Given("open application")
	public void open_application() {
	 
		 manager=new manager();
		manager.getDriver();
		
		
	}

	@When("Enter username {string} and password {string}" )
	public void enter_username_and_password(String string, String string2) throws InterruptedException {
	
		manager.POMManager.log.enterusername(string);
	
		manager.POMManager.log.enterpassword(string2);
		manager.POMManager.log.clickonlogin();
		
	}

	@Then("verify user should login or not")
	public void verify_user_should_login_or_not() {
		String act = manager.POMManager.log.error();
		Assert.assertEquals(act, act);
	}
}
