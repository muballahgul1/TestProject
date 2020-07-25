package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToGetError {

	public static void main(String[] args) throws Exception {
		
		getData();

	}
	public static void getData() throws Exception 
	{
		XSSFWorkbook workBook=new XSSFWorkbook("C:\\Users\\gul_l\\eclipse-workspace\\NewTest\\excel\\Data.xlsx");
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		int rowCount=sheet.getRow(0).getLastCellNum();
		System.out.println(rowCount);
		int colCount=sheet.getRow(0).getLastCellNum();
		System.out.println(colCount);
		
	}

}
