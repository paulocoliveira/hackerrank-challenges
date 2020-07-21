package hackerrank.challenges.strings;

public class AlternatingCharacters {

    static int alternatingCharacters(String s) {

    	Character temp = 'c';
    	int numberOfDeletions = 0;
    	
    	for (int i = 0; i<s.length();i++) {
    		Character current_char = s.charAt(i);
    		if (current_char == temp) {
    			numberOfDeletions++;
    		}else {
    			temp = current_char;
    		}
    	}
    	
    	return numberOfDeletions;
    }
	
	public static void main(String[] args) {
		String s = "AAABBB";

		int expectedResult = 4;
		int result = alternatingCharacters(s);
		
    	System.out.println(result == expectedResult);
	}

}
