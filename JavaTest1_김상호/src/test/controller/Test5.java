package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		if((num1 >0 && num1 <10) && (num2 >0 && num2<10)) {
			if(num1*num2>0 && num1*num2<10) {
				System.out.println("한 자리 수 입니다");
			}
			else if(num1*num2>=10 && num1*num2<100) {
				System.out.println("두 자리 수 입니다.");
			}
		}
	}
}
