package test.controller;

public class Test2 {

	public static void main(String[] args) {
		
		
		
		for(int i = 1; i<=9; i++) {
			if(i % 2 !=0) {
				for(int j = 1; j<=9; j++) {
					if(j % 2 != 0) {
						System.out.println(i + "*" +  j + "=" + i*j);
					}
					
				}
			}
			System.out.println();

		}
	}
}
