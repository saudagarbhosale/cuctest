package Stepdef;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class firststepclass {
	
	
	@Given("Pass url {string} b")
	public void pass_url_b(String str) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}
	@Given("open url entername {string} a")
	public void open_url_entername_a(String string) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}
	
	@Given("open")
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//button[@class='abc']")).click();
		driver.close();
	}
}
