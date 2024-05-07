package com.kh.practice.audition.model.vo;

public class Audition {

	private String name;
	private String value;
	private int score;
	private boolean passed;
	
	public Audition(){}
	public Audition(String name, String value, int score){
		this.name =name;
		this.value = value;
		this.score = score;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isPassed() {
		return passed;
	}
	public void setPassed(boolean passed) {
		this.passed = passed;
	}
	
	public String inform() {
		return name + "씨의 음악 장르는 " + value + "이며, 점수는 " + score + "입니다.";
		
	}
}
