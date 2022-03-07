package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataProvider.PropertiesReader;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserSetup {
	
	/*
	 * Method initializing your browser type	
	 */
	public WebDriver getDriver() {
		WebDriver driver = null;
		PropertiesReader pR = new PropertiesReader();
		String browser = pR.getBrowser();
		System.out.println(browser);
		if(browser.equals("chrome")) {
			return launchingChromeDriver(driver);
		}
		else {
			return launchingFireFoxDriver(driver);
		}
	}
	
	/*
	 * setingUp driver
	 */
	public void driverSetupForLocalSystem(WebDriver driver) {
		PropertiesReader pr = new PropertiesReader();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(pr.getImplicitWait(), TimeUnit.SECONDS);
	}
	
	/*
	 * Chrome Launcher
	 */
	public WebDriver launchingChromeDriver(WebDriver driver) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebDriver launchingFireFoxDriver(WebDriver driver) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		return driver;
	}
	
	public void getApplicationURL(WebDriver driver) {
		PropertiesReader pR = new PropertiesReader();
		String url = pR.getUrl();
		driver.get(url);
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	
	public void closeBrowserWindow(WebDriver driver) {
		driver.close();
	}

	

}
