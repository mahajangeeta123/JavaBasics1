package Amezon_Sourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMDemo_Element {
 
	public WebDriver driver;
	
	@FindBy(id="nav-logo-sprites")
	WebElement pageTitle;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	public void GetTitle()
	{
	    if(pageTitle.getText().equals("Amazon.in"))
	    {
	    	System.out.println("You are at homepage");
	    }
	}
	public void searchMenu()
	{
		searchBox.sendKeys("girls dress");
	}
	public POMDemo_Element(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
