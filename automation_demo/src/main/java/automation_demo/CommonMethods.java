package automation_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//Find chrome.exe file and execute
		WebDriverManager.chromedriver().setup();
		//driver instance for chrome
		WebDriver driver = new ChromeDriver();
		//get web application 
		driver.get("https://phptravels.com/demo/");

		WebElement searchbar = driver.findElement(By.id("icon"));
		searchbar.click();
		driver.findElement(By.className("BS-footer")).isDisplayed();
		
		
		//send text to element
//		searchbar.sendKeys("selenium");
		
		 driver.findElement(By.linkText("Demo")).click();
		
		 Thread.sleep(200);
		 List<WebElement> linksAvailable = driver.findElements(By.xpath("//a"));
		 int size = linksAvailable.size();
		 
		 System.out.println("Total no of links available = "+size);
		
		driver.close();
	}
}
