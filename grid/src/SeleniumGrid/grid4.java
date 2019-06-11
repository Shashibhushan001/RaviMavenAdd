package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class grid4 
{
@Test
@Parameters({"node","browser"})
public void test(String node,String browser) throws MalformedURLException
{
	URL rr=new URL(node);
	DesiredCapabilities d=new DesiredCapabilities();
	d.setBrowserName(browser);
	WebDriver driver=new RemoteWebDriver(rr,d);
	driver.get("http://www.flipkart.com");
	System.out.println(driver.getTitle());
	
	
}
}
