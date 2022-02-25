package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMenthods {

	WebDriver driver;

	/**
	 * Initializing driver with chrome
	 * 
	 * @return driver
	 */
	public static WebDriver getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	/**
	 * lauching application
	 * 
	 * @param url
	 * @param driver
	 */
	public void launchApplicationInChrome(String url, WebDriver driver) {

		driver.get(url);
	}

	/**
	 * 
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}
}
