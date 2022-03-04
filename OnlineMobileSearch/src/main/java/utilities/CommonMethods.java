package utilities;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

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

	/**
	 * taking visible window screenshoot
	 * 
	 * @param driver
	 * @param fileLocation
	 * @throws IOException
	 */
	public void takescreenShot(String fileLocation) throws IOException {

		File screenShoot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(fileLocation);
		FileUtils.copyFile(screenShoot, dest);
	}

	/**
	 * taking full page screenshoot
	 * 
	 * @param driver
	 * @param fileLocation
	 * @throws IOException
	 */
	public void takeFullScreenShot(String fileLocation) throws IOException {

		Screenshot shot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(shot.getImage(), "PNG", new File(fileLocation));
	}
	
	/**
	 * 
	 * @param src
	 * @param dst
	 */
	public void dragAndDrop( WebElement src , WebElement dst) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dst).build().perform();
	}
	
	/**
	 * 
	 * @param element
	 */
	public void switchIframe(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/**
	 * 
	 * @param element
	 */
	public void clickOnWebElement(WebElement element) {
		try {
			element.click();
			System.out.println(" element clicked successfully ");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Not able to click element");
		}
	}
}
