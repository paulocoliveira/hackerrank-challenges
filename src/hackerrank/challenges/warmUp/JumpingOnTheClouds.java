package hackerrank.challenges.warmUp;

// Challenge Description: 
// https://www.hackerrank.com/challenges/jumping-on-the-clouds/

public class JumpingOnTheClouds {
	
	static int jumpingOnClouds(int[] c) {
		
		int i = 2;
		int steps = 0;
		
		while (i < c.length) {
			if(c[i] == 0) {
				i += 2;
			}else {
				i += 1;
			}
			steps++;
		}
		
		if (i == c.length) {
			steps++;
		}
		
		return steps;

    }
	
	public static void main(String[] args) {
		int[] c = {0, 0};
		int expectedResult = 1;
		int result = jumpingOnClouds(c);
		System.out.println(result == expectedResult);
	}

}
