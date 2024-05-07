package com.kh.practice.student.model.vo;

public class Student {

	private String name;
	private String subject;
	private int score;
	private boolean passed;
	
	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	public Student() {
	}

	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// 자동 정렬 단축키 : 컨트롤 + 시프트 + f
	public String inform() {
		return "이름 : " + name + ", 과목 : " + subject + ", 점수 : " + score;

	}
}
