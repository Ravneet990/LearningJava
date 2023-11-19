package ForLoop;

import java.util.Scanner;

public class AmusementPark {

	int noOfPeople;
	int height;
	
	boolean areNoOfPeopleLessThanEleven;
	
	Scanner sc = new Scanner(System.in);

	// made a function

	void printAllowedPeople() {

		// condition for height inside for loop
		
		if (height < 200 && height > 90) {
			for (noOfPeople = 0; noOfPeople < 11; noOfPeople++) {

				System.out.println("Number of people in Park \n" + noOfPeople);

				System.out.println("Are number of People less than 11");
				
				areNoOfPeopleLessThanEleven = sc.nextBoolean();
				
				if(areNoOfPeopleLessThanEleven) {
					
					System.out.println("You are allowed to take a Ride \n");
				}
				else
					break;
					
						
			}
		} else 
			System.out.println("You are not allowed to take a ride");
	}

}
