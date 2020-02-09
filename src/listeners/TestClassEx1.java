package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class TestClassEx1 {
	
	@Test
	public void test1(){
		
	}
	
	
	@Test
	public void test1(int x){
		int a=10, b=0;
		int c = a/b;
	}
	
	

}
