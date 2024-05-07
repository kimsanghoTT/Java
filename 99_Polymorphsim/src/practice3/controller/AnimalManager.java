package practice3.controller;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		//Animal 타입의 객체배열 크기 5 생성
		Animal animals[] = new Animal[5];
		
		//각 인덱스에 무작위로 Dog객체, 또는 Cat 객체로 생성
		//매개변수 생성자를 이용하여 생성
		
		Random ran = new Random();
		
		for(int i = 0; i<animals.length; i++) {
			//랜덤으로 true랑 false를 가져오게 한 다음 true면 Dog, false면 Cat을 넣기
			//nextBoolean : 랜덤으로 거짓 참이 나옴
			if(ran.nextBoolean()) {
				animals[i] = new Dog("멍멍이 " + i , "개", ran.nextInt(30) + 1);
				//Dog(String name, String kinds, int weight)
				//멍멍이 이름을 지어줄 떄 멍멍이1, 멍멍이2~
				//몸무게는 1~30 랜덤으로 측정
				
			}
			else {
				animals[i] = new Cat("야옹이" + i, "고양이", "집", " 검은색");
				
				
			}
			
			
		}
		for(Animal a : animals) {
			a.speak();
		}
		
	}

}
