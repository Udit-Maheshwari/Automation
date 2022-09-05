package TestingBaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseLibrary.BaseLibrary;
import TestingBaba_page.TestingBaba_Practice_Page_demo;
import applicationutility.ApplicationUtility;

public class TestingBaba_Practice_Test_demo extends BaseLibrary
{
	String textpath="C:\\Users\\Asus\\eclipse-workspace\\Test1\\TestData\\Test Data.xlsx";
	ApplicationUtility ob1;
	TestingBaba_Practice_Page_demo ob;
	@BeforeTest
	public void getlaunchtestingbaba()
	{
		ob1=new ApplicationUtility();
		getlaunch(ob1.getReaddata("url"));
		ob=new TestingBaba_Practice_Page_demo();	
	}
	
	@Test(priority=1)
	public void clickOnElement()
	{
		ob.clickOnElement();
	}
	
	@Test(priority=2)
	public void ClickOnTextbox() throws InterruptedException
	{
		ob.clickOnTextbox();
	}
	
	@Test(priority=3)
	public void alldetails() throws InterruptedException
	{
		for(int i=1;i<5;i++)
		{
		ob.alldetails(ob1.getdata(textpath, 0, i, 1));
		}
	}

}
