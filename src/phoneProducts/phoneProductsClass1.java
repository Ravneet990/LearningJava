package phoneProducts;

import java.util.Arrays;
import java.util.Scanner;


public class phoneProductsClass1 {

	String[] Samsung = { "S20", "S21", "Flip3", "Folid3" };

	String[] Google = { "Google Pixel6", "Google Pixel 6 Pro", "Google Pixel 5" };

	String[] Apple = { "Iphone 12", "Iphone SE", "Iphone 15", "Iphone13" };

	Scanner sc = new Scanner(System.in);

	Scanner sc1 = new Scanner(System.in);

	void printBrandlist() {

		System.out.println("Select the brand 'Samsung', 'Google' or 'Apple'");
		String item = sc.next();

		if (item.equals("Samsung")) {

			System.out.println("Products available are:" + Arrays.toString(Samsung));

		} else if (item.equals("Google")) {
			System.out.println("Products available are" + Arrays.toString(Google));

		} else {
			System.out.println("Products available are" + Arrays.toString(Apple));
		}

	}

	void selectProduct() {
		
		System.out.println("Enter one product name");
		
		String item2 = sc1.next();
		
		boolean itemFound = false;
		

		// Iterate over the array
		for (int i = 0; i < Samsung.length; i++)
			for (int j = 0; j < Google.length; j++)
				for (int k = 0; k < Apple.length; k++) {

			if (Samsung[i].equals(item2) || Google[i].equals(item2) || Apple[i].equals(item2)) {

				itemFound = true;
				break;

			} }
//			for (int j = 0; j < Samsung.length; j++ ) {
//
//				if (Google[j].equals(item2)) {
//
//					itemFound = true;
//					break;
//
//				} }
//				for (int k = 0; k < Apple.length; k++ ) {
//
//					if (Apple[k].equals(item2)) {
//
//						itemFound = true;
//						break;
//
//					}
//
//		}

		if (itemFound) {
			System.out.println("Found the item : " + item2 + " in the product list");
		} else {
			System.out.println("Item not found in the product list");
		}

		
	}

}
