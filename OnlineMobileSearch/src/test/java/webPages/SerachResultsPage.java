package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SerachResultsPage {


	private WebDriver driver;
	
	public SerachResultsPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(id = "")
	WebElement searchResultOutput;
	
}
