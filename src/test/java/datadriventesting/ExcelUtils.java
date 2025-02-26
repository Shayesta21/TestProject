package datadriventesting;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class ExcelUtils {

	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle cs;
	
	
	
	public static int getRowCount(String excelfile, String excelsheet) throws IOException {
		
	   fi=new FileInputStream(excelfile);
	   wb = new XSSFWorkbook(fi);
       sheet=wb.getSheet(excelsheet);
       int rowcount=sheet.getLastRowNum();
       wb.close();
       fi.close();
       return rowcount;
		
	}
	
	public static int getCellCount(String excelfile, String excelsheet, int rownum) throws IOException {
		
		fi = new FileInputStream(excelfile);
		wb = new XSSFWorkbook(fi);
		sheet=wb.getSheet(excelsheet);
	    row=sheet.getRow(rownum);
	    int cellcount =row.getLastCellNum();
	    wb.close();
	    fi.close();
		return cellcount;
		
	}
	
	public static String getCellData(String excelfile, String excelsheet, int rownum, int cellnum) throws IOException {
		
		fi = new FileInputStream(excelfile);
		wb= new XSSFWorkbook(fi);
		sheet=wb.getSheet(excelsheet);
		row=sheet.getRow(rownum);
		cell=row.getCell(cellnum);
		
		String data;
		try {
			//data=cell.toString();
			DataFormatter formatter = new DataFormatter();
			data =formatter.formatCellValue(cell);
			
		}
		catch(Exception e) {
			data="";
		}
		wb.close();
	    fi.close();
		return data;
	}
	
	
	public static void setCellData(String excelfile, String excelsheet, int rowcount, int cellcount, String data) throws IOException {
		
		fi = new FileInputStream(excelfile);
		wb =new XSSFWorkbook(fi);
		sheet=wb.getSheet(excelsheet);
		row=sheet.getRow(rowcount);
		
		cell=row.createCell(cellcount);
		cell.setCellValue(data);
		
		fo = new FileOutputStream(excelfile);
		
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	
	}
	
	public static void fillGreenColor(String excelfile,String excelsheet, int rowcount, int cellcount) throws IOException {
	
		fi = new FileInputStream(excelfile);
		wb = new XSSFWorkbook(fi);
		sheet =wb.getSheet(excelsheet);
		row=sheet.getRow(rowcount);
		cell=row.getCell(cellcount);
		
		cs= wb.createCellStyle();
		
		cs.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(cs);
		
       fo = new FileOutputStream(excelfile);
		
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
				
	}
	
	public static void fillRedColor(String excelfile,String excelsheet, int rowcount, int cellcount) throws IOException {
		
		fi = new FileInputStream(excelfile);
		wb = new XSSFWorkbook(fi);
		sheet =wb.getSheet(excelsheet);
		row=sheet.getRow(rowcount);
		cell=row.getCell(cellcount);
		
		cs= wb.createCellStyle();
		
		cs.setFillForegroundColor(IndexedColors.RED.getIndex());
		cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(cs);
		
       fo = new FileOutputStream(excelfile);
		
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
				
	}
	
	
	
	
	
	
	
	
	
	
}
