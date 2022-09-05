package ExcelUtility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility 
{
	public static String getdata(String path, int sheetno, int colno, int rowno)
	{
		String value="";
		try 
		{
			FileInputStream fls = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fls);
			XSSFSheet sheet= wb.getSheetAt(sheetno);
			value=sheet.getRow(rowno).getCell(colno).getStringCellValue();
			
			
		} catch (Exception e) 
		{
			System.out.println("exception is "+e);
		}
		
		return value;
		
		
	}
	public static void main(String[] args) 
	{
		String path="C:\\Users\\Asus\\eclipse-workspace\\TestNG\\Excel\\TestData_TextBox.xlsx";
		for(int i=0;i<43;i++)
		{
			String out=getdata(path, 0, i, 1);
			System.out.println(out);
		}
		
	}

}
