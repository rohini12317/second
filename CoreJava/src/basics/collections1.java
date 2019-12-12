package basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class collections1 {

	public static void main(String[] args) {
		
		Vector<String> val=new Vector<>();
		/*ArrayList<String> val=new ArrayList<>();
		LinkedList<String> val=new LinkedList<>();*/
		
		val.add("rohini");
		val.add("750");
		val.add("satwa");
		val.add("abc");
		val.add("abc");
		val.add("1234");
		int totalvals=val.size();
		
		
		for (int i=0;i<=totalvals-1;i++) {
			System.out.println(val.get(i));
		}
		
		
		

	}

}
