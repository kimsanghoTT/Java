package com.kh.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		
		int arr[] = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2() {
		
		int arr[] = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기 입력(양의 정수) : ");
		int size = sc.nextInt();
		
		for(int i = 0; i < size; i++) {
			int arr[] = new int[size];
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		
		String arr[] = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		int countSame = 0;
	//	int searchIndex 
		char arr[] = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			if(arr[i] == ch) {
				System.out.println(str + "에 " + ch 
						+ "가 존재하는 위치(인덱스) : " + i);
				countSame++;
		}
			
	}
		
		System.out.println(ch + "개수 : " + countSame);
}
	
	public void practice6() {
		
		String day[] = {"월","화","수","목","금","토","일"};
			
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이의 숫자 입력 : ");
		int num = sc.nextInt();
		if(num >0 && num <7) {
		System.out.print(day[num] +"요일");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum = 0;
		
		for(int i = 0; i < size; i++) {
			System.out.print("배열 " + i + "번쨰 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			
		}
		for(int j = 0; j < size; j++) {
			System.out.print(arr[j] + " ");
			sum +=arr[j];
		}
		System.out.println("\n총 합 : " + sum);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("3이상의 홀수 자연수 : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		if(size%2 == 0 || size <3) {
			System.out.println("다시 입력하세요");
			return;
		}
		for(int i = 0; i<size; i++) {
			
			arr[i] = i+1;
			System.out.print(arr[i] + ", ");
		}
		for(int i = 1; i<size; i++) {
			
			arr[i] = arr.length - i;
			
			if(arr[i] == 1) {
				System.out.print(arr[i]);
			}
			else {
				System.out.print(arr[i] + ", ");
			}
			
		}
	}
	
	public void practice9() {
		//Random 객체 사용 : 조금 더 넓은 범위로 랜덤을 사용
		//Math객체에서 random() 메서드 사용 : Random객체보다 작은 범위로 사용
		int arr[] = new int[7];
		
	//	Random ran = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			//arr[]의 최종 길이를 알기 위해 length사용
	//		arr[i] = ran.nextInt(45)+1;
			arr[i] = (int)(Math.random() * 45 + 1);
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice10() {
		
		ArrayList<Character> secret = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String Pn = sc.nextLine();
		
		char arr[] = new char[Pn.length()];
		
		for(int i = 0; i<Pn.length(); i++) {
			arr[i] = Pn.charAt(i);
			secret.add(arr[i]);
			if(i>=8) {
//				secret.set(i, "*");
			}
		}
		
	}
	
	public void practice11() {
		
		int arr[] = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		
		int arr[] = new int[10];
		Random ran = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10);
			System.out.print(arr[i] + " ");
			
		}
		
		
	}
	
	public void practice13() {
		
		int arr[] = new int[10];
		
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10+1);
			
			for(int j = 0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
			
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice14() {
		
		int arr[] = new int[6];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 45+1);
			
			for(int j = 0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
			
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		
	}
	
	public void practice15() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		int count = 0;
		char arr[] = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			
			boolean a = true;
			
			for(int j = 0; j<i; j++) {
				if(arr[i] == arr[j]) {
					a = false;
				}
			}
			if(a) {
				count++;
				if(i == 0) {
					System.out.print(arr[i]);
				}
				else {
					System.out.print(", " + arr[i]);
				}
				
			}
			
		}
		System.out.println("\n문자 개수 : " + count);
	}
	
	public void practice16() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[size];
		
		
		for(int i = 0; i<size; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			String str = sc.nextLine();
			arr[i] = str;
		}
		System.out.println("더 값을 입력하시겠습니까?(Y/N) : ");
		char choice = sc.next().charAt(0);
		if(choice == 'Y' || choice == 'y') {
			
		}
		
	}
	
	public void practice17() {
		
		String menu[] = {"양념", "파", "프라이드", "간장"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String order = sc.nextLine();
		
		for(int i = 0; i<menu.length; i++) {
			if(order.equals(menu[i])) {
				System.out.println(order + "치킨 배달 가능");
				break;
			}
			else {
				System.out.println(order + "치킨은 없는 메뉴입니다.");
				break;
			}
			
		}
	}
	
	
	
	
	
	
}
