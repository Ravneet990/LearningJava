package ForLoop;

import java.util.Scanner;

public class WaterTank {

	int waterTank;

	int bucket;

	boolean isWaterTankLessThanCapacity;

	Scanner sc = new Scanner(System.in);

	void checkWaterTank() {

		for (bucket = 0, waterTank = 0; waterTank <= 100; bucket += 10, waterTank += 10) {

			System.out.println("Water in the tank \n " + waterTank);

			System.out.println("Is Water in Tank less than 100");

			isWaterTankLessThanCapacity = sc.nextBoolean();

			if (isWaterTankLessThanCapacity) {

				System.out.println("Please fill more water with bucket \n");
			} else

				System.out.println("You are not allowed to fill more water");
		}

	}
}
