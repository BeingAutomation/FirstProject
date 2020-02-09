package tdd;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void t1(){
		
		SoftAssert sAssert = new SoftAssert();
		
		sAssert.assertEquals(true, false);
		
		System.out.println("test");
		
		sAssert.assertAll();
	}
	

}
