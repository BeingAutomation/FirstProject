package tdd;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Test1 {
	
	@Parameters({"browser","browser1"})
	@Test()
	public void m1(String str, String str1){
		System.out.println(str);
		System.out.println(str1);
	}

}
