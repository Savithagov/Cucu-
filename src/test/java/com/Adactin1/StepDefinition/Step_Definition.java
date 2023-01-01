package com.Adactin1.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Cucumbers.Base.Cucumbers_Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Cucumbers_Base_Class
{

	
	@Given("user can  able to launch the url")
	public void user_can_able_to_launch_the_url() 
	{
        driver.get("https://adactinhotelapp.com/");		

	}

	@When("user can able to enter the username in the textbox")
	public void user_can_able_to_enter_the_username_in_the_textbox() 
	{
		WebElement findElement = driver.findElement(By.xpath("//input[@id='username']"));
	    inputvalue(findElement, "SavithaR"); 
	}

	@When("user can able to enter the password in the password field")
	public void user_can_able_to_enter_the_password_in_the_password_field() 
	{
		 WebElement findElement1 = driver.findElement(By.xpath("//input[@id='password']"));
         inputvalue(findElement1, "Adventure@2312");
	}

	@Then("user can able to click the login and it is navigate to home page")
	public void user_can_able_to_click_the_login_and_it_is_navigate_to_home_page() 
	{
		   WebElement findElement = driver.findElement(By.xpath("//input[@id='login']"));
		   cli(findElement);
	}
	
	
}
