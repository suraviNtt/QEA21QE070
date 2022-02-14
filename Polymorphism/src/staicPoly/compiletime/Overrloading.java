package staicPoly.compiletime;

public class Overrloading {

	public void test() {
		System.out.println("Test ");
	}
	
	public void test(int i , int j) {
		System.out.println("Sum = "+(i+j));
	}
	
	public void test(String s) {
		System.out.println("Your name is : "+s);
	}
}
