package applicationutility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ExcelUtility.ExcelUtilityInterface;
import propertyutility.PropertyUtility;


public class ApplicationUtility implements PropertyUtility,ExcelUtilityInterface
{

	public String getReaddata(String key)
	{
		String path="C:\\Users\\Asus\\eclipse-workspace\\Test1\\TestData\\config.properties";
		String value="";
		try 
		{
			FileInputStream fls=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fls);
			value=prop.getProperty(key);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception is :"+e);
		}
		
		return value;
	}

	@Override
	public String getdata(String path, int sheetno, int colno, int rowno) 
	{
		String value="";
		try 
		{
			FileInputStream fls = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fls);
			XSSFSheet sheet= wb.getSheetAt(sheetno);
			value=sheet.getRow(rowno).getCell(colno).getStringCellValue();
			wb.close();
				
		} catch (Exception e) 
		{
			System.out.println("exception is "+e);
		}
		return value;
		
	}
	

}
