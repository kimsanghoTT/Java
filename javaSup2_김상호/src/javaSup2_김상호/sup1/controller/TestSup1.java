package javaSup2_김상호.sup1.controller;

import java.util.Scanner;

import javaSup2_김상호.sup1.model.Score;

public class TestSup1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int 국어 = sc.nextInt();
		System.out.print("영어 점수 : ");
		int 영어 = sc.nextInt();
		System.out.print("수학 점수 : ");
		int 수학 = sc.nextInt();
		
		Score 점수 = new Score(국어, 영어, 수학);
		점수.결과();
		
		
		
	}
}
