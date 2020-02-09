package secondWeek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestPropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(".//TestData//Data.properties");
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String str = prop.getProperty("username2");
		System.out.println(str);
		str = prop.getProperty("username1");
		System.out.println(str);
		
		str = prop.getProperty("Eid");
		System.out.println(str);
		
		int a = Integer.parseInt(str);
		
		System.out.println(a*a);
		
		System.out.println(System.getProperty("user.dir"));
		
	}

}
