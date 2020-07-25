package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcellDataProvider
{
	@Test(dataProvider ="test1data" )
	public void test1(String Username,String Password)
	{
		System.out.println(Username+" | "+Password);
	}
	
	@DataProvider(name="test1data")
	public  Object[][] getData() 
	{
		String excellPath="C:\\Users\\gul_l\\eclipse-workspace\\NewTest\\excel\\Data.xlsx";
		Object data[][]=testData(excellPath, "Sheet1");
		return data;
	}
	public  Object[][] testData(String excellPath,String sheetName )
	{
		ExcelUtils excell=new ExcelUtils(excellPath, sheetName);
		int rowCount=excell.getRowCount();
		int colCount=excell.getColCount();
		Object data[][]=new Object[rowCount-1][colCount];
		for (int i = 1; i <rowCount; i++)
		{
			for (int j = 0; j <colCount; j++)
			{
				String cellData=excell.getCellDataString(i, j);
				System.out.print(cellData+"  |  ");
				data[i-1][j]=cellData;
				
			}
			System.out.println();
		}
		return data;
	}
}
