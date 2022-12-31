package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	//TestNG-Testing New Generation-Automation testing framework used to design test cases in systametic way.
/*	1.@BeforeSuite-setup system properites for chrome- 1st preferance 
 
	 
	2.@BeforeTest- Lounch browser 2nd preferance
	
	3.@BeforeClass -Enter URL
	
	4.@BeforeMethod-login to application
    5.@Test-google -search test
    6.@AfterMethod-Logout from application
	
    @BeforeMethod-login to application
    @Test-get title
    @AfterMethod-logout from application
    
    @BeforeMethod-Login to application
    @test -google logo test
    @AfterMethod -logout from application
    
   7. @AfterClass-close browser
   8. @AfterTest-DeleteAllCookies*/
	
	@BeforeClass
	public void URL()
	{
		System.out.println("@Beforeclass Enter URL");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("@BeforeMethod login to application");
	}
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("@BeforeSuite Setup system property");
	}
	
	@BeforeTest
	public void lounchBrowser()
	{
		System.out.println("@BeforeTest Lounching the browser");
	}
	@Test
	public void googleTitle()
	{
		System.out.println("@Test Google title ");
	}
	@Test
	public void serchText()
	{
		System.out.println("@Test Search Text");
	}
	@Test
	public void googleLogo()
	{
		System.out.println("@Test google logo");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("@AfterMethod Logout");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("@AfterClass -Close Browser");
	}
	
	@AfterTest
	public void deleteCookies()
	{
		System.out.println("@AfterTest-Delete Cookies");
	}
    
    
    
    
    
	
	
	

}
