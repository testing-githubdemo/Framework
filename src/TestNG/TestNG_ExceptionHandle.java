package TestNG;

import org.testng.annotations.Test;

public class TestNG_ExceptionHandle {
@Test(expectedExceptions =NumberFormatException.class )
public void m1()
{
	System.out.println("Exception Handle");
	String s1="Hello";
	Integer.parseInt(s1);
}
	
}
