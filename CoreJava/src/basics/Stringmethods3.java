package basics;

import java.util.Arrays;

public class Stringmethods3 {

	public static void main(String[] args) {
		String str="htiycjhijrfcjghfnjumnmlkijuokm";
		/*tochararray will convert string to array*/
		char[] allchars=str.toCharArray();
		str="";
		Arrays.sort(allchars);
		
		str=String.valueOf(allchars);
		System.out.println(str);
		/*There is no built in method to sort a string so we are converting string to array
		 * using "tochararray(); and sorting the resulting array and again we are converting
		 * array to string using"value of
		 */

	}

}
