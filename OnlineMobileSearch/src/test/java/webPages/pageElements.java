package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonMethods;

public class pageElements {

	private WebDriver driver;
	private CommonMethods methods;
	
	@FindBy(id = "")
	WebElement searchbox;
	
	@FindBy(name= "")
	WebElement nameElement;
	
	@FindBy(xpath= "")
	WebElement xpathElement;
	
	@FindBy(name= "")
	WebElement usrID;
	
	@FindBy(xpath= "")
	WebElement pass;
	
	@FindBy(xpath = "//a[normalize-space()='SALES']")
	WebElement sales;
	
	@FindBy(xpath = "//ol[@id='loan']//li[@class='placeholder']")
	WebElement accountDropSection;
	
	@FindBy(xpath = "//iframe[@id='aswift_3']")
	WebElement pframe;
	
	@FindBy(xpath = "//iframe[@id='ad_iframe']")
	WebElement addframe;
	
	@FindBy(xpath = "//div[@id='dismiss-button']")
	WebElement dismissAdd;
	
	@FindBy(xpath = "//a[normalize-space()='Colleges']")
	WebElement collagesOption;
	
	public pageElements(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 * @param userValue
	 */
	public void enterTextInSearchBox(String userValue) {
		methods = new CommonMethods(driver);
		methods.enterValueInWebElement(searchbox, userValue);
	}
	
	/**
	 * 
	 * @param userID
	 * @param password
	 */
	public void enterUserIDandPassword(String userID , String password) {
		methods = new CommonMethods(driver);
		methods.enterValueInWebElement(usrID, userID);
		methods.enterValueInWebElement(pass, password);
	}
	
	/**
	 * 
	 */
	public void updateSalesAccount() {
		methods = new CommonMethods(driver);
		methods.dragAndDrop(sales, accountDropSection);
	}
	
	public void moveToCollages() {
		methods = new CommonMethods(driver);
		methods.clickOnWebElement(collagesOption);
	}
	/**
	 * 
	 */
	public void closeAdd() {
		methods = new CommonMethods(driver);
		methods.switchIframe(pframe);
		methods.switchIframe(addframe);
		methods.clickOnWebElement(dismissAdd);
		
		
	}
}
