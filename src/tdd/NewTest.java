package tdd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
@BeforeSuite
public void f1Method(){
	  System.out.println("f1");
}

@BeforeTest
public void f2Method(){
	  System.out.println("f2");
}

@BeforeClass
public void f3Method(){
	  System.out.println("f3");
}

@BeforeMethod
  @Test(priority=1)
  public void firstMethod(){
	  System.out.println("first");
  }
  
  
  @Test
  public void secondMethod(){
	  System.out.println("second");
	  int a =5, b=0;
	  int c = a/b;
  }
  
  
 @Test(priority=2)
 public void aMethod(){
	 System.out.println("amethod");
 }
 
 
 @BeforeMethod
 public void prerReq(){
	 System.out.println("Before method");
 }
 
 @AfterMethod
 public void postrReq(){
	 System.out.println("after method");
 }
  
  
@AfterSuite
public void L1Method(){
	  System.out.println("L1");
}


@AfterTest
public void L2Method(){
	  System.out.println("L2");
}

@AfterClass
public void L3Method(){
	  System.out.println("L3");
}
}


