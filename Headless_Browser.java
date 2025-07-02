package Interview_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         ChromeOptions option=new ChromeOptions();
         option.addArguments("Headless");
         
         System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver-win32\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver(option);
 		driver.manage().window().maximize();

 		Thread.sleep(2000);

         driver.get("https://www.google.co.in/");
	}

}
