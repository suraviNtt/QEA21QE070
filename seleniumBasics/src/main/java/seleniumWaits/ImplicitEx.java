package seleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.CommonMenthods;

public class ImplicitEx {

	public static void main(String[] args) {
		WebDriver driver = CommonMenthods.getChromeDriver();
		driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.get("https://www.makemytrip.com/");
		
		
		WebElement fromLocation = driver.findElement(By.xpath("//input[@placeholder='From']"));
		WebElement toLocation = driver.findElement(By.xpath("//input[@placeholder='To']"));
		
		
		
	}
}
