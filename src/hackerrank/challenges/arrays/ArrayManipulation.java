package hackerrank.challenges.arrays;

public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {
   		
    	long[] array = new long[n+1];
        long max = 0;
        	       	
        for (int i = 0; i < queries.length; i++) {
        	int a = queries[i][0]; 
        	int b = queries[i][1];
        	int k = queries[i][2];
        	array[a - 1] += k;
        	array[b] -= k;
        }
        	
        for (int i = 1; i < n+1; i++) {
        	array[i] += array[i-1];
        	if (array[i] > max) {
        		max = array[i];
        	}
        }
        	
        return max;
    }

	public static void main(String[] args) {
		int[][] queries = { 
				{2, 6, 8},
				{3, 5, 7},
				{1, 8, 1},
				{5, 9, 15},
				}; 
		
		long expectedResult = 31;
				
		long result = arrayManipulation(10, queries);
		
		System.out.println(result == expectedResult);
	}
}
