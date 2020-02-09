package firstWeek;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\Jars\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		
	    WebDriver driver = new ChromeDriver(options);
	    
	    driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_ga=2.138644410.802914996.1575516361-768248436.1569055244");
	    driver.findElement(By.xpath("(//*[@class='goahead'])[1]")).click();
	    driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
	    
	    Thread.sleep(3000);
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    
	//    alert.accept();
	    Thread.sleep(3000);
	    alert.dismiss();
	   
	    driver.close();
	    
		
		
	}

}
