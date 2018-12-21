package POM_FMHerndonSMJ.POM_FMHerndonSMJ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStart {
 
	//WebDriver driver; 
		
	public void BrowserStarter()
	{
		
			String AUT = "http://www.sdettraining.com//online";
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			driver.get(AUT);

}
		
}
