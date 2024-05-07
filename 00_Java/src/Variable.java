
public class Variable {

	public static void main(String[] args) {
		
	/*	1. 정수형 
		byte, short, int, long
		byte = 1byte 가장 작은 단위
		short = 2byte
		int = 4byte
		long = 8byte
		*/
				
		byte 바이트 = 1;
		System.out.println(바이트);
		System.out.println("바이트");
		
		byte bt = 2;
		System.out.println(bt);
		
		short 쇼트 = 3;
		System.out.println(쇼트);
		
		int 인트 = 1;
		System.out.println(인트);
		
		//byte 자료형 선언 선언이름 bte bte 안에 숫자 2넣고 출력하기
		//short 자료형 선언 선언이름 shrt shrt 안에 숫자 2넣고 출력하기
		//int 자료형 선언 선언이름 nt nt 안에 숫자 2넣고 출력하기
		//long 자료형 선언 선언이름 lng lng 안에 숫자 2넣고 출력하기
		
		byte bte = 2;
		short shrt = 2;
		int nt = 2;
		long lng = 2;
		
		System.out.println(bte);
		System.out.println(shrt);
		System.out.println(nt);
		System.out.println(lng);
		
		/*2. 문자, 문자열
		char, String
		 */
		char myChar = 'A';
		System.out.println(myChar);
		
	/*	char myChar2 = "A";
		System.out.println(myChar); <- 에러남
		char는 큰 따옴표 사용 불가. 작은 따옴표만 가능
		큰 따옴표는 String 문자열을 나타내는 표현
		
		char myChar3 = 'AB'; 
		char myChar4 = 'ABC';
		char myChar5 = '가나다'; <- 모두 에러남
		char에는 하나의 문자만 들어갈 수 있기 때문에 문자열이 불가능
		*/
		String str1 = "와 드디어 문자열이다..";
		System.out.println(str1);
		
		String name = "김상호";
		System.out.print("당신의 이름은 ");
		System.out.println(name);
		System.out.println("입니다.");
		//여러 글자나 내용을 한 줄로 출력하기 위해 '+'를 사용해서 붙일 수 있음
		System.out.println("당신의 이름은 " + name + " 입니다.");
		System.out.println("당 신 의 이 름 은 " + name + " 입 니 다.");
		//문자열 사이에 띄어쓰기를 넣고 싶다면 큰 따옴표 안에 넣을 것
		
		//정수 + 문자 + 문자열 출력
		/*
		 안녕하세요. 저는 인천에 사는 ooo입니다.
		 제 전화번호는 111-2222-3333입니다.
		 제 주민번호는 비밀입니다.
		 제 혈액형은 B형입니다.
		 */
		String greeting = "안녕하세요.";
		String introduction = "저는 인천에 사는 김상호입니다.";
		char dash = '-';
	/*	int num1 = 111;
		int num2 = 2222;
		int num3 = 3333;*/
		String number = "111-2222-3333";
		String secret = "비밀";
		String bloodType = "B형";
		
		System.out.println(greeting + introduction);
		//System.out.println("제 전화번호는 " + num1 + dash + num2 + dash + num3 + "입니다.");
		System.out.println("제 전화번호는 " + number + "입니다.");
		System.out.println("제 주민번호는 " + secret + "입니다.");
		System.out.println("제 혈액형은 " + bloodType + "입니다.");
		
	/*	3. 실수
		실수는 float, double
		실수는 double 형식이 디폴트로 되어있음
		->float은 4바이트, double은 8바이트
		float에 실수를 넣기 위해서는 f를 붙여줘야함(대소문자 구분x)
		double은 float보다 크기가 크고 실수의 디폴트형이기 때문에
		뒤에 다른 수식을 붙이지 않아도 사용가능
		*/
		
		float ff = 3.14f;
		float ff2 = 3.14F;
		System.out.println("ff는 : " + ff + "이다.");
		System.out.println("ff2는 : " + ff2 + "이다.");
		
		double dd1 = 3.14;
		System.out.println("double dd1 : " + dd1);
		
	/*	4. 논리형
	 	boolean을 사용해서 true인지 false인지 표현
	 	if, for, while문에서 주로 사용
	 	*/
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("오늘 날씨는 " + isTrue);
		System.out.println("내일 날씨는 " + isFalse + " ?");
		
		//정수 문자 문자열 실수 논리형
		int num = 10;
		System.out.println("정수 num의 값 : " + num);
		
		char ch = 'Z';
		System.out.println("문자 ch의 값 : " + ch);
		
		String text = "Hello, World!";
		System.out.println("문자열 text : " + text);
		
		double db1 = 3.14;
		System.out.println(db1);
		
		boolean isTrue2 = true;
		System.out.println("isTrue2 = " + isTrue);
		
		//같은 변수에 다른 값을 넣고 싶다면 자료형 선언을 생략해도 됨
		//"변수명에 다른 값을 넣을 때는 지정값을 생략한다"
		num = 20;
		
		System.out.println("num = " + num);
		
		/*
		 철수는 19살이었다.
		 그런데 2024년이 되면서 20살이 되었다.
		 */
		String name1 = "철수";
		String age = "19";
		System.out.println(name1 + "는 " + age + "살이었다.");
		age = "20";
		System.out.println("그런데 2024년이 되면서 " + age + "살이 되었다.");
		
		
		
		
		
		
		
		
		
		
	}

}