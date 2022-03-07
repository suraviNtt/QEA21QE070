package mutipleWebElementsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.CommonMenthods;

public class AutoPopulatedSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = CommonMenthods.getChromeDriver();
		driver.get("https://www.amazon.in/");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		WebElement serchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		serchbox.sendKeys("selenium");
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.pollingEvery(Duration.ofMillis(10));
		
		wait.ignoring(NoSuchElementException.class);
	
		
		//Fluent Wait
		Wait<WebDriver> waitF = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMinutes(10)).ignoring(NoSuchElementException.class);
	
//		Thread.sleep(850);
//		WebElement autoSearchFirstElement = driver.findElement(By.xpath(
//				"//body/div[@id='a-page']/header[@id='navbar-main']/div[@id='navbar']/div[@id='nav-flyout-iss-anchor']/div[@id='nav-flyout-searchAjax']/div[@class='autocomplete-results-container']/div[1]/div[1]"));

		WebElement searchRes = driver.findElement(By.xpath("(//div[@class='autocomplete-results-container']//div[text()=\"selenium\"])[1]"));
		if (wait.until(ExpectedConditions.visibilityOf(searchRes)) != null) {
//			if(serchbox.getText().equals("selenium"))
		//	autoSearchFirstElement.click();
			searchRes.click();
		}

//		Actions action = new Actions(driver);
//		action.moveToElement(autoSearchFirstElement).build().perform();

//		String s = Keys.chord(Keys.ARROW_DOWN , Keys.ENTER);
//		serchbox.sendKeys(s);
//		driver.close();
	}
}
