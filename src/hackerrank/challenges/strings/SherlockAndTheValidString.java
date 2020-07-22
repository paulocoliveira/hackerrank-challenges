package hackerrank.challenges.strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class SherlockAndTheValidString {

    static String isValid(String s) {

    	int[] a_frequencies = new int[26];
    	
    	for (int i = 0; i < s.length(); i++) {
    		int position = s.charAt(i) - 'a';
    		a_frequencies[position]++;
    	}

    	HashMap<Integer, Integer> frequency_map = new HashMap<Integer, Integer>();
    	
    	for (int frequency: a_frequencies) {
    		if (frequency != 0) {
    			if (!frequency_map.containsKey(frequency)) {
        			frequency_map.put(frequency, 1);
        		}else {
        			frequency_map.put(frequency, frequency_map.get(frequency) + 1);
        		}	
    		}
    	}
    	
    	int minimumKey = Collections.min(frequency_map.keySet());
    	int maximumKey = Collections.max(frequency_map.keySet());
    	int minimumKeyValue = frequency_map.get(minimumKey);
    	int maximumKeyValue = frequency_map.get(maximumKey);    	
    	
    	if (frequency_map.size() > 2) {
    		return "NO";
    	}else if (frequency_map.size() == 1) {
    		return "YES";
    	}else if (Math.abs(maximumKey - minimumKey) == 1 && (minimumKeyValue == 1 || maximumKeyValue == 1)) {
    		return "YES";
    	}else if (Math.abs(maximumKey - minimumKey) > 1 && (minimumKey == 1 && minimumKeyValue == 1)) {
    		return "YES";
    	}else {
    		return "NO";
    	}
    }
	
	public static void main(String[] args) {
		String s = "ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd";
		String expectedResult = "YES";
		String result = isValid(s);
		
    	System.out.println(result.equals(expectedResult));
	}

}
