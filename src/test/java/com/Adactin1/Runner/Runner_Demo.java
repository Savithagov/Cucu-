package com.Adactin1.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Cucumbers.Base.Cucumbers_Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Adactin1\\feature\\Adactin1.feature" ,
glue="com\\Adactin1\\StepDefinition" ,
monochrome = true ,
tags="@savi" ,
plugin = {"pretty"})
 

public class Runner_Demo 
{
	public static WebDriver driver=null;
    @BeforeClass
    public static void Browlaunch() throws InterruptedException
    {
//    	System.setProperty("webdriver.chrome.driver", 
//    			"C:\\Users\\Savitha\\eclipse-workspace\\Cucumbers_Project\\Driver\\chromedriver.exe");
//        driver= new ChromeDriver();
    	
          driver=Cucumbers_Base_Class.getDriver("chrome");
          Thread.sleep(3000);
    }
    
    @AfterClass
    public static void clos() throws InterruptedException
    {
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	//driver.close();
    }
}
