package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {

	public ArrayPre() {}
	
	public void practice1() {
		//배열을 사용해서 전체 합 구하기
		//배열을 사용할 때 문자인지 문자열인지 실수인지 숫자인지 구분 후 [] 작성
		
		//index      0  1  2  3  4     length = 5
		int num[] = {1, 2, 3, 4, 5};
		int result = 0;
		
		//for-each문 
		for(int sum : num) {
			// num 안에 있는 모든 숫자가 하나씩 sum안에 들어감
			//숫자들의 합
			result += sum;
		}
		System.out.println("숫자들의 합 : " + result);
	}

	public void practice2() {
		//ArrayList 사용해서 물건 추가하기
		ArrayList<String> goods = new ArrayList<>();
		
		goods.add("컴퓨터");
		goods.add("냉장고");
		goods.add("TV");
		goods.add("에어컨");
		
		//모두 보기
		//1.
		System.out.println(goods);
		
		//2. for-each
		for(String 상품 : goods) {
			System.out.print(상품 + " ");
		}
		
	}

	public void practice3() {
		//배열을 사용해서 최대값 찾기
		int numbers[] = {3,7,2,9,1};
		
		int max = numbers[0];
		for(int num : numbers) {
			if(num >max) {
				max = num;
			}
		}
		System.out.println("최대값 : " + max);
	}
	
	public void practice4() {
		//검색
		
		String fruits[] = {"사과", "바나나", "딸기", "오렌지"};
		
		String search = "키위";
		boolean found = false; //아직은 찾은지 아닌지 모르기 떄문에 false 기본값
		
		for(String 검색 : fruits) {
			if(search.equals(검색)) {
				found = true;
				break;
			}
		}
		System.out.println(search + " 찾음? " + (found ? "찾음" : "못찾음"));
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 동물 입력 : ");
		String name = sc.next();
		String zoo[] = {"코끼리", "원숭이", "판다", "토끼", "공작"};
		
		boolean found = false;
		
		for(String search : zoo) {
			if(search.equals(name)) {
				found = true;
				break;
			}
		}
		System.out.println(name + " 검색 결과 : " + (found ? "찾았습니다." : "못찾았습니다."));
	}
	
	
	
	
}
