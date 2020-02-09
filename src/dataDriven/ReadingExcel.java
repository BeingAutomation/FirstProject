package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingExcel {
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream(".//TestData//TestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int lastRow = sheet.getLastRowNum();
		System.out.println("Last row number is :"+lastRow);
		
		for(int i=0; i<= lastRow ; i ++){
			
		
		Row row = sheet.getRow(i);
		
		int colnum = row.getLastCellNum();
		
		
		Cell cell = row.getCell(0);
		try{
		String str = cell.getStringCellValue();
		System.out.print(str+"\t");
		
		} catch(Exception e){
			
			System.out.println(cell.getNumericCellValue());
		}
		
		
		}
		
		
		FileOutputStream fout = new FileOutputStream("");
	/*	 row = sheet.getRow(0);
		 cell = row.getCell(1);
		
		 str = cell.getStringCellValue();
		System.out.println(str);*/
		
		
		
		
		
	}
	

}
