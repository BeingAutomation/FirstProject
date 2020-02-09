package tdd;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	@DataProvider(name="userCredentials")
	public Object[][] dpMethod()
	{
		return new Object[][]{{"vijay","1234"},
			{"Faizaan","9887"},
		{"user2", "user3"}};
		
	}
	
	
	@Test(dataProvider="userCredentials")
	public void loginWithDP(String userName, String passWord){
		
		login(userName, passWord);
	}
	
	public void login(String un, String pwd){
		
		
			 
	}

}
