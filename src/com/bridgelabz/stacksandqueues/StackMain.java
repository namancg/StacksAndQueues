package com.bridgelabz.stacksandqueues;
import com.bridgelabz.linkedlists.*;
public class StackMain {
	public static void main(String args[]) {
	Stacks stack=new Stacks();
	LinkedList<Integer> firstNode = new LinkedList<Integer>(70);
	LinkedList<Integer> secondNode = new LinkedList<Integer>(30);
	LinkedList<Integer> thirdNode = new LinkedList<Integer>(56);
	stack.push(firstNode);
	stack.push(secondNode);
	stack.push(thirdNode);
	stack.printStack();
}
}