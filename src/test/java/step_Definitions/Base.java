package step_Definitions;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import page_Objects.Search_Customer;
import page_Objects.loginpage;

public class Base {

	static WebDriver driver;
	public static Logger logger;
	public Properties prop;
	
	public loginpage l;
	public Search_Customer s;
	public static JavascriptExecutor js;
	
	public static String randomstring()
	{
	String string=RandomStringUtils.randomAlphanumeric(5);
	return(string);
}
	
	public static void scroll_down()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
	}
	
	public static void scroll_up()
	{
		  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
}
