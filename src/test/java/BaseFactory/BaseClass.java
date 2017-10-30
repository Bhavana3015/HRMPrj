package BaseFactory;

import org.testng.annotations.BeforeClass;

public class BaseClass extends InvokeBrowser{
	
	@BeforeClass
	
	  public void invokeurl()
		{
			InvokeBrowser.browserInvoke("Chrome");
			driver.get("http://opensource.demo.orangehrmlive.com/");
		}
	
}