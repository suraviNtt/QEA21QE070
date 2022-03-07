package actionsExample;

import org.openqa.selenium.WebDriver;

import helpers.CommonMenthods;

public class ActionEg {

	public static void main(String[] args) {
		WebDriver driver = CommonMenthods.getChromeDriver();
		driver.get("https://www.amazon.in/");
	}
}
