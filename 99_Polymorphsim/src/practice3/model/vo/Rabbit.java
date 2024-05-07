package practice3.model.vo;

public class Rabbit extends Animal{

	private int weight;
	private String color;
	
	public Rabbit() {
		// TODO Auto-generated constructor stub
	}

	public Rabbit(String name, String kinds, int weight, String color) {
		super(name, kinds);
		this.weight = weight;
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void speak() {
		System.out.println(super.toString() + " 몸무게는 " + weight
				+ "kg 이며, 털 색깔은 " + color + "입니다.");
	}
}
