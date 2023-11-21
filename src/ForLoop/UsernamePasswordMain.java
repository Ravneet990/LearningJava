package ForLoop;

import java.util.Scanner;

public class UsernamePasswordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsernamePassword usernamePassword = new UsernamePassword();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the userId");

		usernamePassword.userId = sc.next();

		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the password");

		usernamePassword.password = sc1.next();

		usernamePassword.checkUserIdPassword();

	}

}
