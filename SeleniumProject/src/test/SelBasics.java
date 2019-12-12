package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelBasics {
	
public	static WebDriver driver;

	public static void main(String[] args) {
		
		String browser="chrome";
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
		/* we may get invalid argument exception if we wont give https:*/
		/*URL must start with http or https*/
		/*use get method to give the url*/
		driver.get("https://www.crmpro.com");
		
	/* in order to access the elements use findelement & find elements methods*/
		/*to supply information to these methods we should use "by class"*/


	}

}
