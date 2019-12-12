package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;

public class Readerwriter {

	public static void main(String[] args) {
		File  fr=new File("E:\\file\\credentials.txt");
		
		try {
			
			Reader fir=new FileReader(fr);
			//we can take file reader as well insted of reader//
			BufferedReader bfr=new BufferedReader(fir);
			try {
				fir.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//	fir.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
