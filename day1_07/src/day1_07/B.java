package day1_07;

public class B implements InterfaceExample {

	public static void main(String[] args) {
		try {
			A.main(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		A a = new A();
		a.test();
		
	}

	@Override
	public void test1(int a) {
		// TODO Auto-generated method stub
		
	}
}
