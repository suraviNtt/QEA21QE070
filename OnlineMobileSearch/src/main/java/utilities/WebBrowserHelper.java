package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebBrowserHelper {

	/**\
	 * Returning webdriver setup for firefox and chrome
	 * @param driverName
	 * @return
	 */
	public static WebDriver configdriver(String driverName) {
		String driverN = driverName.toUpperCase();
		WebDriver driver = null;
		switch (driverN) {
		case "FIREFOX" :
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
			
		case "CHROME" :
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;

		default:
			break;
		}
		return driver;
	}
	
	
}
