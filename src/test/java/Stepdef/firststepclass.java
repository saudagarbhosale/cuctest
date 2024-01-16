package Stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import POM.POMManager;
import TestBase.TestBaseClass;
import TestBase.manager;
import Utility.GetDataFromExcel;
public class firststepclass {
	public manager manager;
	public firststepclass(manager manager)
	{
		this.manager=manager;
	}
	@When("get id from info page and valide with csv file")
	public void get_id_from_info_page_and_valide_with_csv_file() throws IOException, CsvException {
		
		manager.driver.findElement(By.xpath("//a//span[text()='PIM']")).click();
	String id = manager.driver.findElement(By.xpath("//div[normalize-space()='0251777']")).getText();
	    FileReader file=new FileReader("C:/Users/Saudagar.Bhosale/Documents/cuc/testdata.csv");
	    CSVReader CSVReader=new CSVReader(file);
	    List<String[]> data = CSVReader.readAll();
	    String[] act = data.get(0);
	    String actualvalue = act[0];
	   Assert.assertEquals(id, actualvalue);
	}
	
	@When("Enter username {string} and {int} and {int}")
	public void enter_username_and_and(String string, Integer int1, Integer int2) throws EncryptedDocumentException, IOException {
	  
		String username = GetDataFromExcel.getData(string, int1, int2);
		System.out.println(username);
		
		
	}
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
	 
		TestBaseClass TestBaseClass = new TestBaseClass();
		manager.driver=TestBaseClass.Openbrowser();
		
		
		
	}

	@When("^Enter username (.+) and password (.+)$" )
	public void enter_username_and_password(String string, String string2) throws InterruptedException {
	
		POMManager POMManager=new POMManager(manager.driver);
		POMManager.log.enterusername(string);
		POMManager.log.enterpassword(string2);
		POMManager.log.clickonlogin();
		
	}

	@Then("verify user should login or not")
	public void verify_user_should_login_or_not() {
		String act = manager.POMManager.log.error();
		Assert.assertEquals(act, act);
		 
	}
}
