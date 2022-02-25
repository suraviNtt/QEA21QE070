package seleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindowsEx {

static String url = "https://phptravels.com/demo/";
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.linkText("Login")).click();
		String paraentW = driver.getWindowHandle();
		Set<String> windowS =  driver.getWindowHandles();
		for(String s : windowS) {
			if(s != paraentW)
				driver.switchTo().window(s);
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//closes the window
//		driver.close();
		driver.switchTo().window(paraentW);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
//		driver.close();
		//closes the browser
		driver.quit();
	}
}
