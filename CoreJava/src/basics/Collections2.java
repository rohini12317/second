package basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collections2 {

	public static void main(String[] args) {
		
		/*HashSet<String> val1=new HashSet<>();*/
		/*TreeSet<String> val1=new TreeSet<>();*/
		LinkedHashSet<String> val1=new LinkedHashSet<>();
		
		val1.add("xyz");
		val1.add("ghi");
		val1.add("800");
		val1.add("rohitha");
		val1.add("rohitha");
	/*	int totalval1=val1.size();*/
		
		for(String val:val1) {
		
		System.out.println(val);
		}
		
	}
	}


