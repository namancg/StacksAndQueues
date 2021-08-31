package com.bridgelabz.stacksandqueues;
import com.bridgelabz.linkedlists.*;
public class Queue <K>{
private final LinkedListImpl queueLinkedList;
	
	public Queue() {
		queueLinkedList = new LinkedListImpl();
	}
	public void enqueue(INode element) {
		queueLinkedList.append(element);
	}
	public void printQueue() {
		queueLinkedList.printLinkedList();
	}
}
