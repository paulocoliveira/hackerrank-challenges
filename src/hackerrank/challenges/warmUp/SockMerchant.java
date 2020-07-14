package hackerrank.challenges.warmUp;

// Challenge Description: 
// https://www.hackerrank.com/challenges/sock-merchant/

import java.util.*;
import java.util.Map.Entry;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	HashMap<Integer, Integer> socks = new HashMap<Integer, Integer>();
    	
    	for (int number: ar) {
    		if (!socks.containsKey(number)) {
    			socks.put(number, 1);
    		}else {
    			socks.put(number, socks.get(number) + 1);
    		}
    	}
    	
    	int total = 0;
    	
    	for (int key:socks.keySet()) {
    		total += (socks.get(key) / 2);
    	}
    	
    	for (Entry<Integer, Integer> register: socks.entrySet()) {
			System.out.print(register.getKey() + " ==> ");
			System.out.println(register.getValue());
		}
    	
    	return total;
    }
    
    public static void main(String[] args) {
		int n = 9;
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
    	int expectedResult = 3;
		int result = sockMerchant(n, ar);
		    	
    	System.out.println(result == expectedResult);
	}

    
}
