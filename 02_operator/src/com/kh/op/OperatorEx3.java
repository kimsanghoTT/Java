package com.kh.op;

public class OperatorEx3 {

	public static void main(String[] args) {
		
/* 		- 증감 연산자
		 1. ++ : 1을 더한다는 의미
		 2. -- : 1을 뺀다는 의미
		 전위 연산자 : 먼저 덧셈, 뺄셈을 한 후에 다른 계산을 실행 
		 ex) ++i
		 후위 연산자 : 다른 계산을 먼저한 다음에 덧셈, 뺄셈 진행 
		 ex) i++
*/
		int a = 10;
			//(a+1=) a = 11
			//b까지 가기 전에 a에 1을 더해서 a값을 b한테 보내기
			//a는 b한테 들어가기 전에 10+1한 값이 
			//a안으로 들어가고, a안에 들어간 10+1=11이 b로 들어감
		int b = ++a;
		System.out.println("a: " + a + ", b: " + b);
		
		int c = 10;
			//우선 d에 c의 값을 넣음. d=c -> d = 10
			//그 후에 c에 +1
			
		int d = c++;
		System.out.println("c: " + c + ", d: " + d);
		
	}

}
