package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadOperations2 {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\abilash\\Desktop\\TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
	int	RowCount=sheet.getLastRowNum();
	
	for(int a=0;a<=RowCount;a++) // ROW
	{
		Row r=sheet.getRow(a);
		
		int CellCount=r.getLastCellNum();
		for(int b=0;b<CellCount;b++) // Row of Every Cell
		{
			String testData=r.getCell(b).getStringCellValue();
			System.out.print(testData+" ");
		}
		System.out.println();
	}

	}

}
