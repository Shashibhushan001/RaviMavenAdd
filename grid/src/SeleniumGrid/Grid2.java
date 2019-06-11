package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid2 
{	
	@Parameters({"node","browser"})
	@Test

	public void testB(String node,String browser) throws Exception
	{
		URL ra1= new URL(node);
		DesiredCapabilities c1=new DesiredCapabilities();
		c1.setBrowserName(browser);
		WebDriver driver=new RemoteWebDriver(ra1,c1);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(500);
			driver.findElement(By.name("q")).sendKeys("java");
			Thread.sleep(500);
			driver.findElement(By.name("q")).clear();
			Thread.sleep(500);
		}
		driver.close();
}
}
