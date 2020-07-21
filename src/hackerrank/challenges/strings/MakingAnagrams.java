package hackerrank.challenges.strings;

import java.util.HashMap;

public class MakingAnagrams {

    static int makeAnagram(String a, String b) {
    	
    	int[] a_frequencies = new int[26];
    	int[] b_frequencies = new int[26];
    	int numberOfDeletions = 0;
    	
    	for (int i = 0; i < a.length(); i++) {
    		int position = a.charAt(i) - 'a';
    		a_frequencies[position]++;
    	}
    	
    	for (int i = 0; i < b.length(); i++) {
    		int position = b.charAt(i) - 'a';
    		b_frequencies[position]++;
    	}
    	
    	for (int i = 0; i<26; i++) {
    		numberOfDeletions += Math.abs(a_frequencies[i] - b_frequencies[i]);
    	}
    	
    	return numberOfDeletions;
    	
    }
	
	public static void main(String[] args) {
		String a = "showman";
		String b = "woman";
    	int expectedResult = 2;
		int result = makeAnagram(a, b);
		
    	System.out.println(result == expectedResult);

	}

}
