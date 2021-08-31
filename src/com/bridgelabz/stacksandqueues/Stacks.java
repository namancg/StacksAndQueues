package com.bridgelabz.stacksandqueues;
import com.bridgelabz.linkedlists.*;
public class Stacks<K> {
	
	private final LinkedListImpl stackLinkedList;
	
	public Stacks() {
		stackLinkedList = new LinkedListImpl();
	}
	public void push(INode element) {
		stackLinkedList.add(element);
	}
	public void printStack() {
		stackLinkedList.printLinkedList();
	}
}