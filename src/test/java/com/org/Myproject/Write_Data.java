package com.org.Myproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	static Logger log = Logger.getLogger(Write_Data.class);
	public static void write_data() throws IOException {
		
		PropertyConfigurator.configure("log4j.properties");
		File f = new File("C:\\Users\\riyas\\Documents\\TeamCaptains.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("Data").createRow(0).createCell(0).setCellValue("Username");
		
		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("Password");
		
		wb.getSheet("Data").createRow(1).createCell(0).setCellValue("Shahid");
		
		wb.getSheet("Data").getRow(1).createCell(1).setCellValue("shahid@123");
		
	    wb.getSheet("Data").createRow(2).createCell(0).setCellValue("Afaan");
		
		wb.getSheet("Data").getRow(2).createCell(1).setCellValue("afaan@123");
		
		wb.getSheet("Data").createRow(3).createCell(0).setCellValue("Riyas");
		wb.getSheet("Data").getRow(3).createCell(1).setCellValue("k2");
		
		log.info("Data Write Successfully");
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		}
	public static void main(String[] args) throws Throwable  {
		
		write_data();
		
		
		
	}

}
