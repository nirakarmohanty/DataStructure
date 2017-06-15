package com.src.nirakar.ds.linkedlist.single.node;

/**
 * 
 * Consider I have a Linked List such as 1---->12--->13--->10---->null
 * 
 * @author NIRAKAR
 * 
 */
public class LinkedListExample {

	private Node head;

	public LinkedListExample() {

	}

	// Display all the elements in the listNode
	// Always Head Node pass as argument while iterating the node
	public void display(Node listNode) {
		if (listNode == null)
			return;
		Node currentNode = listNode;

		while (currentNode != null) {
			System.out.print(currentNode.data + " ----- > ");
			currentNode = currentNode.link;
		}
		System.out.print(currentNode +"\n");
	}

	// To calculate the length of the LinkedList
	public int length(Node listNode) {
		if (listNode == null)
			return 0;
		int length = 0;
		Node currentNode = listNode;
		while (currentNode != null) {
			length = length + 1;
			currentNode = currentNode.link;
		}

		return length;
	}

	// Insert new Node to the Head .
	// Create a New Node , point to the head and then the new node will be Head
	public Node insertNodeAtBegining(int data, Node head) {
		Node newNode = new Node(data);
		newNode.link = head;
		head = newNode;
		return head;
	}
	
	//Insert A new Node at the last of the Linked List
	
	public Node insertNodeAtTheEnd(int data,Node head){
		//Prepare a new Node
		Node newNode = new Node(data);
		//Hold the head node by a current node
		Node currentNode = head;
		//Iterate one by one 
		while(currentNode.link!=null){
			currentNode=currentNode.link;
		}
		currentNode.link=newNode;
		
		return head;
		
	}
	//Here the node has to be inserted after a given node .
	// let say that given Node is Previuos Node 
	public void insertANewNodeAfterSomeGivenNode(int data,Node previous){
		
		Node newNode = new Node(data);
		// Here need to switch the link between previous to new node
		newNode.link=previous.link;
		// now link the previuos node with the new Node
		previous.link=newNode;
		
	}
	// Need to delete the first Node i.e. Head 
	public Node deleteFirstNode(Node head){
		// Hold the head node to a temp Node , link the temp node to next node 
		Node nodeToBeDeleted = head;
		head= nodeToBeDeleted.link;
		//then refer to null value of temp node  
		nodeToBeDeleted.link=null;
		
		return head;
		
	}
	//Delete the last node of the linked list
	public Node deleteEndNode(Node head){
		Node previous =null;
		Node currentNode = head;
		while(currentNode.link!= null){
			previous=currentNode;
			currentNode=currentNode.link;
		}
		if(previous!=null)
		{
			previous.link=null;
		}
		
		return head;
	}
	//Search a specific Data from the Linked list
	public boolean searchADataFromALinkedList(int data,Node head){
		//Hold the current Node to Head
		Node currentNode = head;
		//Iterate one-by-one and check if the search data is equal the current data value 
		while(currentNode.link!=null){
			if(currentNode.data==data){
				return true;//return TRUE
			}
			currentNode=currentNode.link;
			
		}
		return false;//ELSE FLASE value
	}
	
	public static void main(String[] args) {

		Node head = new Node(1);
		Node first = new Node(12);
		Node second = new Node(13);
		Node third = new Node(10);

		head.link = first; // 1---->12
		first.link = second; // 1--->12--->13
		second.link = third;// 1--->12--->13-->10

		LinkedListExample linkedList = new LinkedListExample();
		linkedList.display(head);

		System.out.println("\n" + "Length of the Linked List : " + linkedList.length(head));

		Node newNode = linkedList.insertNodeAtBegining(99, head);
		linkedList.display(newNode);
		System.out.print( " ----------------------- " + "\n");
		
		Node newNodeLast = linkedList.insertNodeAtTheEnd(98, head);		
		linkedList.display(newNodeLast);
		
		linkedList.insertANewNodeAfterSomeGivenNode(31, first);
		linkedList.display(head);
		
		//Link headAfterNodeDeleted = linkedList.deleteFirstNode(head);
		//linkedList.display(headAfterNodeDeleted);
		System.out.println("Printing after deleting end node");
		Node headAfterEndNodeDeleted = linkedList.deleteEndNode(head);
		linkedList.display(headAfterEndNodeDeleted);
		
		System.out.println(linkedList.searchADataFromALinkedList(125, head));
	}

}
