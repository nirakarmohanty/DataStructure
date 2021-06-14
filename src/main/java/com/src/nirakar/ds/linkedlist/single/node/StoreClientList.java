package com.src.nirakar.ds.linkedlist.single.node;

public class StoreClientList {

	public static void main(String[] args) {
		String toys = "Baseball-5.99 SoccerBall-2.99 Barbie-9.99 Barbie-9.99 Slinky-3.99 Jenga-15.99 Baseball-5.99 Jenga-15.99 Jenga-9.99";
		//String toys = "Baseball-5.99 SoccerBall-2.99 Barbie-9.99 Barbie-9.99 ";
		ToyStoreManager toyStoreManager = new ToyStoreManager(toys);
		System.out.println(toyStoreManager);        
		System.out.println();        
		System.out.println("Toy most frequently bought: " + toyStoreManager.getMostFrequentToy());        
		System.out.println();    

	}

}
