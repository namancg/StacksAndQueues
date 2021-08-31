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
	public INode dequeue() {
		return queueLinkedList.delete();
	}
	public int size() {
		return queueLinkedList.size();
	}
	public boolean isEmpty() {
		if(queueLinkedList.head != null) {
			return false;
		}
		else {
			return true;
		}
		
	}
	public void printQueue() {
		queueLinkedList.printLinkedList();
	}
}
