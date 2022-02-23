package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {

	private WebDriver driver;

	public CommonMethods(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * 
	 * @param url
	 */
	public void launchApplication(String url) {
		driver.get(url);
	}

	/**
	 * 
	 */
	public void closeBrowerWindow() {
		driver.close();
	}

	/**
	 * 
	 */
	public void closeBrowser() {
		driver.quit();
	}

	/**
	 * 
	 * @param element
	 * @param valueToBeSend
	 */
	public void enterValueInWebElement(WebElement element, String valueToBeSend) {
		try {
			element.sendKeys(valueToBeSend);
			System.out.println("Enter the element value successfully ");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Not able to eneter the text");
		}
	}
}
