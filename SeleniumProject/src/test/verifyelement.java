package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import frameworkmethods.EventMethods;

public class verifyelement {
	static WebDriver driver;

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium libraries\\chromedriver.exe");
			driver = new ChromeDriver();
		    driver.get("file:///C:/Users/Ashok/Downloads/Registration%20(1).html");
		String firstname="xyz";
	    String LastName="adncd";
	    
	    EventMethods.enterValue(driver.findElement(By.id("FirstName")), firstname);
	//instead of writing webelement firstnamefield =driver.findlement we are writing it in the argument directly//
	    EventMethods.enterValue(driver.findElement(By.id("LastName")),LastName);

	}	

	
	
		
		
	}


