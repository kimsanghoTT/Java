package com.kh.QueueEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {
	public static void main(String[] args) {	
		Queue<Integer> 큐 = new LinkedList<>();
		
		큐.offer(80);
		큐.offer(60);
		큐.offer(40);
		큐.offer(20);
		
		int front = 큐.poll();
		System.out.println(front);
		
		int newFront = 큐.peek();
		System.out.println(newFront);
		
		boolean empty = 큐.isEmpty();
		System.out.println(empty);
		
		큐.remove(20);
		System.out.println(큐);
		
		
	}
}
