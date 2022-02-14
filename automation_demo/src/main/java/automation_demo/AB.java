package automation_demo;

public class AB {

	public static void main(String[] args) {
		int amount = 50000;
		int balance = 10000;
		if(amount > balance) {
			try {
				throw new InsufficientBalance();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Widrawal Success !");
		}
	}
}
