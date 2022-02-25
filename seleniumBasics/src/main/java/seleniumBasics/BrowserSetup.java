package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	public static void main(String[] args) {
		
		//find chrome.exe in your system
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//EDGE
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		WebElement serachbar = driver.findElement(By.name("q"));
		serachbar.sendKeys("Selenium Book");
		serachbar.sendKeys(Keys.ENTER);
		
		driver.close();
	}
}
