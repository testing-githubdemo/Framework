package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {


@Test
public void softassert()
{
	String s1="hel";
	String s2="hello";
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(s1,s2);
	System.out.println("hello");
	soft.assertNotEquals(s1,s2);
	System.out.println("hiiii");
     soft.assertAll();
	
}
}
