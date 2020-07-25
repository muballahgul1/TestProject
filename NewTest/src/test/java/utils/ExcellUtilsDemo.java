package utils;

public class ExcellUtilsDemo 
{
	public static void main(String[] args) {
		String projectname=System.getProperty("user.dir");
		ExcelUtils excell=new ExcelUtils(projectname+"/excel/Data.xlsx","Sheet1");
		excell.getRowCount();
		excell.getCellDataString(0, 0);
		excell.getCellDataNumber(1, 1);
	}
}
