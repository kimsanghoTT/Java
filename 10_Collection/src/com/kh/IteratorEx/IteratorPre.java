package com.kh.IteratorEx;

import java.util.*;//util폴더 안에 있는 모든 파일 가져오기
//파일 위치를 가져올 때 동일한 폴더 위치에서 많은 파일을 가져올 때는 *를 사용해서 모두 가져오기 가능
//* : 전체선택

public class IteratorPre {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 50, 70));
		//100, 10, 20, 30, 50, 70
		
		//숫자 추가하는 방법 1. add();
		nums.add(100);
		
		//숫자 추가하는 방법 2. asList();
		
		//Iterator 생성
		Iterator<Integer> 반복 = nums.iterator();
		
		//while문으로 hasNext()로 다음 요소 있는지 확인하고
		//next()로 출력하기
		while(반복.hasNext()) {
			int 숫자 = 반복.next();
			System.out.println(숫자);
		}
	}

}
