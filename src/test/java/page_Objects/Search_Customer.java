package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class Search_Customer {

WebDriver ldriver;
	
	public Search_Customer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	By customers_menu=By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']"); 
	By customers_menuitem=By.xpath("//ul[@id='collapse33']//a[contains(text(),'Customers')]"); 
	By inputname=By.xpath("//input[@id='input-name']"); 
	By inputemail=By.xpath("//input[@id='input-email']"); 
	By filter_button=By.xpath("//button[normalize-space()='Filter']"); // filter button
	By table_rows=By.xpath("//table[@class='table table-bordered table-hover']/tbody//tr");

	public void click_customermenu()
	{
		ldriver.findElement(customers_menu).click();
	}
	
	public void click_customermenu_item()
	{
		ldriver.findElement(customers_menuitem).click();
	}
	
	public void input_name(String name)
	{
		ldriver.findElement(inputname).sendKeys(name);
	} 

	public void input_email(String email)
	{
		//new WebDriverWait(ldriver, 5).until(ExpectedConditions.visibilityOf(ldriver.findElement(inputemail))).sendKeys(email);
		ldriver.findElement(inputemail).sendKeys(email);
	}

	public void Click_filter_button()
	{
		ldriver.findElement(filter_button).click();
	}
	
	public boolean Email_should_found_in_table(String email)
	{
	int size=ldriver.findElements(table_rows).size();
	
	boolean flag=false;
	
	for(int i=1;i<=size;i++)
	{
		String actual_email=ldriver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody//tr["+i+"]//td[3]")).getText();
		
		if(actual_email.equals(email))
		{
			flag=true;
			break;
		}
		
	}
	return flag;
	
    }
	
	public boolean name_should_found_in_table(String fname,String lname)
	{
	int size=ldriver.findElements(table_rows).size();
	
	boolean flag=false;
	
	for(int i=1;i<=size;i++)
	{
		String actual_name=ldriver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody//tr["+i+"]//td[2]")).getText();
		String names[]=actual_name.split(" ");
		
		if(names[0].equals(fname) && names[1].equals(lname))
		{
			flag=true;
			break;
		}
		
	}
	return flag;
	}
	
}
	
