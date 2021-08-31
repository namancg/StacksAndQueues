package com.bridgelabz.stacksandqueues;
import com.bridgelabz.linkedlists.*;
public class QueueMain {

	public static void main(String[] args) {
		Queue QueueList = new Queue();
		LinkedList<Integer> firstNode = new LinkedList<Integer>(56);
		LinkedList<Integer> secondNode = new LinkedList<Integer>(30);
		LinkedList<Integer> thirdNode = new LinkedList<Integer>(70);
		QueueList.enqueue(firstNode);
		QueueList.enqueue(secondNode);
		QueueList.enqueue(thirdNode);
		QueueList.printQueue();
	}

}
