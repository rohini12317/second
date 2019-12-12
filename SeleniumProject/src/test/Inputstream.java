package test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inputstream {

	public static void main(String[] args){
		File  fr=new File("E:\\file\\credentials.txt");
		List<String> alldata=new ArrayList<>();
		Scanner in;
		//we are using scanner object to read entire data line by line bcoz file and buffer
		//reads data as a single character//
		
		
		
		
		try {
			in=new Scanner(fr);
			while(in.hasNext()) {
				alldata.add(in.next());
		}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(alldata);
		
	   /* String val1=in.next();
		String val2=in.next();
		System.out.println(val1);
		System.out.println(val2);*/
		/*
		
		
		try {
			FileInputStream fis=new FileInputStream(fr);
			BufferedInputStream bis=new BufferedInputStream(fis);
			
			System.out.println(bis.read());
			System.out.println(fis.read());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
