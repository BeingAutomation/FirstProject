package secondWeek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPropertyFile2 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(".//TestData//Data.properties");
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String str = prop.getProperty("username2");
		System.out.println(str);
		str = prop.getProperty("username1");
		System.out.println(str);
		
		prop.setProperty("username3", "test");
	
		System.out.println(System.getProperty("user.dir"));
		
		
		
	}

}
