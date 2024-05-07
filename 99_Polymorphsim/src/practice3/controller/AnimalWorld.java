package practice3.controller;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Rabbit;

public class AnimalWorld {

	public static void main(String[] args) {
		
		Animal animals[] = new Animal[5];
		Random ran = new Random();
		
		for(int i = 0; i < animals.length; i++) {
			if(ran.nextBoolean()) {
				animals[i] = new Rabbit("토깽이" + i, "토끼", ran.nextInt(10)+1, "흰색");
			}
			else {
				animals[i] = new Horse("키타산 블랙" + i, "말", "초원", "검은색");
			}
		}
		for(Animal a : animals) {
			a.speak();
		}
		
	}
}
