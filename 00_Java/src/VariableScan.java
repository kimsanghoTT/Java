import java.util.Scanner;

public class VariableScan {

	public static void main(String[] args) {
		
		/*사용자에게 입력받을 공간을 생성(new)
		Scanner를 이요해서 입력받은 내용을 컴퓨터에 표시
		system.in 을 사용해서 키보드 입력을 읽어올 때 사용
		Scanner는 자료형 자리에 int나 String이나 실수, boolean값을
		확정지어서 나타낼 수 없기 때문에 초기에는 Scanner라고 사용
		nextLine() : 문자 또는 엔터를 치기 전까지는 문장 전체를 입력받고
		입력된 문자를 모두 다 가져온다.(띄어쓰기, 특수문자 등 모두)
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자의 이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("사용자의 사는 곳을 입력하세요.");
		String home = sc.nextLine();
		System.out.println(home);
		
		System.out.println("사용자의 핸드폰 번호를 입력하세요.");
		String phoneNumber = sc.nextLine();
		System.out.println(phoneNumber);
		
		// Scanner String을 사용해서
		//사용자의 키(height), 나이(age), 닉네임(nickName)을 입력받기
		
		
		System.out.print("사용자의 키를 입력하세요 : ");
		String height = sc.nextLine();
		System.out.println(height);
		
		System.out.print("사용자의 나이를 입력하세요 : ");
		String age = sc.nextLine();
		System.out.println(age);
		
		System.out.print("사용자의 닉네임을 입력하세요 : ");
		String nickName = sc.nextLine();
		System.out.println(nickName);
		/*Scanner를 기반으로 sc라는 변수를 생성한다.
		sc는 시스템 인 하는 값으로 초기화 된다.
		sc는 Scanner에 입력된 값을 Scanner의 하위 메서드인 
		nextLine으로 다시 변환하여 가져온다.
		*/
		
	}

}

