package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import helpers.CommonMenthods;

public class staticDropdownExample extends CommonMenthods {

	public static void main(String[] args) {
		
		WebDriver driver  = getChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		Select s = new Select(driver.findElement(By.name("country")));
		//s.selectByIndex(4);
		//s.selectByValue("ARUBA");
		s.selectByVisibleText("INDIA");
	}
}
