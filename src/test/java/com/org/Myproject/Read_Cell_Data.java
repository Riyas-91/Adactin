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

public class Read_Cell_Data {
	
	public static void get_cell_data() throws IOException {
		
		File f = new File("C:\\Users\\riyas\\Documents\\TeamCaptains.xlsx");
		
		System.out.println("Read Particular Cell:");
		System.out.println("----------------");
		
		FileInputStream fis = new FileInputStream(f);
		
		@SuppressWarnings("resource")
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(1);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i =0; i<numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
	for (int j=2;j<=2;j++) {
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
	get_cell_data();
}
}


