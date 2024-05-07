package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setClassroom(5);
		student.setGender('남');
		student.setGrade(3);
		student.setHeight(175);
		student.setName("김상호");
		student.information();
		
		System.out.println("==============");
		
		System.out.println("학년 : " + student.getGrade());
		System.out.println("성별 : " + student.getClassroom());
		System.out.println("성별 : " + student.getName());
		System.out.println("성별 : " + student.getHeight());
		System.out.println("성별 : " + student.getGender());
	}

}
