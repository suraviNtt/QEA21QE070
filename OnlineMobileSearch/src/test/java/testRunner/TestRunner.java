package testRunner;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import utilities.AlertHandler;
import utilities.CommonMethods;
import utilities.PropertiesReader;
import utilities.WebBrowserHelper;

public class TestRunner {

	public static void main(String[] args) throws IOException {
		
		PropertiesReader prop = new PropertiesReader();
		String browserName = prop.getBrowserName();
		WebDriver driver = WebBrowserHelper.configdriver(browserName);
		
		AlertHandler alertHandler = new AlertHandler(driver);
		CommonMethods commonMethods = new CommonMethods(driver);
		
		String url = prop.getApplicationUrl();
		commonMethods.launchApplication(url);
		
		/*
		 * Test Steps
		 * .
		 * .
		 * .
		 */
		
		commonMethods.closeBrowser();
		
		
	}
}
