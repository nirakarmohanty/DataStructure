package com.src.nirakar.algo.searching;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLinearSearch {

	int[] array = new int[]{1,2,3,4,9,6,7,8};
	LinearSearch linearSearch = new LinearSearch();
	@Test
	public void test_FindElementIfFirstPosition(){
		int index=linearSearch.linearSearch(array,1);
		assertEquals(1,index);
	}
	
	@Test
	public void test_FindElementIfLastPosition(){
		int index=linearSearch.linearSearch(array,8);
		assertEquals(8,index);
	}
	@Test
	public void test_FindElementIfNotPresent(){
		int index=linearSearch.linearSearch(array,80);
		assertEquals(-1,index);
	}
}
