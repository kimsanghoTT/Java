package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	private Student s[] = new Student[3];
	private Employee e[] = new Employee[10];
	private int studentIndex = 0;
	private int employeeIndex = 0;

	
	public int[] personCount() {
		//count[0] = 학생 수 자리
		//count[1] = 직장인 수 자리
		int count[] = new int[2];
		count[0] = studentIndex;
		count[1] = employeeIndex;
		return count;
	}
		

	
	public void insertStudent(String name, int age, double height, double weight
			, int grade, String major) {
		if(studentIndex < s.length) {
			s[studentIndex++] = new Student(name, age, height, weight, grade, major);
			
		}
		else {
			System.out.println("더 이상 추가할 수 없습니다.");
		}
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight
			, int salary, String dept) {
		if(employeeIndex < e.length) {
			e[employeeIndex++] = new Employee(name, age, height, weight, salary, dept);
		}
		else {
			System.out.println("더 이상 추가할 수 없습니다.");
		}
	}
	
	public Employee[] printEmployee() {

		return e;
	}
}
