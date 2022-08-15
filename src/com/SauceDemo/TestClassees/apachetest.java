package com.SauceDemo.TestClassees;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class apachetest {

	public static void main(String[] args) throws IOException 
	{
		//1.path of excel file
				String path= "H:\\testing 2\\TestCase.xlsx";
			
				//2.To read that put into FileInputStream  
				FileInputStream file=new FileInputStream(path);
				
				//3.excel open and read
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				
				
				//4.open particular sheet
				XSSFSheet sheet=workbook.getSheet("sheet1");
				
				//5.row read
				XSSFRow row=sheet.getRow(1);
				
				//6.column read
				XSSFCell cell=row.getCell(1);
				
				//sring value
				String value=cell.getStringCellValue();
				System.out.println("value of excel"+value);
			
		

	}

}
