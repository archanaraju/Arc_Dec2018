package POM_FMHerndonSMJ.POM_FMHerndonSMJ;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverScript {
	
	
	WebDriver driver;
	String ItemToSearch = "echo";
	
	@BeforeTest
	public void setup()
	{
		//System.out.println("Browser gets prepared here and will navigate to the AUT");
		
	BrowserStart bs = new BrowserStart();
	bs.BrowserStarter();
	
	}
	
	@Test
	public void tc_End2EndShoppingCartTest()
	{
		System.out.println("Step 1:  Search class/page will get called");
		System.out.println("Step 2:  AddToCart class/page will get called");
		System.out.println("Step 3:  ModifyCart class/page will get called");
		System.out.println("Step 4:  CheckOut class/page will get called");
		System.out.println("Step 5:  Order Confirmation class/page will get called");
		System.out.println("Step 6:  Verify that the order has been placed code will be executed");
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("Browser will be closed here");
	}

}
