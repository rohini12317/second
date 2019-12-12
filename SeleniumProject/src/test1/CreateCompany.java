package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import frameworkmethods.Commonmethods;

public class CreateCompany {
	public static void main(String[] args) {
		Create_company_with_new_status();
	}
	
	
	
	
	public static void Create_company_with_new_status() {
		
		FileInputStream fis=null;
		Properties props=null;
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\Config\\Masterdata.properties");
		    props=new Properties();
			props.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Commonmethods.launchapplication(props.getProperty("browser"),props.getProperty("url"));
	}

}
