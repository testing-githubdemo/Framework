package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@Test(dataProvider = "getTestData")
	public void dataTest(String username,String password)
	{
      System.out.println("saurceLogin");
      System.out.println(username);
      System.out.println(password);
      System.out.println();
	}
	
	@DataProvider(name="getTestData")
	public Object[][] getdata(){
		//1st-correct username and currect password
		//2nd -correct username and wrong password
		//3rd-wrong username and correct password
		//4th - wrong username and password
		
		Object[][] data= new Object[4][2];
		data[0][0]="CorrectUsername";
		data[0][1]="CorrectPassword";
		
		data[1][0]="CorrectUsername";
		data[1][1]="WrongPassword";
		
		data[2][0]="WrongUsername";
		data[2][1]="CorrectPassword";
		
		data[3][0]="WrongUsername";
		data[3][1]="WrongPassword";
		
		
		
		
		
		return data;
		
		
	}


}
