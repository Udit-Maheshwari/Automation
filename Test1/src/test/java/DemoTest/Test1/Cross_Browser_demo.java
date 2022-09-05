package DemoTest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Cross_Browser_demo
{
	public static WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void getlaunch(String browser)
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\TestNG\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		break;
		
		case "msedge":
			System.setProperty("WebDriver.edge.driver", "C:\\Users\\Asus\\eclipse-workspace\\Test1\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			break;
			
		default:
			driver=null;
			break;
		}
		
	}
	@Test
	public void verifytitle()
	{
		driver.get("https://www.google.com/");
		String expectedresult="Google";
		String actualreult=driver.getTitle();
		
		Assert.assertEquals(expectedresult, actualreult);
		
	}
	@AfterMethod
	public void quitbrowser()
	{
		driver.quit();
	}

}
