package Amezon_Sourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePage 
{
	
		

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// D:\Automation\chromedriver_win32
		try
		{
		System.out.println(" os name = "+System.getProperty("os.name"));
        System.out.println(" os version = "+System.getProperty("os.version"));
        
		//System.setProperty("webdriver.chrome.driver", "D:\\Mohan-Study\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/");
		
	  Assert.assertTrue(true, driver.getTitle());
	   //driver.searchMenu();
	  driver.close();
        }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
