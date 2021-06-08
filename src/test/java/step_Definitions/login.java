package step_Definitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import page_Objects.Search_Customer;
import page_Objects.loginpage;

public class login extends Base {
	
  @Before
	public void setup() throws IOException
	{
		logger=logger.getLogger("opencart");
		PropertyConfigurator.configure("log4j.properties");
		prop=new Properties();
		FileInputStream profile=new FileInputStream("config.properties");
		prop.load(profile);
		
		String browser=prop.getProperty("browser");
		
		logger.info("launching browser");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",prop.getProperty("chromepath"));
			driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.firfox.driver",prop.getProperty("firepath"));
			driver=new FirefoxDriver();
		}
		
		
	}

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions

		}

	@When("user opens URL {string}")
	public void user_opens_URL(String string) {
	    // Write code here that turns the phrase above into concrete actions
		logger.info("Launching URL");
	  
		driver.get(string);
		driver.manage().window().maximize();
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		l=new loginpage(driver);
		
		logger.info("entering log in info");
		l.sendusername(string);
		l.sendpassword(string2);
		
	}

	@When("click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    l.click_login();
	    
	    
	    
	}

	@Then("page tiltle should be {string}")
	public void page_tiltle_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
		if(driver.getPageSource().contains("log in was unsuccessfull"))
		{
			logger.info("login unsuccessfull");
			Assert.assertTrue(false);
			driver.quit();
		}
		else
		{
			Assert.assertEquals(string, driver.getTitle());
		}
	}

	@When("User click on Logout out link")
	public void user_click_on_Logout_out_link() {
	    // Write code here that turns the phrase above into concrete actions
	logger.info("getting logg off");
		l.click_logout();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals(string,driver.getTitle());
	}

	@After
	@Then("close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.quit();
	    
	}
	
	@Then("User can view dashboard")
	public void user_can_view_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	
		 
		 Assert.assertEquals("Dashboard",driver.getTitle());
		  
			}

	@When("user click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		
		 s=new Search_Customer(driver);
		 s.click_customermenu();
		 Thread.sleep(2000);
		   
	}

	@When("user click on customers menu item")
	public void user_click_on_customers_menu_item() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		  s.click_customermenu_item();
		  Thread.sleep(2000);
	}

	@Then("user can view customers page")
	public void user_can_view_customers_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  
		boolean status=driver.findElement(By.tagName("body")).getText().contains("Customers");
		Assert.assertEquals(true, status);
	    Thread.sleep(3000); 
	}

	
    @When("user enter email")
	public void user_enter_email() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  
    	s=new Search_Customer(driver);
    	s.input_email("kishan14@gamil.com");
    	 Thread.sleep(3000);
    	scroll_down();
	}

	@When("click on filter button")
	public void click_on_filter_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  s.Click_filter_button();
	  Thread.sleep(4000);
	}

	@Then("user should found email in search table")
	public void user_should_found_email_in_search_table() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  boolean status=s.Email_should_found_in_table("kishan14@gamil.com");
	  System.out.print("email found in table status is"+ status);
	 Assert.assertEquals(true, status);
	 Thread.sleep(4000);
	}

	@When("user enter name")
	public void user_enter_name() {
	    // Write code here that turns the phrase above into concrete actions
	   s.input_name("Cognizant cognizant");
	   scroll_down();
	   s.Click_filter_button();
	}

	@Then("user should found name in search table")
	public void user_should_found_name_in_search_table() {
	    // Write code here that turns the phrase above into concrete actions
	   boolean status= s.name_should_found_in_table("Cognizant","cognizant");
	   System.out.print("name found in table status is"+ status);
	   Assert.assertEquals(true, status);
	}
	




	
}
