package day1_07_a;

import day1_07.A;

public class C extends A {

	public void test() {
		System.out.println("Test C");
	}
	
	public void test2() {
		System.out.println("Test2 C");
	}
	
	public void test2(int i) {
		System.out.println("Test2 C : " + i);
		
	}
	
	public static void main(String[] args) {
		
		A a1 = new A();
		a1.test();
		
		C c = new C();
		c.test();
		c.test2();
		c.test1(1);
		
		A a = new C();
		a.test();
		a.test1(1);
		
		
	}
}
