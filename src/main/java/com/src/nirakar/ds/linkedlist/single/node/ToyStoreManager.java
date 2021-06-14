package com.src.nirakar.ds.linkedlist.single.node;

public class ToyStoreManager {
	private ToyNode store;

	public ToyStoreManager(String toys) {
		// 1. Null check - IllegalArgumentException
		if (toys == null)
			throw new IllegalArgumentException("Toys list cannt be Null");

		// 2. Split toys String to Individually and Identify each toy name and price
		String[] splitsToys = toys.split(" ");
		for (int i = 0; i < splitsToys.length; i++) {
			String[] individualToyData = splitsToys[i].split("-");
			String toyName = individualToyData[0];
			double toyPrice = (individualToyData[1] != null ? Double.parseDouble(individualToyData[1])
					: Double.MIN_VALUE);

			insertIntoLinkedList(toyName, toyPrice);
		}
		// 3. Call findToy() to identify if the To is present or not

		// 4. If present - Increment the toy count as +1 otherwise put it as 0 in Toy
		// count
	}

	private void insertIntoLinkedList(String toyName, double toyPrice) {

		if (store == null) {
			store = new ToyNode(toyName, toyPrice, 1, null);
		} else {
			ToyNode nodePresent = findToy(toyName);
			if (nodePresent != null) {
				nodePresent.setCount(nodePresent.getCount() + 1);
			} else {
				ToyNode node = new ToyNode(toyName, toyPrice, 1, null);
				node.setNext(store);
				store = node;
			}
		}
	}

	private ToyNode findToy(String toyName) {
		// Iterate the LinkedList and if the Node present return
		ToyNode tempNode = store;
		while (tempNode != null) {
			if (tempNode.getName().equalsIgnoreCase(toyName)) {
				return tempNode;
			} else {
				tempNode = tempNode.getNext();
			}
		}
		return null;
	}

	public String getMostFrequentToy() {
		ToyNode temp = store;
		int maxNoOfUsedToy = 0;
		String nameIOfToy = "";
		while (temp != null) {
			
			//System.out.println(temp.toString());
			if (temp != null && temp.getCount() > maxNoOfUsedToy) {
				maxNoOfUsedToy = temp.getCount();
				nameIOfToy = temp.getName();
			}
			temp = temp.getNext();
		}
		return nameIOfToy;
	}

	@Override
	public String toString() {
		// Implement toString
		// [Toy :Jenga Price:15.99=3, Toy :Slinky Price:3.99=1, Toy :Barbie
		// Price:9.99=2, Toy :Baseball Price:5.99=2]
		String value = "[";
		ToyNode temp = store;
		while (temp != null) {
			value = value + " Toy :" + temp.getName() + " Price:" + temp.getPrice() + "=" + temp.getCount();
			temp = temp.getNext();
		}
		return value + "]";
	}
}
