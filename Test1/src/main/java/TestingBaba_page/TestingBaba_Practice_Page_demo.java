package TestingBaba_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;

public class TestingBaba_Practice_Page_demo extends BaseLibrary
{
	//String path="C:\\Users\\Asus\\eclipse-workspace\\Test1\\TestData\\Test Data.xlsx";
	
	public TestingBaba_Practice_Page_demo() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement Elements;
	
	@FindBy(xpath= "//a[text()='text box']")
	private WebElement textbox;
	
	@FindBy(xpath="//input[@id='fullname1']")
	private WebElement name;
	
	@FindBy(xpath="//input[@id='fullemail1']")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@id='fulladdresh1']")
	private WebElement Currentaddress;
	
	@FindBy(xpath="//textarea[@id='paddresh1']")
	private WebElement Permanentaddress;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submit;
	
	
	public void clickOnElement() 
	{
		Elements.click();
	}
	
	public void clickOnTextbox() throws InterruptedException
	{
		Thread.sleep(2000);
		textbox.click();
	}
	
	
	public void alldetails(String string) throws InterruptedException
	{
		Thread.sleep(2000);
		//String actual = "";
		//String expected="";
		name.sendKeys(string);
		Thread.sleep(2000);
		email.sendKeys(string);
		Thread.sleep(2000);
		Currentaddress.sendKeys(string);
		Thread.sleep(2000);
		Permanentaddress.sendKeys(string);
		Thread.sleep(2000);
		submit.click(); 
	   /* List<WebElement> text=	driver.findElements(By.xpath("(//div[@class='col-md-6 mt-5'])/label"));
		for(int i=1;i<text.size();i++)
		{
		  expected=(text.get(i).getText());
			i++;
			  
		}
		//System.out.println(expected);
		
		for(int j=1;j<5;j++)
		{
			actual=Excelutility.getdata(path, 0, j, 1);
			
		}
		//System.out.println(actual);
		
		AssertJUnit.assertEquals(actual, expected);*/
	}

}
