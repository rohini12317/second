package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class arraylist {

	public static void main(String[] args) {
		
		TreeSet<Integer> allvalues=new TreeSet<>();
		/*allvalues.add("abc");
		allvalues.add("xyz");
		allvalues.add("abcdef");
		allvalues.add("address");
		allvalues.add("location");
		allvalues.add("1234");*/
	
		allvalues.add(90);
		allvalues.add(120);
		allvalues.add(85);
		/* converting set to array o find out the highest position by using object.toarray()*/
		/*Object[] vals=allvalues.toArray();
		
		/*by using classes we can convert from set to lists*/
		/*List<Integer> vals=List.newArrayList(allvalues);
		
		
		System.out.println(vals[vals.length-2]);*/
		
		/* descending iterator(uses next and hashnext methods) is not availabe for arraylist and set as well t is only availabe for Linked list
		 * and tree set(which follows doublelinked list*/
		
		/* by using for each loop we can loop and print all the values*/
		
	/*	allvalues.forEach(val ->System.out.println(val));
		
		/*by using iterator and enhanced for loop we can loop all the values*/
		
	/*	Iterator<String> vals=
	 * }
	 */

	}

}
