package testRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(groups = "sanity")
	public void test123() {
		System.out.println("Test1");
	}
	
	@Test(groups = "sanity")
	public void test121() {
		System.out.println("Test2");
	}
	
	@Test(groups = "regression")
	public void test120() {
		int n = 0/0;
		System.out.println("Test3 : "+n);
	}
	
	@BeforeMethod
	public void test4() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void test5() {
		System.out.println("After Method");
	}
	
	@BeforeTest
	public void test6() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void test7() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void test8() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void test9() {
		System.out.println("After Class");
	}
	
//	@BeforeGroups
//	public void test10() {
//		System.out.println("Before Gropus");
//	}
//	
//	@AfterGroups
//	public void test11() {
//		System.out.println("After Groups");
//	}
//	
//	@BeforeSuite
//	public void test12() {
//		System.out.println("Before Suite");
//	}
//	
//	@AfterSuite
//	public void test13() {
//		System.out.println("After Suite");
//	}
	
	
}
