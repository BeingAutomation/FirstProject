package retryAnalyser;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class RetryAnalyserEx {
    int m=1;
    
	@Test
	public void m1(){
		System.out.println("test");
		Assert.assertEquals(false, true);
	}
	
	
	@Test
	public void m2(){
		System.out.println("test pass");
		if(m<2){
			m++;
			Assert.assertEquals(false, true);
		}
	}
	
}
