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
	public INode pop() {
		return stackLinkedList.delete();
		}

	public INode peek() {
	return stackLinkedList.head;
	}
	public boolean isEmpty() {
	if(stackLinkedList.head != null) {
		return false;
	}
	else 
	{
		return true;
	}
}
public int size() {
	return stackLinkedList.size();
}
}