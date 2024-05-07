package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
/*
	Student sArr[] = new Student[5];
	Student(sArr) 	- sArr[0] 이름 과목 점수
				  	- sArr[1] 이름 과목 점수
					- sArr[2] 이름 과목 점수
					- sArr[3] 이름 과목 점수
					- sArr[4] 이름 과목 점수

*/	
	private Student sArr[] = new Student[5];
	
	public static final int CUT_LINE = 60;
	
	public StudentController() {
		//0번쨰 ~ 4번째 학생까지 값을 넣어주기
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	//반환 메서드
	public Student[] printStudent() {
		return sArr;
	}
	
	public int sumScore() { //점수 합한 값 전달
		int sum = 0;
		for(Student s : sArr) {
			sum += s.getScore();
		}
		//sumScore를 부르면 sum을 보여줌
		return sum;
	}
	//총점에서 배열을 사용하지 않고 평균 구하기
	public double[] avgScore() {
		double avgArr[] = new double[2];
		avgArr[0] = sumScore();
		avgArr[1] = sumScore() /sArr.length;
		return avgArr;
	}
	
	public double avgScore2() {
		double avgArr = sumScore() /sArr.length;
	
		return avgArr;
	}
	
	//각 학생의 합격 여부를 확인하고 출력하는 메서드
	public void printPass() {
		for(Student s : sArr) {
			s.setPassed(s.getScore() >= CUT_LINE);
			System.out.println(s.getName() + " 학생은 " + (s.isPassed() ? "합격" : "불합격") +"입니다.");
		}
	}
}
