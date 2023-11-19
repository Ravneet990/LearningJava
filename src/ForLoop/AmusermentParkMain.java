package ForLoop;

import java.util.Scanner;

public class AmusermentParkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmusementPark amusementPark = new AmusementPark();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the height");

		amusementPark.height = sc.nextInt();

		amusementPark.printAllowedPeople();

	}

}
