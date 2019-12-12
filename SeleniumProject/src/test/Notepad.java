package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.WriteAbortedException;

public class Notepad {

	public static void main(String[] args) {
	
		Runtime creation=Runtime.getRuntime();
		
		
		try {
			Process file=creation.exec("Notepad");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\files\\third.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br=new BufferedReader(fr);
		
		try {
			String line;
			//we are using readline object//
			while((line=br.readLine()) !=null){
				System.out.println(line);
				
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
