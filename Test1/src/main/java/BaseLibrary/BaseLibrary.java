package BaseLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLibrary
{
	public static WebDriver driver;
	public void getlaunch(String url)
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[text()='×']")).click();
		driver.findElement(By.xpath("(//a[.='Practice'])[1]")).click();
	}
	
	/*@AfterTest
	public void quit()
	{
		//driver.quit();
	}*/

}
