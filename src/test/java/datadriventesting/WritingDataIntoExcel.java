package datadriventesting;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		/*
		 * to write data into the excel we use FileOutputStream class
		 */

	FileOutputStream 	fs = new FileOutputStream(System.getProperty("user.dir")+"\\TestDataFolder\\WriteTestData.xlsx");
		
	XSSFWorkbook wb= new XSSFWorkbook();
	XSSFSheet sheet = wb.createSheet("MyData"); //give the name for the sheet you want to create
	
	//create a row in the sheet and set the cell value
	
	XSSFRow row1=sheet.createRow(0);
	row1.createCell(0).setCellValue("Name");
	row1.createCell(1).setCellValue("DOB");
	row1.createCell(2).setCellValue("Gender");
	row1.createCell(3).setCellValue("Address");
	
	XSSFRow row2=sheet.createRow(1);
	row2.createCell(0).setCellValue("Firaz");
	row2.createCell(1).setCellValue("19-08-2010");
	row2.createCell(2).setCellValue("male");
	row2.createCell(3).setCellValue("Banglore");
	

	XSSFRow row3=sheet.createRow(2);
	row3.createCell(0).setCellValue("Faaz");
	row3.createCell(1).setCellValue("09-05-2014");
	row3.createCell(2).setCellValue("male");
	row3.createCell(3).setCellValue("Banglore");
	
	wb.write(fs);	
	wb.close();
	fs.close();
	
	System.out.println("File successfully created");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
