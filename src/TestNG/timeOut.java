package TestNG;

import org.testng.annotations.Test;


public class timeOut {
	//TimeOutException
@Test(timeOut = 1000)
public void m1()
{
	for(;;)
	{
		System.out.println("hello");
	}
}
}
