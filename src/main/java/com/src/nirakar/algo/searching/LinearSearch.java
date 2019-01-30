package com.src.nirakar.algo.searching;

/**
 * This class can be used to give example of Linear Search
 * 
 * @author NIRAKAR
 *
 */

public class LinearSearch {

	public int linearSearch(int[] array, int number) {
		int result = -1;
		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {
				result = number;
			}
		}
		return result;
	}

}
