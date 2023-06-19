package StepsForHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriveManager {
	
	
	public static final String projectPath= System.getProperty("user.dir");
	public static WebDriver driver;		
		
		public static WebDriver getDriver() {
		
			if(driver==null){
				
				System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
				
				driver= new ChromeDriver();
			
		}
			
			
			return driver;
	
		
	}
	
}
