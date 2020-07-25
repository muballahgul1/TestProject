package utils;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	static String projectname;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public ExcelUtils(String excellPath,String sheetName )
	{
		
		 try {
		
			workbook = new XSSFWorkbook(excellPath);
			sheet=workbook.getSheet(sheetName);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		getRowCount();
		//getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	public static int getRowCount()
	{
		int rowCount=0;
		try {
			
			 rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("row number:"+rowCount);
			} 
		
		catch (Exception e) 
			{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			}
		return rowCount;
	}
	public static String getCellDataString(int rowNum,int colNum) 
	{
		String cellData=null;
		try {
			
			 cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			 System.out.println(cellData);
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;
	}
	public static void getCellDataNumber(int rowNum,int colNum) 
	{
		try {
			
			 Double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			 System.out.println(cellData);
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static int getColCount()
	{
		int colCount=0;
		
		try {
			
			colCount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("col number:"+colCount);
			} 
		
		catch (Exception e) 
			{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			}
		return colCount;
	}

}
