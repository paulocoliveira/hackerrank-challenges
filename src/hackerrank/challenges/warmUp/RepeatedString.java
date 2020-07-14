package hackerrank.challenges.warmUp;

// Challenge Description: 
// https://www.hackerrank.com/challenges/repeated-string/

public class RepeatedString {

	static long repeatedString(String s, long n) {
		
		long baseNumberOfAs = 0;
		long numberOfAs = 0;
		long occurencies = 0;
		int remainder= 0;
		
		if (s == "" || n == 0) {
			return 0;
		}else {
			baseNumberOfAs = s.chars().filter(ch -> ch == 'a').count();
			occurencies = n / s.length();
			remainder = (int) (n % s.length());
			numberOfAs = (occurencies * baseNumberOfAs) + s.substring(0, remainder).chars().filter(ch -> ch == 'a').count();
			return numberOfAs;
		}
		
    }
	
	public static void main(String[] args) {
		String s = "a";
		long n = 1000000;
		int expectedResult = 1000000;
		long result = repeatedString(s, n);
		System.out.println(result == expectedResult);

	}

}
