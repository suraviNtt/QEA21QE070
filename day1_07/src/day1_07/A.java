package day1_07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A {

	int i = 20;
	static int j = 30;
	
 public void test() {
		int k = 10;
		System.out.println(i+k);
		System.out.println("Test");
	}
	
	public void test1(int i) {
		System.out.println("Test1");
	}
	
	public static void main(String[] args) throws Exception {
		
		A a = new A();
		a.test();
		System.out.println(a.i);
		System.out.println(j);
		a.test1(1);	
		
		String str = "Hello";
		str = "Hi";
		System.out.println(str);
		
		int c = a.i/0;
		System.out.println(c);
		
		

	}
}
