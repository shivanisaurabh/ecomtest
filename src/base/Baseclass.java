package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Baseclass {
	public static WebDriver drivers=null;
	public static Properties prop;
	

	public Baseclass() {
		
		try {
			String FilePath="D:\\Yatra\\src\\Data\\config.properties";
					 prop=new Properties();
					 FileInputStream file=new FileInputStream(FilePath);

			prop.load(file);
			String url=prop.getProperty(FilePath);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

public static  void intialization() {
String Browser=prop.getProperty("Browse");
		if (Browser.equals("Chrome")) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Downloads\\chromedriver_win32\\chromedriver.exe");
	drivers =new ChromeDriver();
	
	drivers.manage().window().maximize();
	drivers.manage().deleteAllCookies();
	String Url=prop.getProperty("Url");
	drivers.get(Url);
	drivers.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	}


}


	

