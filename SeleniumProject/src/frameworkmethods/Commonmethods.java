package frameworkmethods;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commonmethods {
	//first method is launchapplication//
	public static void launchapplication(String browser,String url) {
		
		browser = (browser==null)?"chrome":browser;
		switch (browser.toLowerCase()) {
		 case "chrome":
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashok\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
			Data.driver=new ChromeDriver();
			break;
			
		 case "firefox":
			Data.driver=new FirefoxDriver();
			break;

		 case "Edge":
			Data.driver=new EdgeDriver();
		 default:
			System.out.println("The browser :"+browser+ "browser is not valid");
			System.exit(0);
		}
		
		Data.driver.get(url);
		
		Data.driver.manage().window().maximize();
		Data.driver.manage().timeouts().implicitlyWait(Data.IMPLICIT_TIME_OUT, TimeUnit.SECONDS);
		
	try {
		Data.driver.findElement(By.name("email"));
		System.out.println("Application is succesfully navigated to login page");
		
	}catch(NoSuchElementException e) {
		System.out.println("Application is not navigated to login page.unable to continue");
		System.exit(0);
	}
		
		
	}

}
