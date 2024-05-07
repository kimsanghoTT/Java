package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		
		
		Circle mini = new Circle();
		
		mini.getAreaOfCircle();
		mini.getSizeOfCircle();
		
		mini.incrementRadius(); // 반지름 1 증가 시킴
		
		Circle mini2 = new Circle();
		
		mini.getAreaOfCircle();
		mini.getSizeOfCircle();
		
	}

}
