package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Hard_Assertion_demo 
{
	@Test
	public void testmethod()
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Test1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//Verify title of webpage
		System.out.println("verify title.....");
		String expectedTitle="Automation Testing Practice";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		//verify presence of wikipedia icon
		System.out.println("verify presence of wilipedia icon...");
		WebElement icon=driver.findElement(By.className("wikipedia-icon"));
		Assert.assertTrue(icon.isDisplayed());//this is hard assertion
		
		System.out.println("verifying the presence of wikipedia search button icon....");
		WebElement search=driver.findElement(By.className("wikipedia-search-button"));
		Assert.assertTrue(search.isDisplayed());
		
		driver.close();
	}

}
