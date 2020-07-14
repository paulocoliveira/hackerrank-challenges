package hackerrank.challenges.arrays;

public class MinimumSwaps2 {

    static int minimumSwaps(int[] arr) {
    	int count = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			while (arr[i] != (i+1)) {
				swap(arr, i, arr[i]-1);
				count++;
			}
		}
		
		return count;

    }
    
	public static void swap(int[] array, int position1, int position2) {
		int temp = array[position1];
		array[position1] = array[position2];
		array[position2] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 2, 4, 6, 7};
		int expectedResult = 3;
		int result = minimumSwaps(arr);
		
		System.out.println(result == expectedResult);

	}

}
