package basics;

import java.util.HashMap;

public class Collections3 {

	public static void main(String[] args) {
		
		HashMap<String, String> homeaddress=new HashMap<>();
		

		homeaddress.put("Name","Rohini");
		homeaddress.put("Address","#30,20th main");
		homeaddress.put("Locality","BTM 1st stage");
		homeaddress.put("City","Bangalore");
		homeaddress.put("Pincode","560029");
		
		
		System.out.println(homeaddress.get("pincode"));
		
		String cityname=homeaddress.remove("Locality");
		System.out.println(cityname);
		
		
		/*for(String keyname:"City") {
			System.out.println(keyname+":"+homeaddress.get(keyname));*/
		

         
		}
	}


