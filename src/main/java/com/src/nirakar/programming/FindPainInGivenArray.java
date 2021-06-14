package com.src.nirakar.programming;

import java.util.HashMap;
import java.util.Map;

/**
 * Input:
 * 
 * arr = [8, 7, 2, 5, 3, 1] sum = 10 * 
 * Output: 
 * Pair found (8, 2) or Pair found (7, 3)
 * 
 * 
 * Input:
 * 
 * arr = [5, 2, 6, 8, 1, 9] sum = 12
 * 
 * Output: Pair not found
 * 
 * @author Nirakar
 *
 */
public class FindPainInGivenArray {

	public static void main(String[] args) {
		int[] A = { 100,200,300 };
        int sum = 300;
 
        findPair(A, sum);
	}

	private static void findPair(int[] array, int sum) {
	
		Map<Integer,Integer> mapSum = new HashMap();
		int count =0;
		for(int i =0;i<array.length;i++) {
			if(array[i]% 100 ==0 ) {
				System.out.println("Pair element is : (" + array[i] );
				count = count +1;
			}
			if (mapSum.containsKey(array[i]%100)) {
				//System.out.println("Pair element is : (" + array[i] +"," + (sum-array[i])+")");
				//count=count+1;
				
			}else {
				mapSum.put(array[i], i);
			}
		}
		System.out.println(count);
	}

}
