package hackerrank.challenges.arrays;

// Challenge Description: 
// https://www.hackerrank.com/challenges/ctci-array-left-rotation/

import java.util.Arrays;

public class LeftRotation {

	static int[] rotLeft(int[] a, int d) {
		
		int[] temp = new int[d];
		int[] my_array = a;
		
		for (int i = 0; i < d; i++) {
			temp[i] = a[i];
		}
		
		for (int j = d; j < a.length; j++) {
			my_array[j-d] = a[j];
		}
		
		for (int k = 0; k < temp.length; k++) {
			my_array[a.length-d+k] = temp[k];
		}
		
        return my_array;

    }
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int d = 4;
		
		int[] expectedResult = {5, 1, 2, 3, 4};
		int[] result = rotLeft(a, d);
		System.out.println(Arrays.equals(result, expectedResult));

	}

}
