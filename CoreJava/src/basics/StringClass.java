package basics;

public class StringClass {

	public static void main(String[] args) {
	
		String[] allValues = new String[7];
		allValues[0] = "₹ 6,536";
		allValues[1] = "₹ 100";
		allValues[2] = "₹ 1,254";
		allValues[3] = "₹ 376";
		allValues[4] = "₹ 182";
		allValues[5] = "₹ 1,912";
		allValues[6] = "₹ 5";
		
		String finalPrice = "₹ 8,453";
		
		int SumOfAll;
		int size=allValues.length;
		System.out.println(size);
		for(int i=0;i<=size-1;i++) 
		{
		/*System.out.println(i);*/
		}
		int val0=Integer.parseInt(allValues[0].replaceAll("[^0-9]", ""));
		int val1=Integer.parseInt(allValues[1].replaceAll("[^0-9]", ""));
		int val2=Integer.parseInt(allValues[2].replaceAll("[^0-9]", ""));
		int val3=Integer.parseInt(allValues[3].replaceAll("[^0-9]", ""));
		int val4=Integer.parseInt(allValues[4].replaceAll("[^0-9]", ""));
		int val5=Integer.parseInt(allValues[5].replaceAll("[^0-9]", ""));
		int val6=Integer.parseInt(allValues[6].replaceAll("[^0-9]", ""));
		
		int Finalprice =Integer.parseInt(finalPrice.replaceAll("[^0-9]", ""));
		System.out.println(Finalprice);
		
		SumOfAll=val0+val1+val2+val3+val4+val5+val6;
		System.out.println(SumOfAll);
		
		if (Finalprice==SumOfAll) System.out.println("pass");					
		else System.out.println("Fail");
		
		
		
		
		
		
		
		
		
		/*
		String expectedFlight = "6E-2624";
	
		int totalPassengers = 2;
		String ticketCost = "₹ 3,268";
		String totalPassengerPrice = "₹ 6,536";
		
		
		
		
		int expValue = Integer.parseInt(ticketCost.replaceAll("[^0-9]", "")) * totalPassengers;
		int actValue =Integer.parseInt(totalPassengerPrice.replaceAll("[^0-9]", ""));
		
		if (expValue==actValue) System.out.println("Both are equal");					
		else System.out.println("Both are not equal");			
		
		
			
		System.out.println("exp Val : " + expValue + " actual value : " + actValue);*/
		/*
		String actVal= new String("abc");
		
		String expVal = new String("abc");
		
		String url = "http://opensource-demo.orangehrmlive.com/index.php/time/viewEmployeeList";
		
		if (url.startsWith("https")) {
			System.out.println("url is https.");
		} else {
			System.out.println("url is not https.");
		}*/
		
		/*
		if (url.endsWith("viewEmployeeTimesheet")) {
			System.out.println("url is valid.");
		} else {
			System.out.println("url is not valid");
		}
		*/
		
		
		/*
		if (actVal.equalsIgnoreCase(expVal)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
		
        */
		

	}

}
