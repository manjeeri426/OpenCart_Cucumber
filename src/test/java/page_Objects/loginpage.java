package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import 	org.openqa.selenium.By;

public class loginpage {

	WebDriver ldriver;
	
	public loginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	By username=By.xpath("//input[@id='input-username']");
	By password=By.xpath("//input[@id='input-password']");
	By login=By.xpath("//button[normalize-space()='Login']");


	By logout=By.xpath("//span[@class='hidden-xs hidden-sm hidden-md']"); // logout
	
	public void  sendusername(String usrname)
	{

		ldriver.findElement(username).clear();
		ldriver.findElement(username).sendKeys(usrname);
	}
	
	public void  sendpassword(String pwd)
	{
		ldriver.findElement(password).clear();
		ldriver.findElement(password).sendKeys(pwd);
	}
	
	public void click_login()
	{
		ldriver.findElement(login).click();
	}
	
	public void  click_logout()
	{
		ldriver.findElement(logout).click();
	}
	
}
