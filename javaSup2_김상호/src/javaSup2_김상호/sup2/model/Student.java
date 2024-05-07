package javaSup2_김상호.sup2.model;

public class Student {

	private String 이름;
	private int 학년;
	private int 반;
	private int 번호;
	private char 성별;
	private double 성적;
	
	public Student(String 이름, int 학년, int 반, int 번호, char 성별, double 성적) {
		super();
		this.이름 = 이름;
		this.학년 = 학년;
		this.반 = 반;
		this.번호 = 번호;
		this.성별 = 성별;
		this.성적 = 성적;
	}
	
	public void information() {
		String 젠더 = (성별 =='M'|| 성별 =='m') ? "남학생" : "여학생";
		System.out.println("학생이름 : " + 이름);
		System.out.println("학년 : " + 학년);
		System.out.println("반 : " + 반);
		System.out.println("번호 : " + 번호);
		System.out.println("성별 : " + 성별);
		System.out.println("성적 : " + 성적);
		
		System.out.println(학년 + "학년 " + 반 + "반 " + 번호 + "번 " + 젠더 + " " + 이름+"는(은) "
				+ "성적이 " + 성적 + "점 입니다.");
		
	}
}
