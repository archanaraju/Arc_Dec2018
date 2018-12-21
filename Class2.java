package FMHerndonSMJ.com.FMHerndonSMJ.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;



public class Class2 {
  @Test
  public void f() {
	  
	  System.out.println("Test F");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("after method");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("afterSuite");
  }
  
  @Test
  
  public void Test2() {
	  
	  System.out.println("Test2");
  }
  
  
}
