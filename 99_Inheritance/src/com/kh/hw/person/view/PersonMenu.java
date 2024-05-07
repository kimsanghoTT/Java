package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {

	//사용자한테 숫자를 입력받고
	Scanner sc = new Scanner(System.in);
	
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("==== 메인 메뉴 ====");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();//버퍼 없애기(남아있는 엔터 없애기)
			
			switch(num) {
			
			case 1:
				StudentMenu();
				break;
				
			case 2:
				EmployeeMenu();
				break;
				
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default :
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
	//학생을 추가하거나 초회할 것
	public void StudentMenu() {
		while(true) {
			System.out.println("학생 메뉴");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			
			case 1:
				insertStudent();
				break;
				
			case 2:
				printStudent();
				break;
				
			case 9:
				System.out.println("이전 메뉴로 이동합니다.");
				return;
				
			default :
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void insertStudent() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("전공 : ");
		String major = sc.nextLine();
		
		
		pc.insertStudent(name, age, height, weight, grade, major);
		System.out.println("학생이 추가되었습니다.");
		
	}
	
	public void printStudent() {
		
		Student student[] = pc.printStudent();
		System.out.println("==== 학생 목록 ====");
		for(Student s : student) {
			if(s != null) {
				System.out.println(s.toString());
			}
			else {
				System.out.println("보여줄 학생 정보가 없습니다.");
			}
			
		}
		
	}
	
	public void EmployeeMenu() {
		while(true) {
			System.out.println("사원 메뉴");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			
			case 1:
				insertEmployee();
				break;
				
			case 2:
				printEmployee();
				break;
				
			case 9:
				System.out.println("이전 메뉴로 이동합니다.");
				return;
				
			default :
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void insertEmployee() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("키 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("급여 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		
		System.out.println("부서 : ");
		String dept = sc.nextLine();
		
		pc.insertEmployee(name, age, height, weight, salary, dept);
		System.out.println("사원이 추가되었습니다.");
	}
	
	public void printEmployee() {
		
		Employee employee[] = pc.printEmployee();
		System.out.println("==== 사원 목록 ====");
		for(Employee e : employee) {
			if(e != null) {
				System.out.println(e.toString());
			}
			else {
				System.out.println("보여줄 사원 정보가 없습니다.");
			}
			
		}
	}
	
	
	
	
}
