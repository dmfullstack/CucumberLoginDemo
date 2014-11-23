package com.controller;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {
	
	WebDriver driver=null;

	@Given("^I am on the \"([^\"]*)\" link$")
	public void I_am_on_the_link(String arg1) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:/Users/DRAGON/javaee/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://localhost:8080/CucumberLoginDemo/");
		
	}

	@When("^I populate the username and password$")
	public void I_populate_the_username_and_password() throws Throwable {
	    
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("password");
		
	}

	@When("^I click on the login button$")
	public void I_click_on_the_login_button() throws Throwable {
	    
		driver.findElement(By.name("submit")).click();
		
	}

	@Then("^I should be on the welcome page$")
	public void I_should_be_on_the_welcome_page() throws Throwable {
	    
		Assert.assertEquals("Welcome", driver.getTitle());
		System.out.println(driver.findElement(By.id("message")).getText());
		Assert.assertEquals("Welcome User", driver.findElement(By.id("message")).getText());
		
	}	
	
}
