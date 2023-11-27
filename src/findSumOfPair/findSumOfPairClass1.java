package findSumOfPair;

import java.util.Arrays;
import java.util.Scanner;

public class findSumOfPairClass1 {
	
	int[] List = {-40, -5, 1, 3, 6, 7, 8, 20};
	
	void sumOfArray() {
		
		for (int i = 0; i< List.length; i++) {
			for (int j = i+1; j< List.length; j++ ) {
				
				if (List[i]+ List[j] == 15) {
			
					System.out.println(List[i]+ " + " +List[j]+ "= 15");
				}
			}
	}

}
}

