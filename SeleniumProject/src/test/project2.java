package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class project2 {
	static WebDriver driver;
	////a[text()='0004']//parent::td//preceding-sibling::td/input
	////a[text()='0006']//ancestor::tr//td
	public static void main(String[] args) {
	String newUserName="rohini";
	String newPassword="KRohini17@";
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com");
		login("admin","admin123");
		
		
		//driver.manage().window().maximize();// /*used to maximize the screen after launching the aplication*/
		
		/*with our new credentials it wont relogin bcoz application will support the process of
		 * adding new employee by hr not by individual*/
		/*in that case we should use below credentials*/
		/*login("linda.anderson","linda.anderson");*/
		//addEmployee();//
		
		//login(newUserName,newPassword);//
		//validateurl();//
		//project2.driver.close();//
		//validateEmployeeid();//
		/*it closes the web page once the execution is done*/
		//verifyDeleteButton();//
		//verifyCheckBox();//
		//configuration();//
		//checkBox();//
		details();
		//checkAll();//
		//empId();//
		//forgotpassword();//
		//logout();
		
	}
	
	public static void details() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		WebElement table=driver.findElement(By.id("resultTable"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int i=1;i<=rows.size()-1;i++) {
			WebElement row=rows.get(i);
			
			List<WebElement> cell1=row.findElements(By.tagName("td"));
			WebElement checkBox=cell1.get(0).findElement(By.tagName("input"));
		
				if(checkBox.isSelected()) {
					
					}
				}
						
		}
			
		
	

	public static void empId() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		String empid="0004";
		String Path="//a[text()='"+empid+"']/parent::td/preceding-sibling::td/input";
		driver.findElement(By.xpath(Path)).click();
		
		WebElement employeeId=driver.findElement(By.id("resultTable"));
		List<WebElement> rows=employeeId.findElements(By.tagName("tr"));
		
		//if loop starts from 0 it's looping "th" in the table"result table"instead of td  it's getting started from second place
		//so we should mention 1 so it will start from tagname"td"// 
		
		
		for(int i=1;i<=rows.size()-1;i++) {
			WebElement row=rows.get(i);
			
			List<WebElement> cell=row.findElements(By.tagName("td"));
			
			String actempid=cell.get(1).findElement(By.tagName("a")).getText();
			
			if(actempid.trim().equals(empid)) {
				cell.get(0).findElement(By.tagName("input")).click();
				break;
			}
		}
	
		
		
		
		
	}

	public static void checkAll() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.name("chkSelectAll")).click();
		List<WebElement> FullcheckBox=driver.findElements(By.xpath("//input[@name='chkSelectRow[]']"));
		boolean status=false;
		for(WebElement status1:FullcheckBox) {
			if(status1.isEnabled()) {
				status=true;
				
			}
				
		}
		if(status=true) {
			System.out.println("All check boxes are enabled after clicking select button");
		
		}else  System.out.println("All check boxes are disabled even after clicking select button");
		
		
	}

	public static void checkBox() {
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		List<WebElement> allrows=driver.findElements(By.xpath("//input[@name='chkSelectRow[]']"));
		boolean status1=false;
		for(WebElement status:allrows) {
			if(!status.isSelected()) {
				
				status1=true;
			
			}
		}
		
		if(status1=true) {
			System.out.println("All checkboxes are disabled by default");
		}else System.out.println("All checkboxes are enabled by default");
		
		
	}

	public static void forgotpassword() {
		
		driver.findElement(By.xpath("//div[@id='forgotPasswordLink']//child::a[text()='Forgot your password?']")).click();
		
		
	}

	public static void configuration() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.id("menu_pim_Configuration"))).build().perform();
		driver.findElement(By.id("menu_pim_configurePim")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	    List<WebElement> checkBox1=driver.findElements(By.xpath("//input[@type='checkbox']"));
	   // checkBox1.get(0).click();//
	    
	    for(int i=0;i<=checkBox1.size()-1;i++) {
	    	
	    	checkBox1.get(i).click();
	    }

	}

	public static void verifyCheckBox() {
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		WebElement CheckBox=driver.findElement(By.id("leaveList_cmbWithTerminated"));
		
		if(!CheckBox.isSelected()) {
			System.out.println("checkbox is not selected by default");
			//driver.findElement(By.id("leaveList_cmbWithTerminated")).click();//
			CheckBox.click();
			//we can use WebElement directly instead of writing individual code//
			
		}else
			System.out.println("checkbox is selected by default");
		
		
		
	}

	public static void verifyDeleteButton() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		WebElement DeleteButton=driver.findElement(By.id("btnDelete"));
		
		if(!DeleteButton.isEnabled()) {
			
			System.out.println("Delete button is disabled before selecting employee");
		}else
			System.out.println("Delete button is enabled before selecting employee");
		
		driver.findElement(By.id("ohrmList_chkSelectRecord_6")).click();
		
		if(DeleteButton.isEnabled()) {
			System.out.println("Delete button is enabled after selecting employee");
		}else
			System.out.println("Delete button is disabled after selecting employee");
	
		
	}

	public static void validateEmployeeid() {
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		String EmpId=driver.findElement(By.id("employeeId")).getAttribute("value");
		
		
		if(! EmpId.isEmpty()) {
			
			if(EmpId.matches("[0-9]{4}")) {
				System.out.println("Employee id populated as expected");
			}else {
				System.out.println("Employe id is not populated as expected");
			}
			
		}else {
			System.out.println("Empoyee id is empty");
		}
		
	}
	
	
	 
	public static void validateurl() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		String expPageName="viewEmployeeList";
	    String url=driver.getCurrentUrl();
	if (url.endsWith("viewEmployeeList")) {
		
		System.out.println(url);
		
		
	}else
		System.out.println("url does not ends with view employee list");
	}
	
	public static void logout() {
		
		driver.findElement(By.id("welcome")).click();
		/*instaed of using id we can use link text and partial link text as well*/
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Logout")).click();	
		
		
	}
	
public static void addEmployee() {
	

	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	/*click method is used to click buttons*/
	driver.findElement(By.name("firstName")).sendKeys("korrapati");
	driver.findElement(By.name("middleName")).sendKeys("sirish");
	driver.findElement(By.name("lastName")).sendKeys("sai");
	driver.findElement(By.name("employeeId")).clear();
	driver.findElement(By.name("employeeId")).sendKeys("0017");
	/*sendkeys won't override the existing value ,it will get added to the existing value*/
	/* so by using clear method to clear the existing value  and to fetch new value*/
	driver.findElement(By.name("chkLogin")).click();
	driver.findElement(By.id("user_name")).sendKeys("rohini");
	driver.findElement(By.id("user_password")).sendKeys("KRohini17@");
	driver.findElement(By.id("re_password")).sendKeys("KRohini17@");
	driver.findElement(By.id("btnSave")).click();
	
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
	
	public static void login(String userName,String passWord) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		driver.findElement(By.name("Submit")).click();
		
		
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
		driver.get("https://opensource-demo.orangehrmlive.com");
	}
	
	
}
