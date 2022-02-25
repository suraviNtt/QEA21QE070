package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PHPDemo {

	static String url = "https://openbooks.com/users/sign-in";
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		
//		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("xxxxxx");
//		driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[1]")).click();
		driver.findElement(By.xpath("//button")).click();
		
		WebElement errormsg = driver.findElement(By.xpath("//*[@class='messages']//div/button/.."));
		String msg = errormsg.getText();
		if(msg.contains("Invalid email or password")) {
			System.out.println("verification success");
		}
		else {
			System.out.println("Defect found, not working as required");
		}
		
		driver.getCurrentUrl();
		driver.getTitle();
		}
}
