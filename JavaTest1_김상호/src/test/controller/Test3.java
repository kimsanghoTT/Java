package test.controller;

public class Test3 {

	public static void main(String[] args) {
		
		double num1 = 0;
		double num2 = 1;
		while(num2 <= 100) {
			num1 += num2;
			num2++;
			
		}
		System.out.println("합계 : " + num1);
		System.out.println("평균 : " + num1 / num2);
	}
}
