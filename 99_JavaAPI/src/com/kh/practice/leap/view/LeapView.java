package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {

	public LeapView() {

		LeapController lc = new LeapController();
		
		Calendar 달력 = Calendar.getInstance();
		int year = 달력.get(Calendar.YEAR);
		boolean isLeap = lc.isLeapYear(year);
		if(isLeap) {
			System.out.println(year + "년은 " + "윤년 입니다.");
		}
		else {
			System.out.println(year + "년은 " + "평년 입니다.");
		}
		
		long totalDays = lc.leapDate(달력);
		System.out.println("총 날짜 수 : " + totalDays);
	}
}
