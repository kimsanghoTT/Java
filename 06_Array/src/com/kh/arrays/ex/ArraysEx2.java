package com.kh.arrays.ex;

import java.util.Arrays;

public class ArraysEx2 {

	public ArraysEx2() {}
	
	public void method1() {
		//숫자 배열 생성하기
		
		int num[] = {6,4,2,3,5,7,9};
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		int abc[] = Arrays.copyOf(num, num.length);
		System.out.println(Arrays.toString(abc));
		
		boolean same = Arrays.equals(num, abc);
		System.out.println(same);
		
		int[] 채우기 = new int[3];
		
		Arrays.fill(채우기, 6);
		
		System.out.println(Arrays.toString(채우기));
		
	}
	
	
	public static void main(String[] args) {
		
		ArraysEx2 ae = new ArraysEx2();
		
		ae.method1();
		
	}

}
