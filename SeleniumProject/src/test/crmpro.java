package test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class crmpro {
	
	static WebDriver driver;

	public static void main(String[] args) {
launchApplication("chrome","http://classic.freecrm.com/index.html");


login("sudhananda123","Test@1234");
newCompany();
enterCompanyDetails();
status();
Lookup();
		
	}
   public static void Lookup() {
	driver.findElement(By.xpath("//input[@type='button' and @value='Lookup']")).click();
	//further action is not allowed as findelements  is referring to main window session id instead of new window session id//
	//so we are retrieving new window session id by using set collection.get windowhandles//
	Set<String> allHandles=driver.getWindowHandles();
	//we should convert values from set to array bcoz get method is not there in set to retrieve new session id//
	Object[] handles=allHandles.toArray();
	//converting from object to string as window return type is string//
	driver.switchTo().window(handles[1].toString());
	//handles1 means 1st index value
	String parentCompany="TestCompany1";
	driver.findElement(By.id("search")).sendKeys(parentCompany);
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	driver.findElement(By.linkText(parentCompany)).click();
	driver.switchTo().window(handles[0].toString());
	driver.switchTo().frame("mainpanel");
	driver.findElement(By.id("vat_number")).sendKeys("abcgde");
	//we will get exception here in above line as findelements is referring to lookup window//
	
	}
public static void status() {
	WebElement statusElem=driver.findElement(By.name("status"));
	Select listBox=new Select(statusElem);
	listBox.selectByVisibleText("On Hold");
	//listBox.selectByIndex(2);//	
	}
   public static void enterCompanyDetails() {
	int count=2000;
	driver.findElement(By.id("num_of_employees")).sendKeys(String.valueOf(count));
	//using string.value of method to convert int(count) value to string as it accepts only string value//

	}
	
  public static void newCompany() {
		Actions builder=new Actions(driver);//builder is a user defined variable//
		builder.moveToElement(driver.findElement(By.xpath("//a[text()=\"Companies\"]"))).build().perform();
		driver.findElement(By.xpath("//a[text()='New Company']")).click();
		
		if(!driver.findElements(By.xpath("//legend[text()='Create New  Company']")).isEmpty()){
			System.out.println("naviated to new company page");
		}else System.out.println("invalid page");
		
		
	}
   public static void login(String userName,String passWord) {
	driver.findElement(By.name("username")).sendKeys(userName);
	driver.findElement(By.name("password")).sendKeys(passWord);	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//thread.sleep is called as constant wait//
	}
	
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	
	driver.switchTo().frame("mainpanel");
	
	/*home object is not in the main page its in another frame so we need to switch in to that respected frame by using switch to and frame method*/
	
	/*List<WebElement> allElements1=driver.findElements(By.xpath("//a[text()='Home']"));
	
	if(!allElements1.isEmpty()) {
		System.out.println("Application navigated to main page");
	}else
		System.out.println("Application navigated to invalid page");
	    System.exit(0);*/
	
	}

   public static void launchApplication(String browser,String url) {
			
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
			/*we are doing validation to find whether application is navigated properly*/
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			/*List<WebElement> allElements=driver.findElements(By.xpath("//input[@value='Login']"));
			
			if(!allElements.isEmpty()) {
				System.out.println("Application navigated to right page");
			}else
				System.out.println("Application navigated to invalid page");
			    System.exit(0);	*/	
			
		}
		
		
		
	}


