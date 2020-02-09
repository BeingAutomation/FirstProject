package firstWeek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllLinks {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\Jars\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://google.com");
	    
	   List<WebElement> eleList = driver.findElements(By.xpath("//div[contains(text(),'Google')]/a"));
			
	/*	for(WebElement ele : eleList){
			
			ele.click();
			Thread.sleep(3000);
		}*/
	    
	    
	/*    for(int i=1; i <eleList.size(); i++){
	    	
	    	WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Google')]/a["+i+"]"));
	    	ele.click();
	    	
	    
	    }
	    */
	    
	    driver.navigate().to("https://flipkart.com");
	  /*  WebElement element = driver.findElement(By.cssSelector("select#day"));
	    
	    Select sel = new Select(element);    //select class object
		sel.selectByIndex(2);
		Thread.sleep(1000);
		sel.selectByValue("17");
		Thread.sleep(1000);
		sel.selectByVisibleText("20");*/
	    
	    
		
		
	    
	    
	    
	}

}
