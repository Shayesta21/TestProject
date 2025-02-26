package datadriventesting;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
public class WritingDataDynamically {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fs = new FileOutputStream(System.getProperty("user.dir")+"\\TestDataFolder\\dyTestdata.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet sheet= wb.createSheet("Dydata");
		
		//we need to use scanner class to get the dynamic input from the user
		
		Scanner sc= new Scanner(System.in);
		System.out.println("How many rows do you need");
		int rows=sc.nextInt(); 
		
		System.out.println("How many cells do you need");
		int cells=sc.nextInt();
		
		for(int r=0;r<=rows;r++) {
			
			XSSFRow cr= sheet.createRow(r);
			for(int c=0;c<=cells;c++) {
			XSSFCell curcell= cr.createCell(c);	
			curcell.setCellValue(sc.next());
				
			}
			
			}
		
		wb.write(fs);// this attaches the workbook to the file
		wb.close();
		fs.close();
		
		System.out.println("file is created");
		
		
		
		

	}

}
