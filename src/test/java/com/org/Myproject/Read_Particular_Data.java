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

public class Read_Particular_Data  {
	
	public static void read_particular_data() throws IOException {
	
	File f = new File("C:\\Users\\riyas\\Desktop\\Mavenproject\\TeamCaptains.xlsx");
	
	System.out.println("Particular Data:");
	System.out.println("----------------");
	
	FileInputStream fis = new FileInputStream(f);
	
	@SuppressWarnings("resource")
	Workbook wb = new XSSFWorkbook(fis);
	
	Sheet sheetAt = wb.getSheetAt(1);
	
	Row row = sheetAt.getRow(2);
	
	Cell cell = row.getCell(2);
	
    CellType cellType = cell.getCellType();
	
	if(cellType.equals(CellType.STRING)) {
		
		String value = cell.getStringCellValue();
		System.out.println(value);
	}
	
	else if(cellType.equals(CellType.NUMERIC)) {
		double cellValue =cell.getNumericCellValue();
		
		int value = (int) cellValue;
		
		System.out.println(value);
	}
	
	}

	public static void main(String[] args) throws Throwable {
		read_particular_data();
		
	}
	}

