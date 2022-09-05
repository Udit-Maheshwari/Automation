package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Listener_demo 
{
	@Test
	public void login()
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Test1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//to verify title
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

}
