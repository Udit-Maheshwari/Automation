package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion_demo 
{
	@Test
	public void testmethod()
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Test1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		SoftAssert softverify=new SoftAssert();
		driver.get("https://testautomationpractice.blogspot.com/");
		//Verify title of webpage
		System.out.println("verify title.....");
		String expectedTitle="Automation Testing Practice12";
		String actualTitle=driver.getTitle();
		softverify.assertEquals(expectedTitle, actualTitle);
		
		//verify presence of wikipedia icon
		System.out.println("verify presence of wilipedia icon...");
		WebElement icon=driver.findElement(By.className("wikipedia-icon"));
		softverify.assertTrue(icon.isDisplayed());//this is hard assertion
		
		//to verify the icon of wikipedia search button
		System.out.println("verifying the presence of wikipedia search button icon....");
		WebElement search=driver.findElement(By.className("wikipedia-search-button"));
		softverify.assertTrue(search.isDisplayed());
		
		driver.close();
		//report all failure message
		softverify.assertAll();
		
		
	}

}
