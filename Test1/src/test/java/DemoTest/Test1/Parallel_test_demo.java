package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Parallel_test_demo 
{
	@Test
	public void verifytitle() throws InterruptedException
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Test1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//to verify title
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	
	@Test
	public void verifylogo() throws InterruptedException
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\TestNG\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//to verify logo
		WebElement logo=driver.findElement(By.xpath("(//div[@class='login_logo'])"));
		
		Assert.assertTrue(logo.isDisplayed());
		
		Thread.sleep(2000);
		
		driver.quit();
	}


}
