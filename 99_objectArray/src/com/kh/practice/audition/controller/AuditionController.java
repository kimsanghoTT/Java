package com.kh.practice.audition.controller;

import com.kh.practice.audition.model.vo.Audition;

public class AuditionController {

	private Audition auArr[] = new Audition[5];
	public static final int CUT_LINE = 60;
	
	public AuditionController() {
		auArr[0] = new Audition("김영희", "발라드", 100);
		auArr[1] = new Audition("박영희", "힙합", 50);
		auArr[2] = new Audition("이영희", "뮤지컬", 85);
		auArr[3] = new Audition("정영희", "댄스", 60);
		auArr[4] = new Audition("홍영희", "팝", 20);
		
		
	}
	public Audition[] printAudition() {
		return auArr;
	}
	
	public int sumScore() {
		int sum = 0;
		for(Audition n : auArr) {
			sum += n.getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double avgauArr[] = new double[2];
		avgauArr[0] = sumScore();
		avgauArr[1] = sumScore() / auArr.length;
		return avgauArr;
	}
	
	public void printPass() {
		for(Audition A : auArr) {
			A.setPassed(A.getScore() >= CUT_LINE);
			System.out.println(A.getName() + "은 " + 
			(A.isPassed() ? "합격" : "불합격") + "입니다.");
			
		}
	}
	
}
