package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingwithtables {
 static WebDriver driver;
	public static void main(String[] args) {
		
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com");
		login("admin","admin123");
		Leave(driver.findElement(By.id("menu_leave_viewLeaveModule")));
		Leavelist(driver.findElement(By.id("menu_leave_viewLeaveList")));
        WebElement emptable=driver.findElement(By.id("resultTable"));
       // int colIndexforEmpName=getColIndex(emptable,"Employee Name");
        
	}
	
	/*public static int getColIndex(WebElement element,String ColName) {
		int Index=-1;
		WebElement firstRow=element.findElement(By.tagName("tr"));
		List<WebElement> allHeaders=firstRow.findElements(By.tagName("th"));		
	}*/
	public static void Leavelist(WebElement element) {
		if(element.isDisplayed()) {
	    	 if(element.isEnabled()) {
	    		element.click(); 
	    	  } else 
	    		  System.out.println("first name element is not enabled");
	  
	    }else 
 	     System.out.println("first name element is not enabled");	
	}
	
	
	public static void Leave(WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	
		
	}
	public static void login(String userName, String passWord) {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		driver.findElement(By.name("Submit")).click();
		
	}
	public static void launchApplication(String browser, String url) {
	
		browser="chrome";
		/*by using to lower case we can convert the uppercase string to lower case*/
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\selenium libraries\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\selenium libraries\\geckodriver.exe");
			driver = new FirefoxDriver();
			

		default:
			System.out.println("Given browser name is invalid");
			System.exit(0);/* It stops the execution*/
								
		}
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	}


