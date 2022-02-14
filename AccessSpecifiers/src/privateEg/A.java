package privateEg;

public class A {

	public int i = 10;
	
	public void test() {
		System.out.println("P Test");
	}
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.i);
		a.test();
	}
	
	
	private int sum(int i , int j) {
		return i+j;
	}
}
