package com.kh.variable.ex;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		
	/*	
		Scanner 클래스
	 	- 사용자로부터 키보드 입력을 받기 위해 Java에서 제공하는 클래스
	 	- 기본적으로 제공되는 클래스가 아님
	 	->따라서 import java.utill이라는 패키지 표기를 한 후에 사용가능
		- import 정확한 표기법 :
		import java.util.Scanner;
		*import : 가져온다는 의미
		
		Scanner.next() : 공백없이 단어(String) 1개 입력 가능
		Scanner.nextLine() : 공백 포함 문자열(String) 1개 입력 가능
		Scanner.nextInt() : int형 정수 1개 입력 가능
		Scanner.nextLong() : long형 정수 1개 입력 가능
		Scanner.nextDouble() : 실수 1개 입력 가능
		
		Scanner 클래스 안에는 이외에 여러 기능이 존재
		Scanner는 불러온 다음 close를 사용해서 
		공간을 닫아주는 표시를 해주는 것이 좋음
		
	
		Scanner 사용하기
		1. 클래스 위에 import 구문이 생겨야함
		2. Scanner 객체 사용
		3. System.in을 사용해 키보드로 입력하는 값을 받을 수 있도록 하기
		4. System.out을 사용해 작성된 내용 출력
		5. Scanner close를 사용해 닫아주기
	*/
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 1 : ");
		int num1 = sc.nextInt(); 
		//다음에 입력된 정수를 가져와 num1에 대입
		System.out.print("정수 입력 2 : ");
		int num2 = sc.nextInt();
		//다음에 입력된 정수를 가져와 num2에 대입
		System.out.print("실수 입력 : ");
		double num3 = sc.nextDouble();
		System.out.print("단어 입력 2개 하기 : ");
		String word1 = sc.next();
		String word2 = sc.next();
		//Scanner를 이용해서 입력을 진행할 경우
		//system.out.print를 이용해서 제대로 값이 입력됐는지
		//확인 출력을 하는 습관
		
		//*****************************************
		// next() / nextInt() / nextDouble() 등을 작성한 이후
		// nextLine()을 작성해야하는 상황이 오면
		// nextLine()을 미리 한 번 작성하고 사용하기
		
		sc.nextLine(); 
		// next() 뒤에 남아있는 버퍼값을 받아내 제거하는 역할
		//버퍼값은 보거나 저장할 이유가 없기 때문에 자료형이나 변수지정을 하지 않음
		//따라서 바로 sc.nextLine()으로 사용
		//nextLine()을 호출해서 남아있던 엔터를 제거 -> 초기화
		System.out.print("문장 입력 : ");
		String str = sc.nextLine();
		
		
		System.out.println("정수 1의 값 : " + num1);
		System.out.println("정수 2의 값 : " + num2);
		System.out.println("실수의 값 : " + num3);
		System.out.println("단어 2개 : " + word1 + ", "+ word2);
		System.out.println("추가된 문장 : " + str);
		sc.close();
		//Scanner 사용을 다 했다면 공간 낭비를 막기 위해
		//close를 사용해서 닫기
	}

}
