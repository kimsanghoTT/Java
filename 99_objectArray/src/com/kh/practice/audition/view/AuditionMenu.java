package com.kh.practice.audition.view;

import com.kh.practice.audition.controller.AuditionController;
import com.kh.practice.audition.model.vo.Audition;

public class AuditionMenu {

	public AuditionMenu(){}
	
	private AuditionController ac = new AuditionController();
	
	public void printAudionMenu() {
		System.out.println("참가자 이름, 장르, 점수");
		System.out.println("=================");
		for(Audition A : ac.printAudition()) {
			System.out.println(A.inform());
		}
		System.out.println("총점 : " + ac.sumScore());
		System.out.printf("참가자 평균 : %.2f", ac.avgScore()[1]);
		ac.printPass();
		
	}
}
