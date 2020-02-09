package firstWeek;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;*/
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FirstSelenium {
	
	public static void main(String[] args) throws AWTException {
		
	/*	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\Jars\\drivers\\chromedriver.exe");
		
	//	WebDriver driver = new InternetExplorerDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		options.setExperimentalOption("prefs", prefs);
		
		
		WebDriver driver = new ChromeDriver(options);
		
	//	WebDriver d2 = new ChromeDriver();
		
	//	driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		System.out.println(driver.getTitle());
		
		d2.navigate().to("https://yahoo.com");
		System.out.println(d2.getTitle());
		
		
		String str = driver.getCurrentUrl();
		System.out.println(str);
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
	//	driver.findElement(By.className("gLFyf gsfi")).sendKeys("Testing");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.findElement(By.partialLinkText("Gmai")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[3]/center/input[1]")).click();
			
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
		for(int i=0; i < 5 ; i++){
			
			System.out.println(i);
			if(i>=0)
				continue;
			System.out.println(i);
		}
		
		
		
	}

}
