package com.kh.StackEx;

import java.util.Stack;

public class StackPre {

	public static void main(String[] args) {
		
		Stack<Integer> 숫자 = new Stack<>();
		
		숫자.push(10);
		숫자.push(30);
		숫자.push(50);
		숫자.push(40);
		숫자.push(20);
		
		int last = 숫자.pop();
		System.out.println(last);
		
		int top = 숫자.peek();
		System.out.println(top);
		
		boolean blank = 숫자.isEmpty();
		System.out.println(blank);
		
		int size = 숫자.size();
		System.out.println(size);
	}
	
}
