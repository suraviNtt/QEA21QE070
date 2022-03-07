package testCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//@Tag ("Regressing")
@DisplayName("Our Test Class")
@TestInstance(Lifecycle.PER_CLASS)
public class DemoTest {
	
	@BeforeAll
	public void testBA() {
		System.out.println("BA");
	}
	
	@BeforeEach
	public void before_test() {
		System.out.println("Before Test");
	}

	@AfterEach
	public void after_test() {
		System.out.println("After Test");
	}

	
	@Tag("Rgression")
	@Test
	public void loginTest() {
		System.out.println("Test");
	}
	
	@Tag("Sanity")
	@Test
	public void test1() {
		System.out.println("Test1");
		int i = 10/0;
		System.out.println(i);
	}
	
	@Tag("Sanity")
	@Test
	public void test2() {
		System.out.println("Test2");
		int expected_value = 200; int actual_value = 100;
		assertEquals(expected_value, actual_value);
	}
	
	@RepeatedTest(value = 5)
	public void test4() {
		System.out.println("Test4");
	}
	
	@ParameterizedTest
	@ValueSource(ints = {10 , 20 ,100 , 50})
	@Disabled
	public void test3(int n) {
		System.out.println("Test3");
		int expected_value = n; int actual_value = 100;
		assertEquals(expected_value, actual_value);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Hello" , "Selenium" ,"java" , "junit"})
	@DisplayName("Parameterized Test Example")
	public void test3(String s) {
		System.out.println("Test3");
		assertTrue(s.contains("j"));
	}
	
	@AfterAll
	public void test_AA() {
		System.out.println("AA");
	}
	
	
	
}
