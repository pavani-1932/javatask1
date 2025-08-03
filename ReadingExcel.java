package excelprograms1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		String excelFilePath=".\\datafiles\\Sheet1.xlsx";
		FileInputStream inputstream= new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rows= sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		System.out.println(rows);
		System.out.println(cols);
		
		for(int r=0; r<=rows;r++) {
			
			XSSFRow row = sheet.getRow(r);
			
			for(int c=0; c<cols;c++) {
				
				XSSFCell cell = row.getCell(c);
				switch(cell.getCellType()) {
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				
				}
				System.out.print("| ");
			}
			System.out.println();
			
		}
		
		 
		 }
		
	}


