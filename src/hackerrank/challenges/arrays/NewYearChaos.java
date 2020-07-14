package hackerrank.challenges.arrays;

// Challenge Description: 
// https://www.hackerrank.com/challenges/new-year-chaos/

public class NewYearChaos {

	static void minimumBribes(int[] q) {
		int count = 0;
		for (int i = q.length - 1; i >= 0; i--) {
			if (q[i] != (i+1)) {
				if (q[i-1] == (i+1)) {
					count++;
					swap(q, i, i-1);
				} else if (q[i-2] == (i+1)) {
					count += 2;
					swap(q, i-2, i-1);
					swap(q, i-1, i);
				} else {
					System.out.println("Too chaotic");
					return;
				}
			}
		}
		
		System.out.println(count);

    }
	
	public static void swap(int[] array, int position1, int position2) {
		int temp = array[position1];
		array[position1] = array[position2];
		array[position2] = temp;
	}
	
	public static void main(String[] args) {
		int[] q = {1, 2, 5, 3, 7, 8, 6, 4};
		minimumBribes(q);

	}

}
