package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bamboohr {
	
	static WebDriver driver;

	public static void main(String[] args) {
		launchapplication("chrome","https://satwa.bamboohr.com/login.php");
		login("nanda.dreddy@outlook.com","S@tw@2047");

	}

	public static void login(String userName, String passWord) {
		
		driver.findElement(By.id("lemail")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();//
		driver.findElement(By.xpath("//div[@class='login-actions']//child::a[text()='Forgot Password?']")).click();
		

	//	driver.findElement(By.xpath("//div[@class='CardFooter']//child::a[text()='Terms of Service']")).click();//
		
	}

	public static void launchapplication(String browser, String url1) {
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("WebDriver.chrome.driver","c://seleniumlibraries.chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("WebDriver.firefox.driver", "c://seleniumliraries.geckodiver.exe");
			driver = new FirefoxDriver();
			break;
        
		default:
			System.out.println("invalid browser");
			System.exit(0);
		}
		driver.get("https://satwa.bamboohr.com/login.php");
	}

}
