package test;

import frameworkmethods.Method1;

public class Cogmento {

	public static void main(String[] args) {

		Method1.launchapplicaton("chrome", "https://ui.cogmento.com");
		//List<String> credentials=FileUtils.readalllinesfromFile("path");
		Method1.login("nandasele69@gmail.com","Test@1234");
		Method1.company();
		Method1.newcompany("godrej","hyderabad","Telangana","200","hdywh");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Method1.company();
		Method1.newcompany("samsung","chennai","Tamilnadu","1000","8754");
		
	}

}
