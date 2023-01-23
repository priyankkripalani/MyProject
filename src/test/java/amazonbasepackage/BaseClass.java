package amazonbasepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
	

	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	
	
	//Step 1: Read config.properties by giving path
	
	public BaseClass() {
		try {
			FileInputStream file=new FileInputStream("C:\\Users\\priya\\eclipse-workspace\\AmazonProject\\src\\test\\java\\environmentvariables\\Config.properties");
			prop.load(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();	
		}
		catch (IOException a) {
			a.printStackTrace();
		}
	
	}
	
	//step 2 commands that will be used in child classes
	
		public static void initiation()   {
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
			driver=new FirefoxDriver();}
		
		else if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
		
		}
}
