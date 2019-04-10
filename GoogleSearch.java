package cucumberDemo.cucumberDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearch {

	WebDriver driver;
	
	@Given("^user on google HomePage search page$")
	public void user_on_google_search_page()  {
	   driver = new ChromeDriver();
	   driver.get("https://www.google.com");
	}

	@When("^user enter in serach box$")
	public void user_enter_in_serach_box()  {
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("persistent");
	driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK'and @value='Google Search']")).click();
	}

	@Then("^google search result show$")
	public void google_search_result_show() {
	   
	}
}
