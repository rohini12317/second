package basics;

public class Stringmethods2 {

	public static void main(String[] args) {
		String str="   abcde ghijk lmno pqrs  ";
	      System.out.println(str.replaceFirst("   ", ""));
	      
	      int startpos=0;
	      int endpos=0;
	      
	      for(int i=0;i<=str.length()-1;i++)
	      {
	    	  char mychar=str.charAt(i);
	    	  if (mychar !=' ') {
	    		  startpos=i;
	    		  break;
	    	  }
	    	  
	    	  for(int j=str.length()-1;j>=0;j--)
		      {
		    	  char mychar1=str.charAt(j);
		    	  if (mychar1 !=' ') {
		    		  endpos=j;
		    		  break;
		    	  }
	
	      }
	    	  str=str.substring(startpos, endpos);
	    	  System.out.println(str);
	}
}
}
