package com.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {
	
	String path = "C:\\Users\\hp\\Desktop\\Software Testing\\April09SwagLab\\src\\main\\java\\com\\qa\\testData\\testdata.xslx";
	
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	
	public String readData(int sheet,int rownum, int cellnum) throws IOException
	{
		file = new File(path);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		
		String data = wb.getSheetAt(sheet).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;	
	}
	
	public int getRowCount(int sheet) throws IOException
	{
		file = new File(path);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		
		int rowcount=wb.getSheetAt(sheet).getLastRowNum();
		return rowcount;
	}
	
	public int getCellCount(int sheet,int rownum) throws IOException
	{
		file = new File(path);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		
		int cellcount =wb.getSheetAt(sheet).getRow(rownum).getLastCellNum();
		return cellcount;
	}
	

}
