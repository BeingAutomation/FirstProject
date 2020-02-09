package retryAnalyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {

	int max=5,i=1;
	@Override
	public boolean retry(ITestResult arg0) {
		
		if(i<max){
			i++;
			return true;
		}
		
		return false;
	}
	
	

}
