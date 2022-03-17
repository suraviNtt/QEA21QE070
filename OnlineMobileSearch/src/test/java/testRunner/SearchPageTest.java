package testRunner;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import handlers.AlertHandler;
import readers.PropertiesReader;
import utilities.CommonMethods;
import utilities.WebBrowserHelper;
import webPages.pageElements;

public class SearchPageTest {

	WebDriver driver;

	AlertHandler alertHandler;
	CommonMethods commonMethods;
	pageElements homePage;

	@BeforeMethod
	public void launchApplication() throws Exception {
		PropertiesReader prop = new PropertiesReader();
		String browserName = prop.getBrowserName();
		driver = WebBrowserHelper.configdriver(browserName);
		String url = prop.getApplicationUrl();
		commonMethods = new CommonMethods(driver);
		commonMethods.launchApplication(url);
	}

	@Test(groups = "sanity")
	public void miniProjectTCs() {
		alertHandler = new AlertHandler(driver);
		commonMethods = new CommonMethods(driver);
		homePage = new pageElements(driver);
		homePage.moveToCollages();
		homePage.closeAdd();	
	}
	
	@Test(groups = "regression")
	public void verifySearchSuccessForMobilesUnder100() {
		
	}
	
	@AfterMethod
	public void teardown() {
		commonMethods.closeBrowser();
	}
}
