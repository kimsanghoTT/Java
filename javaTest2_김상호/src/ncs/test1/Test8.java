package ncs.test1;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		
		double[][] 성적 = new double[3][3];
		Scanner sc = new Scanner(System.in);
		double 총점 = 0;
		double 평균 = 0;
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<5; j++) {
				성적[i][j] = sc.nextDouble();
				총점 += 성적[i][j];
			}
		}
	}
}
