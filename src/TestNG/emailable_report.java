package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailable_report {
	@Test
	public void googleTitleText()
	{
		Reporter.log("Running test 1", true);
		System.out.println("@Test--Google Title Text");
	}
	@Test
	public void searchText()
	{
		Reporter.log("Running Test 2", true);
		System.out.println("@Test--Search Text");
	}

}
