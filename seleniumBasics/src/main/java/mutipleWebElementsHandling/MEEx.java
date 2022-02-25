package mutipleWebElementsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import helpers.CommonMenthods;

public class MEEx {
	
//	@FindBy(xpath = "(//div[@id='nav-tools']//a[2]//span)[2]")
//	WebElement accountAndList;
	
//	@FindBy(xpath = "//div[@id='nav-al-wishlist']//a")
//	List<WebElement> accountAndList;

	public static void main(String[] args) {
		WebDriver driver = CommonMenthods.getChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		WebElement accountAndList = driver.findElement(By.xpath("(//div[@id='nav-tools']//a[2]//span)[2]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(accountAndList).build().perform();
		
		
		List<WebElement> wishlistItems = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']//a"));
		int i = wishlistItems.size();
		
		for( WebElement element : wishlistItems) {
			String linkName = element.getText();
			System.out.println(linkName);
		}
		
		if(i == 5) {
			System.out.println("Similar as exepected");
		}else {
			System.out.println("Results Not as expected ");
		}
		
		driver.quit();
	}
}
