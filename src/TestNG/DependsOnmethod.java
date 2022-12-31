package TestNG;

import org.testng.annotations.Test;

public class DependsOnmethod {
	//dependsOnMethods is nothing but when you want to give dependancy like like 1st login then homepage then profilepage ..etc.
	//When we add dependsOnMethods then the 1st method will pass then and then only depending methods will be executed.
	@Test
	public void loginTest()
	{
		int i=10/5;
	}
	@Test(dependsOnMethods = "loginTest" )
	public void homePage()
	{
		System.out.println("Login page then go to home page");
	}
	@Test(dependsOnMethods = "loginTest")
	public void searchpage()
	{
		System.out.println("Login the search");
		
	}
	@Test(dependsOnMethods = "searchpage")
	public void regTest()
	{
		System.out.println("login ang register");
	}

}
