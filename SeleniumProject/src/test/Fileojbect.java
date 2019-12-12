package test;

import java.io.File;
import java.io.IOException;

public class Fileojbect {

	public static void main(String[] args) {
		
		printvalue(5,20);

		
		File file=new File("D:\\folder2");
		
		/*list files will give access to all files in the respective folder
		 * whereas list will return only the names of files in the folder
		 */
			
		/*File[] files=file.listFiles();
		
		for(File r:files) {
			System.out.println(r.getName());
			
			String fname=r.getName();
			String allvals[]=fname.split("\\.");
			String extension=allvals[allvals.length-1];
			
			if(extension.equalsIgnoreCase("txt")) {
				r.delete();
			}*/
			
			
		}

	public static void printvalue(int minnumber, int maxnumber) {
		
		System.out.println(minnumber);
		minnumber++;
		if(minnumber<=maxnumber) {
			printvalue(minnumber,maxnumber);
		}
	}
		/*list()-return type is string
		 * it will return the file names
		 * 
		 */
		/*String[] f=file.list();
		
         for(String allfilesname:f) {
        	 System.out.println(allfilesname);
         }*/
		
		
		/*path name should end with extension*/
		/*file can be any variable*/
		/*System.out.println(file.exists());
		//returns true if file exist//*/
		//file.mkdir();
		//mkdir is used to create folder "make directory"//
		//path should refer to folder not to the file...in the above path//
		//it wont create new folder if it already exists//
		
		//file.mkdirs();
		/*if path is D:\\files\\folder\\myfold\\first.txt but folder and myfold folders are not
		 * available so by using "mkdirs"  we can create the folders which we are not available for the 
		 * mentioned file
		 */
		
		
	/*	if(!file.exists()) {
			try {
				file.createNewFile();
				//create new file method is used to create new file//
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else
			System.out.println("file already exist");
		
		
		//To delete existing file//
		if(file.exists()) {
			file.delete();
		}else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		//we have few more methods like is visible,is hidden,read,write,
		
	}


