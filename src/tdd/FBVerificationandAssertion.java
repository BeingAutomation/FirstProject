package tdd;

import org.testng.annotations.Test;

import com.google.common.base.Verify;

import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class FBVerificationandAssertion {
  
	WebDriver driver;
 @Test
 public void m1(){
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\Jars\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	driver.get("https://fb.com");
	
	//Hard Assertion
	// Assert.assertEquals(driver.getTitle(), "Google", "verfiying titles");
	int a=10, b= 20;
	boolean result;
	if(a==b){
		result = true;
	}else{
		result = false;
	}
	//Verification
	Verify.verify(result, "Comparing two integer"); // Need to provide conditional statement which will result into a boolean value
	Verify.verify(a==b, "Comparing two integer");
	
	 
 }
 
 @DataProvider(name="userCredentials")
	public Object[][] dpMethod()
	{
		return new Object[][]{{"vijay","1234"},
			{"Faizaan","9887"},
		{"user2", "user3"}};
		
	}
 
 @Test(dataProvider="userCredentials")
 public void m2(String username, String password) throws InterruptedException{
	String fbVersion;
	 List<WebElement> eleList = driver.findElements(By.xpath("//*[@alt='Facebook']"));
	 if(eleList.size() > 0 ){
		 System.out.println("New Facebook");
		 fbVersion = "New"; 
	 }else{
		 System.out.println("Old Fb");
		 fbVersion = "Old";
	 }
	 
	
	 login(fbVersion, username, password);
	 
 }
 
 
 public void login(String fbtype, String un, String pwd) throws InterruptedException{
	 
	 switch(fbtype){
	 case "Old":  //old fb xpath for login
		WebElement email  = driver.findElement(By.xpath("//input[@name='email']"));
		
		 email.sendKeys(un);
		 driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys(pwd);
		
		 Thread.sleep(3000);
		 
		 email.clear();
		 driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).clear();
		break;
		 
		 
	 case "New":  //new 
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys(un);
		 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pwd);
		 driver.findElement(By.xpath("//button[@name='login']")).click();
		 
		 break;
		 
		 
	 }
	 
 }
 
 
 
}
