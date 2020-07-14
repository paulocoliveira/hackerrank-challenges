package hackerrank.challenges.warmUp;

// Challenge Description: 
// https://www.hackerrank.com/challenges/counting-valleys/

public class CountingValleys {

	static int countingValleys(int n, String s) {

		int up = 0;
		int down = 0;
		int sum = 0;
		boolean startValley = false;
		int valleys = 0;
		
		char[] steps = s.toCharArray();
		
		for (char step: steps) {
			if (step == 'U') {
				up++;
			}else {
				down--;
			}
			
			sum = up + down;
			
			if (sum == -1) {
				startValley = true;
			}else if (sum == 0 && startValley){
				if (startValley) {
					valleys++;
				}
				up = 0;
				down = 0;
				startValley = false;
			}
		}
		
		return valleys;
	}
	
	public static void main(String[] args) {
		int n = 8;
		String s = "UDDDUDUU";
    	int expectedResult = 1;
		int result = countingValleys(n, s);
		
    	System.out.println(result == expectedResult);

	}

}
