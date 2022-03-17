package testRunner;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import readers.ExcelReader;

public class RegistrationTest {
	
	@DataProvider(name = "validRegfields")
	public Object[][] successRegistrationFieldsData() throws IOException {
		
//		Object[][] data = ExcelReader.dataExcelReader("validUserCreds");
		return new Object[][] {{"username", "lastn" , "city" , "location" },{"Test" , "password123" , "city" , "location"}};
	}
	
	
	@Test(dataProvider = "validRegfields")
	public void validFormDetailsRegistration(String firstnanme , String lastname , String city , String location) {
		System.out.println("username : "+firstnanme);
		System.out.println("password : "+lastname);
		System.out.println("username : "+city);
		System.out.println("password : "+location);
	}

}
