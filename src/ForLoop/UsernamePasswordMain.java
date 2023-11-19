package ForLoop;

import java.util.Scanner;

public class UsernamePasswordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		UsernamePassword usernamePassword = new UsernamePassword();
		
		 Scanner stringScanner = new Scanner(System.in);

		System.out.println("Enter the userId");

		String userId = stringScanner.next();
		

		 Scanner stringScanner1 = new Scanner(System.in);

			System.out.println("Enter the password");

			String password = stringScanner1.next();

		usernamePassword.checkUserIdPassword();
		
	}

}
