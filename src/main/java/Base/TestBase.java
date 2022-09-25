package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.readPropertyfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public void initializationimdb() throws Exception {
		
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(readPropertyfile.readPropertyFile("url1"));	
	}
	
	public void initializationwiki() throws Exception {
	
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(readPropertyfile.readPropertyFile("url2"));	
	}
}
