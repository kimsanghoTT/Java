package com.kh.javaAPI.Date.Ex;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DatePre {

	public static void main(String[] args) {
		
		//SimpleDateFormat 활용해서 날짜만들기
		
		//1. yyyy-MM-dd
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = sd.format(new Date());
		System.out.println(date1);
		//2. HH:mm:ss
		SimpleDateFormat sd2 = new SimpleDateFormat("HH:mm:ss");
		String date2 = sd2.format(new Date());
		System.out.println(date2);
		//3. yyyy-MM-dd HH:mm:ss
		SimpleDateFormat sd3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date3 = sd3.format(new Date());
		System.out.println(date3);
		
		//4. E 넣어서 요일 나타내기
		SimpleDateFormat sd4 = new SimpleDateFormat("E");
		String date4 = sd4.format(new Date());
		System.out.println(date4);
	}

}
