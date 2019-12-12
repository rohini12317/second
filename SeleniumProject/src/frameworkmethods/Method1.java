package frameworkmethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Method1 {
	static WebDriver driver;
	
	//WebElement companiesTable=driver.findElement(By.xpath("//"))
	//WebElemnt datarow=getTableRow(companiesTable,"Name","allwyn");
	//system.out.println(datarow.findelements(by.tagname("td")).size());
	
	
	public static WebElement getTablerow(WebElement table,String columnName,String value) {
		/*req-access table row based on the given values*/
		int colPos=getcolIndex(table,columnName);
		/*we are taking colindex of given table and column name and keeping it in variable*/
		WebElement datarow=null;
		/*keeping null value in datarow initially*/
		
		if(colPos>=0) {
			List<WebElement> allrows=table.findElements(By.tagName("tr"));
			/*acceesing all rows in "table" not in driver*/
			for(int i=1;i<=allrows.size()-1;i++) {
				//i value is 1 bco data is starting from index"1"//
				WebElement row=allrows.get(i);
				
				List<WebElement> allcells=row.findElements(By.tagName("td"));
				/*now we have to access all cells by using tagname "td"*/
				WebElement datacell=allcells.get(colPos);
				//we are taking second column from every row//
				String celltext=datacell.getText();
				if(celltext.trim().equalsIgnoreCase(value)) {
					datarow=row;
					break;
					
				}
			}
		}else
			System.out.println("The givn column is not found");
		return datarow;	
		
	}
	
	public static int getcolIndex(WebElement element,String columnName) {
		int colIndex=-1;
		/* we wiltake intial value as -1,if colindex value updated then it will gets 
		 * changed to 0 or specific index value
		 */
		WebElement headerrow=driver.findElement(By.tagName("tr"));
		/*table row tagname is tr so we are accessing table and taking it into a webelement*/
		List<WebElement> allheader=headerrow.findElements(By.tagName("th"));
		/*now we have to take all headers collection into all header list*/
		for(int i=0;i<=allheader.size()-1;i++) {
			/*we are loopig through allheader*/
			WebElement header=allheader.get(i);
			/*we are using get method to take i value and keeping it in header webelement*/
			String headertext=header.getText();
			/*based on the looped i value we are retrieving text and keepin it in variale */
			
			if(headertext.trim().equalsIgnoreCase(columnName)) {
				/*if retrieved headertext matches with given column name then colindex value
				 * wil get changed*/
				 
				colIndex=i;
				break;
			}
		}
		return colIndex;
		
	}
	public static void table() {
		String companyname="google";
	     driver.findElement(By.xpath("//td[text()='"+companyname+"']//following-sibling::td/descendant::i[contains(@class,'edit')]")).click();
	     //we can click on required edit button by using above path//
	}
	
	
	public static void newcompany(String name,String city,String state,String num,String vat) {
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("num_employees")).sendKeys(num);
		driver.findElement(By.name("vat_number")).sendKeys(vat);
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		//driver.findElement(By.xpath("//a[@class='item']//following::i[@class='building icon']")).click();	
		//a[contains[@href='companies'] we can use this xpath for companies
		
		
		/*WebElement list=driver.findElement(By.xpath("//input[@class='search']//parent::div[@name='country']"));
		Select country=new Select(list);
		country.selectByValue("India");*/
		
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


