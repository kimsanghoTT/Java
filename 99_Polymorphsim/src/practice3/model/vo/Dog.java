package practice3.model.vo;

public class Dog extends Animal{

	public static final String PLACE = "애견카페";
	private int weight;
	
	public Dog() {}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);//Animal 밑에있는 name, kinds를 바라보게 하기 위해
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println(super.toString() + "제 몸무게는 " + weight + "kg입니다. "
				+ "저는 자주 " + PLACE + "에 옵니다.");
	}
}
