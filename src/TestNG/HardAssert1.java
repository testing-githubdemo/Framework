package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class HardAssert1 {
@Test
public void TC1()
{
	String exp="hi";
	String act="hi";
	assertEquals(act, exp);
}
	
@Test
public void TC2()
{
	String exp="hi";
	String act="hello";
	System.out.println("hello");
	assertEquals(act, exp);
	System.out.println("Welcome");
	System.out.println("Good Morning");
}
@Test
public void TC3()
{
	String exp="hi";
	String act="hi";
	assertEquals(act, exp);
}
}
