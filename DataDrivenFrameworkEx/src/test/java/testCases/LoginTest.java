package testCases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Command;

import dataProvider.PropertiesReader;
import pages.HomePage;
import utility.BrowserSetup;
import utility.CommonMethods;

public class LoginTest {
	
	static WebDriver driver;
	HomePage homePage;
	
	@BeforeEach
	public void getApplicationLaunched() {
		
		BrowserSetup bs = new BrowserSetup();
		driver = bs.getDriver();
		
		driver.manage().window().maximize();
		PropertiesReader p = new PropertiesReader();
		String url = p.getUrl();
		
		driver.get(url);
		
//		HomePage homePage = new HomePage(driver);
//		
//		homePage.accountCreationButtonClick();
		
		
		
	}
	
	@Tag("Rgression")
	@Test
	public void loginWithValidInputs() {
		homePage = new HomePage(driver);
		homePage.accountCreationButtonClick();
	}
	
   @AfterEach
   public void tearDown() {
	   driver.quit();
   }

}
