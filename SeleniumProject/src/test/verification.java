package test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verification {
	
	static WebDriver driver;


	public static void main(String[] args) {
		Launchappliction();
		Boolean();
	
	}

	   
	  public static  void Boolean() {
		  
		
		
	}


	public static void Launchappliction() {
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium libraries\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("file:///C:/selenium%20libraries/windowsverfify.html");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  // WebElement firstLink= driver.findElement(By.tagName("a"));//
		   List<WebElement> alltags=driver.findElements(By.tagName("a"));
		    
			
			for(WebElement tags:alltags) {
				
				tags.click();
			}
			Set<String> allhandles=driver.getWindowHandles();
			for( String handle:allhandles) {
				driver.switchTo().window(handle);
				String Wintitle=driver.getTitle();
				if(Wintitle.contains("Facebook")) {
					driver.findElement(By.name("email")).sendKeys("abcgdee");
					driver.close();
				}else { System.out.println("invald page");}
				/*if(Wintitle.contains("Google")) {
					driver.findElement(By.xpath("//input[@type='text']")).sendKeys("crmpro");
					driver.close();
				}else { System.out.println("invald page");}
				/*if(Wintitle.contains("Outlook")) {
					driver.findElement(By.linkText("Sign in")).sendKeys("crmpro");
					driver.close();
				}else {System.out.println("invald page");}*/

				}
				
		
	}
}


	/*
	   String exptitle=firstLink.getText();
	   
	   firstLink.click();
	   Set<String> allHandles=driver.getWindowHandles();
	   if(allHandles.size()>1) {
		   System.out.println("new window is opened");
	   }else {
		   System.out.println("new window is not opened");
	   }
	   
	   
	   Object[] handles=allHandles.toArray();
	   
	   driver.switchTo().window(handles[1].toString());
	   System.out.println(driver.getTitle());
	   
	   if(exptitle.equalsIgnoreCase(driver.getTitle())) {
		   System.out.println("expected window is opened");
		   
	   }else {
		   System.out.println("invalid window");
		   
	   }
		
		//driver.quit();//it  closes all the windows//


	*/

//public static boolean verifyBrowserWindow(String title) {//
	
	
	
	
	



