package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cogmentonew {
	static WebDriver driver;

	public static void main(String[] args) {
		
		launchapplicaton("chrome","\"https://ui.cogmento.com\"");
		login("nandasele69@gmail.com","Test@1234");
		company();
		newcompany("ibm","bangalore","Kanataka","120","12457");
	}
	public static void newcompany(String name,String city,String state,String num,String vat) {
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("num_employees")).sendKeys(num);
		driver.findElement(By.name("vat_number")).sendKeys(vat);
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		
	}
	public static void company() {
		driver.findElement(By.xpath("//a[@class='item']//following::i[@class='building icon']")).click();	
		driver.findElement(By.xpath("//button[@class='ui linkedin button']//following::i[@class='edit icon']")).click();
		
	}
	public static void login(String Username,String Password) {
		driver.findElement(By.name("email")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		
	}
	public static void launchapplicaton(String browser,String url) {
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
		driver.get("https://ui.cogmento.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
		
	




	}


