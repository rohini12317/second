package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Workingwithxcel {

	public static void main(String[] args) throws IOException {
		
		getdata();
		
		
		/* first we should access workbook then sheet then rows and then cells */

		try {
			String path = "F:\\parameters.xlsx";
			File file = new File(path);
			if (file.exists()) {
				FileInputStream fis = new FileInputStream("F:\\parameters.xlsx");

				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheet("CreateCompany");
				if (sheet != null) {
					XSSFRow row = sheet.getRow(1);
					// we wil get nullpointer exception if getrow(value) is not there//
					if (row != null) {
						XSSFCell cell = row.getCell(0);
						if (cell != null) {
							CellType type=cell.getCellType();
							Object Cellvalue;
							switch (type) {
							case NUMERIC:
								 Cellvalue = cell.getNumericCellValue();
								System.out.println(Cellvalue);
								break;

							default:
								 Cellvalue=cell.getStringCellValue();
								System.out.println(Cellvalue);
								break;
							}
							
							//String Cellvalue=cell.getStringCellValue();
							
							/*if value in the cell is numeric then we will get"Illegalstateexception"
							 * so instead of taking getstringcell value with return type string
							 * we should take getnumeric cellvalue with returntype double
							 */
							//Double Cellvalue = cell.getNumericCellValue();
							
							System.out.println(type);
						} else {
							System.out.println("cell value is not valid");
							workbook.close();
						}

					} else
						System.out.println("row is not valid");

				} else 
					System.out.println("sheet is not valid");
				
			} else 
				System.out.println("file doesn't exist");
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getdata() {
		
		/*for(int rowcount=0;rowcount<sheet.getLastRownum();rowcount++) {
			XSSFRow row=sheet.getrow(rowcount);
			XSSFCell cell=row.getCell(cellnum);
			value=cell.getStringCellValue();
			System.out.println(value);
			
		}*/
		
	}

}
