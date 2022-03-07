package utility;

import org.openqa.selenium.WebDriver;

import dataProvider.PropertiesReader;

public class CommonMethods {

	public void getUrl (WebDriver driver) {
		PropertiesReader p = new PropertiesReader();
		driver.get(p.getUrl());
	}

}
