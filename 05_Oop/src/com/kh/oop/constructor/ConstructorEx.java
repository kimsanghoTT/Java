package com.kh.oop.constructor;

public class ConstructorEx {
	
	//필드 변수명 정의
	public String name;
	public String phone;
	public int idNo;
	public int money;
	
	//기본 생성자 : 필수적인 요소를 아무것도 넣지 않은 생성자
	public ConstructorEx() {}
	
	//필수 생성자 - 괄호 안에 매개변수가 필수로 들어가야함
	public ConstructorEx(String inputName) {
		this.name =inputName;

	}
	public ConstructorEx(String inputName, String inputNumber) {
		this.name =inputName;
		this.phone=inputNumber;
	}
	
	//값이 지정된 생성자
	public ConstructorEx(int a) {
		//기본으로 값을 지정해서 전달하는 생성자
		//생성할 떄부터 값을 지정해주고 추후 값을 변경할 수 있도록 해줌
/*String*/	name = "이름을 입력해주세요.";
/*String*/	phone = "번호를 입력해주세요.";
/*int*/		idNo = 1;
/*int*/		money = 0;
		/*값을 지정한 생성자는 초기의 값만 지정해주기 떄문에
		매개변수를 필수로 넣지 않아도 되지만 기본생성자와 생김새가 유사해서
		에러가 나기 때문에 현재는 임의로 매개변수를 넣어줘야함.
		보통은 public ConstructorEx() { }로 사용할 수 있음 */
	}
	
	public static void main(String[] args) {
	/*	
		생성자
		변수를 원하는 값으로 초기화할 수 있음
		
		초기값이 = 0;으로 되어 있을 때 초기값에 1을 넣어주면
		초기값이 1로 초기화됨
		
		1.반환값이 없음(return 사용 x, void 사용 x)
		2.객체(클래스)를 초기화하는 방법이 많을 경우 모두 사용 가능
		
		선언 예제
			1. 기본 생성자 - 필수요소가 없음
				public 클래스이름() {}
			
			2. 필수 생성자 - 필수로 받아야하는 값이 존재
					   	- 필수로 받아야하는 값은 필드에 적힌 값만 가능
				public 클래스이름(String ㅇㅇ, int ㅇㅇ2) {}
					(변수명과 필드값은 같은)
					this.변수명 = ㅇㅇ;
					this.필드값2 = ㅇㅇ2;
					
			3. 값이 지정된 생성자 - 필드나 생성자에서 값을 지정해준 생성자
			
	*/
		
		


		
		
	}

}
