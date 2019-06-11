package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid1 
{
@Test
public void testA() throws MalformedURLException
{
	URL ra= new URL("http://192.168.2.2:4444/wd/hub/");
	DesiredCapabilities c=new DesiredCapabilities();
	c.setBrowserName("chrome");
	WebDriver driver=new RemoteWebDriver(ra,c);
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	driver.quit();
	
}
}
