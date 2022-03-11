package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooksClass {
	public static WebDriver driver;
	@Before
	public void init()
	{
		System.setProperty("webdriver.chrome.driver",".\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@After
	public void end() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
