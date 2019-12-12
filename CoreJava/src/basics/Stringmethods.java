package basics;

public class Stringmethods {

	public static void main(String[] args) {
      String str="   abcde ghijk lmno pqrs  ";
     /* System.out.println(str.replaceAll(" ", ""));*/
      String newstr=str.trim();
      char[] allchars=newstr.toCharArray();
      newstr="";
      for(char mychar:allchars) {
    	  if(mychar !=' ') {
    		  newstr += mychar;
    	  }
      }
    
    int firstNonSpaceChar=(str.indexOf(String.valueOf(newstr.charAt(0))));
    int LastNonSpaceChar=(str.indexOf(String.valueOf(newstr.charAt(newstr.length()-1))));
    
    System.out.println(str.substring(0, firstNonSpaceChar)+newstr+str.substring(LastNonSpaceChar+1));

	}

}
