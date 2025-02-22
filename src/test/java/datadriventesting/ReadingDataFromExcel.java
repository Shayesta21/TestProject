package datadriventesting;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
	/*
	 * in order to read data from an excel sheet we need to follow the following hierarchy 
	 * Workbook-->sheet-->row-->cell
	 * 1)open file in reading mode
	 * 2)read data from sheet
	 */
		
		
		//open file in reading mode: to read the data from the workbook we need to create the FileInputStreamclass
		
		
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\TestDataFolder\\TestData.xlsx");
		
		
		XSSFWorkbook workbook= new XSSFWorkbook(fs);
		
		//for sheet you can use 2 methods getSheet(): provide name of the sheet for this  or getsheetAt(): provide index for this
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
	//	XSSFSheet sheet1=workbook.getSheetAt(0);
		
		//we need to count the total no of rows: so we use the method:getLastRowNum()which will return total no of rows
		
		 int totalrows=sheet.getLastRowNum();
		
		 int totalcells =sheet.getRow(1).getLastCellNum();
		 
		 System.out.println("Total number of rows: "+totalrows);//5
		
		 System.out.println("Total number of cells: "+totalcells);//4
		 
		 //we need to use 2 for loops,first for loop to increment the no of rows, second for loop to increment the no of cells in reach row
		 
		 
		 for(int r=0; r<=totalrows;r++) {                        //repeat rows from 0-5
			 
		     XSSFRow currentrow =sheet.getRow(r);
		     
			 for(int c=0;c<totalcells;c++) {                     //repeat cells from 1-4 
				 
			 XSSFCell cell =currentrow.getCell(c);
			 System.out.print(cell.toString()+"\t");
				 
			 }
			 
			 System.out.println();
		 }
		 
		 workbook.close();
		 fs.close();
		 
		 
		 
		

	}

}
