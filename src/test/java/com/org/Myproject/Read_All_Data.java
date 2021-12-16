package com.org.Myproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_All_Data {
	
	public static void getall_data() throws IOException{
		
		File f = new File("C:\\Users\\riyas\\Documents\\TeamCaptains.xlsx");
		
		System.out.println("All Data:");
		System.out.println("----------------");
		
		FileInputStream fis = new FileInputStream(f);
		
		@SuppressWarnings("resource")
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(1);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i =0; i<numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j=0;j<numberOfCells;j++) {
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if(cellType.equals(CellType.STRING)) {
					String cellvalue = cell.getStringCellValue();
					System.out.println(cellvalue);
				}
				
				else if (cellType.equals(CellType.NUMERIC)) {
					double cellvalue = cell.getNumericCellValue();
					int value = (int) cellvalue;
					
					System.out.println(value);
					
				}
			}
			
		}
		
		}
	public static void main(String[] args) throws Throwable {
		getall_data();
		
	}	
}
