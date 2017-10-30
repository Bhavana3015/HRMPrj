package BaseFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeBrowser {
public static WebDriver driver;
	
	public  static void browserInvoke(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\All_Access\\Bhavana\\Selenium SW\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();		
			}
		
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\All_Access\\Bhavana\\Selenium SW\\Drivers\\IEDriverServer.exe");
		      driver=new InternetExplorerDriver();
		}
		
		else
		{
			System.out.println("No browser to be invoked");
		}
	}
	

}
