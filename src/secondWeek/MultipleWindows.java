package secondWeek;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
																																																																																																						public class MultipleWindows {
	
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\Jars\\drivers\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://naukri.com");
			
		    String currWinHandle = driver.getWindowHandle();
		    System.out.println(currWinHandle);
		    System.out.println(driver.getTitle());
		    
		    
		   Set<String> allWinHandles =  driver.getWindowHandles();
		    
		    for(String str : allWinHandles){
		    	 
		    	driver.switchTo().window(str);
		    	System.out.println(driver.getCurrentUrl());
		    	System.out.println(driver.getTitle());
		    	
		     	driver.close();
		    }
		
		    
			driver.switchTo().window(currWinHandle);
	    	System.out.println(driver.getCurrentUrl());
	    	System.out.println(driver.getTitle());
	    	
	    	driver.switchTo().frame("i1");
	    	driver.switchTo().defaultContent();
	    	
	    	
	    	WebDriverWait wait=new WebDriverWait(driver, 60);
	    	wait.until(ExpectedConditions.alertIsPresent());
	    	
	    	
	    WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("abc"))));
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	}
	

}
