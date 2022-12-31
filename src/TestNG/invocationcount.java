package TestNG;

import org.testng.annotations.Test;

public class invocationcount {
	//invocationCount-When we want the single test case execute again and again then we use invocationCount
	@Test(invocationCount = 4)//it will execute 4 times
	public void m1()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum is: "+c);
	}

}
