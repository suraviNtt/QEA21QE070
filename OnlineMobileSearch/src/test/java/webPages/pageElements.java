package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.CommonMethods;

public class pageElements {

	private WebDriver driver;
	private CommonMethods methods;
	
	public pageElements(WebDriver driver){
		this.driver = driver;
	}
	
	
	@FindBy(id = "")
	WebElement searchbox;
	
	@FindBy(name= "")
	WebElement nameElement;
	
	@FindBy(xpath= "")
	WebElement xpathElement;
	
	public void enterTextInSearchBox(String userValue) {
		methods = new CommonMethods(driver);
		methods.enterValueInWebElement(searchbox, userValue);
	}
	
}
