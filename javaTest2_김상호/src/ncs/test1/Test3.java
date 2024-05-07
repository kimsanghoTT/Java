package ncs.test1;

public class Test3 {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		double sum = 0;
		for(int i = 0; i<array.length; i+=2) {
			System.out.println(array[i]);
			sum += array[i];
		}
		System.out.println("합계 :" + sum);
	}
}
