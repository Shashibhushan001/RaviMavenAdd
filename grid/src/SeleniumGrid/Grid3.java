package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid3 
{
@Test
public void test() throws MalformedURLException
{
	URL r=new URL("http://192.168.2.2:4444/wd/hub/");
	DesiredCapabilities d=new DesiredCapabilities();
	d.setBrowserName("chrome");
	WebDriver driver=new RemoteWebDriver(r,d);
	driver.get("http://www.amazon.com");
	System.out.println(driver.getTitle());
	driver.close();
	
}
}
