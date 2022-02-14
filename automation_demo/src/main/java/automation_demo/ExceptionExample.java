package automation_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("bla bla bla");
//		int i = 10/0;
			FileInputStream f = new FileInputStream("");
		
		try {
			int i=10/0;
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("bla bla bla 2");
	}
}
