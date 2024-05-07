package com.kh.practice.employee.view;

import com.kh.practice.employee.controller.EmployeeController;
import com.kh.practice.employee.model.vo.Employee;

public class EmployeeMenu {

	private EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {}
	
	public void printEmployeeMenu() {
		
		System.out.println("직원 이름, 과목, 성적");
		for(Employee employee : ec.printEmployee()) {
			System.out.println(employee.inform());
		}
		System.out.println("총점 : " + ec.sumScore());
		System.out.println("평균 : " + ec.avgScore()[1]);
		

	}
}
