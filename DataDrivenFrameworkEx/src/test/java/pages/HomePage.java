package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utility.CommonMethods;

public class HomePage extends CommonMethods{
	
//	String loginButton = "";
//	
//	public WebElement getLoginbutton(WebDriver driver) {
//		return driver.findElement(By.xpath(loginButton));c
//	}
	
	
//	@FindBy(how=How.CLASS_NAME , using = "")
//	WebElement loginButton;
//
	WebDriver driver;
	
	@FindBy(xpath ="//label[normalize-space()='Login with Phone/Email']")
	WebElement login_with_PhoneOrEmail;
	
	@FindBy(xpath = "//p[normalize-space()='Login or Create Account']")
	WebElement login_or_Create_Account;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean click_login_with_PhoneOrEmail() {
		try {
		login_with_PhoneOrEmail.click();
		System.out.println("login_with_PhoneOrEmail is clicked");
		return true;
		}catch (Exception e) {
			System.out.println("login_with_PhoneOrEmail is not clicked");
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean click_login_or_Create_Account() {
		try {
			login_or_Create_Account.click();
		System.out.println("login_or_Create_Account is clicked");
		return true;
		}catch (Exception e) {
			System.out.println("login_or_Create_Account is not clicked");
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean accountCreationButtonClick() {
		if(click_login_or_Create_Account()) {
			return true;
		}else if(click_login_with_PhoneOrEmail()) {
			return true;
		}else {
			return false;
		}
	}
	

}
