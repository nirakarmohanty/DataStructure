package com.src.nirakar.ds.linkedlist.single.node;

public class DressStoreManager {
	private DressNode store;

	public DressStoreManager(String dress) {
		// 1. Null check - IllegalArgumentException
		if (dress == null)
			throw new IllegalArgumentException("Dress list cannt be Null");

		// 2. Split toys String to Individually and Identify each toy name and price
		String[] splitsDresses = dress.split(" ");
		for (int i = 0; i < splitsDresses.length; i++) {
			String[] individualDressData = splitsDresses[i].split("-");
			String dressName = individualDressData[0];
			double dressPrice = (individualDressData[1] != null ? Double.parseDouble(individualDressData[1])
					: Double.MIN_VALUE);

			insertIntoLinkedList(dressName, dressPrice);
		}
		// 3. Call findToy() to identify if the To is present or not

		// 4. If present - Increment the toy count as +1 otherwise put it as 0 in Toy
		// count
	}

	private void insertIntoLinkedList(String dressName, double dressPrice) {

		if (store == null) {
			store = new DressNode(dressName, dressPrice, 1, null);
		} else {
			DressNode nodePresent = findDress(dressName);
			if (nodePresent != null) {
				nodePresent.setCount(nodePresent.getCount() + 1);
			} else {
				DressNode node = new DressNode(dressName, dressPrice, 1, null);
				node.setNext(store);
				store = node;
			}
		}
	}

	private DressNode findDress(String toyName) {
		// Iterate the LinkedList and if the Node present return
		DressNode tempNode = store;
		while (tempNode != null) {
			if (tempNode.getName().equalsIgnoreCase(toyName)) {
				return tempNode;
			} else {
				tempNode = tempNode.getNext();
			}
		}
		return null;
	}

	public String getMostFrequentDress() {
		DressNode temp = store;
		int maxNoOfUsedDress = 0;
		String dressname = "";
		while (temp != null) {
			
			//System.out.println(temp.toString());
			if (temp != null && temp.getCount() > maxNoOfUsedDress) {
				maxNoOfUsedDress = temp.getCount();
				dressname = temp.getName();
			}
			temp = temp.getNext();
		}
		return dressname;
	}

	@Override
	public String toString() {
		
		String value = "[";
		DressNode temp = store;
		while (temp != null) {
			value = value + " Toy :" + temp.getName() + " Price:" + temp.getPrice() + "=" + temp.getCount();
			temp = temp.getNext();
		}
		return value + "]";
	}
}
