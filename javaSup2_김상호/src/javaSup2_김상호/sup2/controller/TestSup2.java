package javaSup2_김상호.sup2.controller;

import javaSup2_김상호.sup2.model.Student;

public class TestSup2 {

	public static void main(String[] args) {
		Student student = new Student("김철수", 3, 5, 17, 'm', 95.45);
		
		student.information();
	}
}
