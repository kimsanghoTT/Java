package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	
	
	public StudentMenu() {}
	
	public void printStudentMenu() {
		System.out.println("학생이름, 과목, 점수");
		System.out.println("--------------------");
		//String으로 쓰면 학생의 이름, 점수, 과목 중 하나만 가져오는 것
		//Student로 쓰면 이름, 점수, 과목 모두 가져오는 것
		for(Student student : ssm.printStudent()) {
			System.out.println(student.inform());
		}
		System.out.println("--------------------");
		System.out.println("총점 : " + ssm.sumScore());
		System.out.printf("평균 : %.2f" , ssm.avgScore()[1]);
		//소수점 두번째 자리까지
		System.out.println("\n합격 여부 : " + (ssm.avgScore()[1] >= StudentController.CUT_LINE));
		ssm.printPass();
	
	}
	
/*	
	boolean을 안썼는데 true false로 보이는 이유
	- ssm.avgScore()[1] >= StudentController.CUT_LINE
	
	- 값을 비교하는 부등호는 true, false 구분만 하기위해 존재
	
	
	
*/	
}
