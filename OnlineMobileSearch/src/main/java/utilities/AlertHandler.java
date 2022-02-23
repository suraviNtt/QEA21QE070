package utilities;

import org.openqa.selenium.WebDriver;

public class AlertHandler {

	private WebDriver driver;

	public AlertHandler(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * 
	 */
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
}
