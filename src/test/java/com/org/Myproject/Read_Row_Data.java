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

public class Read_Row_Data {
	
	public static void get_row() throws IOException {
		
		File f = new File("C:\\Users\\riyas\\Desktop\\Mavenproject\\TeamCaptains.xlsx");
		
		System.out.println("Particular Row:");
		System.out.println("----------------");
		
		FileInputStream fis = new FileInputStream(f);
		
		@SuppressWarnings("resource")
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(1);
		
     for (int i =6; i<=6; i++) 
		{
			
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
		get_row();
	}

}
