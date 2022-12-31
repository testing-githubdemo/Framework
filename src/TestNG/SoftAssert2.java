package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class SoftAssert2 {
	SoftAssert assert1=new SoftAssert();
@Test(priority = 1)
public void deomTest1()
{
	
	assert1.assertEquals("welcome", "Welcome");
	System.out.println("Execution Stated");
    assert1.assertEquals("selenium","selenium");
    System.out.println("Sucessfull passed asser2");
   // assert1.assertAll();//It will collect the results of all the assertionss and in case of any failure marked the test as failed
}
@Test(priority=2)
public void demoTest2()
{
	assert1.assertEquals("hello", "hello");
	System.out.println("Test case 2");
	assert1.assertTrue(true);
	System.out.println("Hiiiii");
	assert1.assertAll();
}
}
