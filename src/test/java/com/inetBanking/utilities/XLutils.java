package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XLutils {

	
	public String[][] getDataFromSheet(String excelsheet, String sheetName)throws Exception
	{
		String[][] data;
		File file=new File(excelsheet);
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fileInputStream);
		
		Sheet sheet=workbook.getSheet(sheetName);
		
		int row=sheet.getPhysicalNumberOfRows();
		int colmns=sheet.getRow(0).getPhysicalNumberOfCells();
		
		data=new String[row][colmns];
		
		for(int rowindex=1;rowindex<sheet.getPhysicalNumberOfRows();rowindex++)
		{
			for(int colindex=0;colindex<sheet.getRow(rowindex).getPhysicalNumberOfCells();colindex++)
			{
				data[rowindex][colindex]=sheet.getRow(rowindex).getCell(colindex).toString();
			}
			
		}
		return data;
	}
	
}
