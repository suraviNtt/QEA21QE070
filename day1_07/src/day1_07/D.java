package day1_07;

public class D {

	public static void main(String[] args) {
		int balance = 5000;
		int amount = 2000;
		if(amount > balance) {
			try {
				throw new InsufficientBalance();
			}catch(InsufficientBalance e) {
				System.out.println(e);
			}
		}else {
			System.out.println("Please collect cash");
		}
	}
}
