package ncs.test1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		String upper = str.toUpperCase();
		char[] ch = new char[upper.length()];
		
		for(int i = 0; i<str.length(); i++) {
			ch[i] = upper.charAt(upper.length() -1 -i);
			
			System.out.print(ch[i]);
		}

		
	}
}
