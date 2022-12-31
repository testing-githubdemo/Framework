package TestNG;

import org.testng.annotations.Test;
@Test(groups = {"Allclasslevel"})
public class TestNG_Groups {
	
	@Test(groups = {"sanity"})
	public void Test1()
	{
		System.out.println("Test 1");
	}
	@Test(groups = {"smoke","sanity"})
	public void Test2()
	{
		System.out.println("Test 2");
	}
	@Test(groups = {"regression"})
	public void Test3()
	{
		System.out.println("Test 3");
	}
	@Test
	public void Test4()
	{
		System.out.println("Test 4");
	}

}
