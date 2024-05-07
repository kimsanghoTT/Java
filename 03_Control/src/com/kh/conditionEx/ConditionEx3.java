package com.kh.conditionEx;

public class ConditionEx3 {
	
/*	if문으로 정수를 비교할 수 있고, 실수를 비교할 수 있고, 문자, 문자열 등 
	모든 것을 비교할 수 있음
	
	-정수 비교
		if(숫자 == 숫자) {
			숫자와 숫자가 같을 때 실행할 출력문
		}
	-문자열 비교 ".equals"
		if("문자열".equals("문자열")) {
			문자열과 문자열이 같을 때 실행할 출력문
			
		}
		문자열을 String 변수명에 넣어준다면 "문자열" 큰따옴표를 붙여서 적지않고
		지정해준 변수명을 적어주면 된다
		
		String str = "문자열"
	ex)	if(str.equals(str)){
			System.out.println("문자열이 동일합니다.")
		}
		if("문자열".eqauls(str)){
		sysout~
		}
		if(str.equals("문자열")){
		sysout(문자열이 동일합니다.")
		
	*/
	
	
	public static void main(String[] args) {
		
		//정수 비교
		int num = 10;
		if(num == 10) {
			System.out.println("숫자가 동일합니다.");
		}
		//문자열 비교
		String str = "hello";
		if(str.equals("hello")) {
			System.out.println("문자열이 동일합니다.");
		}
		
		String str1 = "둘";
		String str2 = "";
		
		if("둘".equals(str1)) {
			System.out.println("모두 둘 입니다.");
		}
	}

}
