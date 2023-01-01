package com.Cucumbers.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Cucumbers_Base_Class 
{

	public static WebDriver driver;
	   
	   //driver
 public static WebDriver getDriver(String value)
 {
	   if(value.equalsIgnoreCase("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\Savitha\\eclipse-workspace\\Cucumbers_Project\\Driver\\chromedriver.exe");
		   driver=new ChromeDriver();
	   }
	   else if(value.equalsIgnoreCase("firefox"))
	   {
		  System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Savitha\\eclipse-workspace\\Cucumbers_Project\\Driver\\chromedriver.exe");
		  driver=new ChromeDriver();
	   }
	return driver;
 }

 
 
 //To get the url
 public static void getUrl(String url)
 {
	   driver.get(url);
 }
 
 public static void maxix()
 {
	   driver.manage().window().maximize();
 }
 
 
 //Screenshot
 public static void srnshot(String a) throws IOException
 {
	   TakesScreenshot ts=(TakesScreenshot) driver;
	   File from=ts.getScreenshotAs(OutputType.FILE);
	   File to=new File("C:\\Users\\Savitha\\eclipse-workspace\\Cucumbers_Project\\Screenshot\\"+a+".png");
	   FileUtils.copyFile(from,to);
 }
	
 
 //To send the keys
 public static void inputvalue(WebElement a, String b) 
 {
	   a.sendKeys(b);
 }
 
 //click
 public static void cli(WebElement b)
 {
	   b.click();
 }
 
 //Actions
 public static void act(String actionName , WebElement element)
 {
	   Actions a= new Actions(driver);
	   
	   if(actionName.equalsIgnoreCase("Clickon"))
	   {
		   a.click(element).build().perform();
	   }
	   else if(actionName.equalsIgnoreCase("Double click"))
	   {
		   a.doubleClick(element).build().perform();
	   }
	   else if(actionName.equalsIgnoreCase("Move to"))
	   {
		   a.moveToElement(element).build().perform();
	   }
	   
 }
 
 
 //Robot
 public static void rob(String type) throws AWTException 
 {
	   Robot r=new Robot();
	   if(type.equalsIgnoreCase("up"))
	   {
		   r.keyPress(KeyEvent.VK_UP);
		   r.keyRelease(KeyEvent.VK_UP);
	   }
	   else if (type.equalsIgnoreCase("down")) 
	   {
		   r.keyPress(KeyEvent.VK_DOWN);
		   r.keyRelease(KeyEvent.VK_DOWN);
		   }
	   else if(type.equalsIgnoreCase("left"))
	   {
		   r.keyPress(KeyEvent.VK_LEFT);
		   r.keyRelease(KeyEvent.VK_LEFT);
	   }
	   else if(type.equalsIgnoreCase("right"))
	   {
		   r.keyPress(KeyEvent.VK_RIGHT);
		   r.keyRelease(KeyEvent.VK_RIGHT);
	   }
	   else if(type.equalsIgnoreCase("enter"))
	   {
		   r.keyPress(KeyEvent.VK_ENTER);
		   r.keyRelease(KeyEvent.VK_ENTER);
	   }
 }

 
 
 
 
 //Select dropdown
 public static void dropdownselect(WebElement element , String type , String value)
 {
	   Select s= new Select(element);
	   if(type.equalsIgnoreCase("By value"))
	   {
		   s.selectByValue(value);
	   }
	   else if(type.equalsIgnoreCase("By index"))
	   {
		   int index = Integer.parseInt(value);
		   s.selectByIndex(index);
	   }
	   else if(type.equalsIgnoreCase("By visibletext"))
	   {
		   s.selectByVisibleText(value);
	   }
 }

 
 //Deselect dropdown
 public static void dropdowndeselect(WebElement element , String type , String value)
 {
	   Select s= new Select(element);
	   if(type.equalsIgnoreCase("By value"))
	   {
		   s.deselectByValue(value);
	   }
	   else if(type.equalsIgnoreCase("By index"))
	   {
		   int index = Integer.parseInt(value);
		   s.deselectByIndex(index);
	   }
	   else if(type.equalsIgnoreCase("By visibletext"))
	   {
		   s.deselectByVisibleText(value);
	   }
 }

 
 
 
 //Alert
 public static void aler(WebElement element , String value , String type)
 
 {
	    element.click();
	    Alert alert=driver.switchTo().alert();
	    Alert alert1 = driver.switchTo().alert();
	    
	    if(type.equalsIgnoreCase("Simple alert"))
	    {
	    	alert.accept();
	    }
	    else if(type.equalsIgnoreCase("Confirm alert"))
	    {
	    	alert.dismiss();
	    }
	    else if(type.equalsIgnoreCase("Prompt alert"))
	    {
	    	alert.sendKeys(value);
	    	alert1.accept();
	    	
	    }
 }
 
 
 //frame
 //single frame
 public static void singfr(WebElement g , String d)
 {
	   driver.switchTo().frame(0);
	   g.sendKeys(d);
	   driver.switchTo().defaultContent();
	   
	   
	   
 }
    
	

}
