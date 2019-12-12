package frameworkmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EventMethods {

	public static void enterValue(WebElement element,String value) {
		if(element.isDisplayed()) {
	    	 if(element.isEnabled()) {
	    		 if(value !=null) {
	    			 element.sendKeys(value);
	  
	    		 }else 
	    			 System.out.println("invalid value is supplied");
	    	  } else 
	    		  System.out.println("first name element is not enabled");
	  
	    }else 
  	     System.out.println("first name element is not enabled");	
	}
	
		
		
	}

