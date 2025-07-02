package Interview_Program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login_gmail {
    public static void main(String args[])
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver-win32\\chromedriver.exe");
    	
    	ChromeDriver driver=new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://mail.google.com/mail/");
    }
}
