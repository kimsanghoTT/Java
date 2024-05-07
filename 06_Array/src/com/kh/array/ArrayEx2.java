package com.kh.array;

import java.util.Scanner;

public class ArrayEx2 {
	
	public static void method1() {
		
		//배열에 정수 10 20 30 넣고 출력하기
		int num[] = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		for(int i = 0; i<num.length; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}
		//문자열 각 자리에 어떤 요일이 들어가 있는지 출력
		String str[] = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int day = sc.nextInt();
		System.out.println(str[day]);
		
		//실수 index2까지 만들어주고 출력
		double db1[] = new double[3];
		db1[0] = 4.3453;
		db1[1] = 3.141592;
		db1[2] = 7.4545;
				
		for(int i = 0; i<db1.length; i++) {
			System.out.println("db1[" + i + "] = " + db1[i]);
		}
		//문자 'A' 'B' 'C' 넣어준 다음에 각 자리 출력
		
		char ch[] = new char[3];
		
		ch[0] = 'A';
		ch[1] = 'B';
		ch[2] = 'C';
		for(int i = 0; i<ch.length; i++) {
			System.out.println("ch[" + i + "] = " + ch[i]);
		}
		
		
	}
	
	public void practice17() {
		
		String[] menu = {"양념","프라이드","간장"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.next();
		
		boolean found = false;
		
		for(String 메뉴 : menu) {
			if(메뉴.equals(name)) {
				found = true;
				break;
			}

		}
		if(found) {
			System.out.println(name + "치킨 배달 가능");
			
		}
		else {
			System.out.println(name + "치킨은 없는 메뉴입니다.");
		}	
		

	}

	public static void main(String[] args) {
		
		//for문을 활용한 배열 출력
		
		int numbers[] = new int[5];
		
		for(int i =0; i<numbers.length; i++) {
			numbers[i] = i;
			System.out.println("numbers[" + i+ "] = " + i);
		}
		
		// method1();
		ArrayEx2 ae = new ArrayEx2();
		ae.practice17();
	}

}
