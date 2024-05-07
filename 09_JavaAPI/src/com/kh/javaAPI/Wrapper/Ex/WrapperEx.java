package com.kh.javaAPI.Wrapper.Ex;


/*
	Wrapper
	- 기본 자료형 타입을 객체로 감싸서 사용할 수 있는 클래스
	- int, double, char, short, long, boolean, float, byte
	- ArrayList에서 부를 때 많이 사용함
	*기본 데이터 타입 : primitive type
	Byte = byte
	Short = short
	Integer = int
	Long = long
	Float = float
	Double = double
	character = char
	Boolean = boolean
	
	*/
	
public class WrapperEx {

	public static void main(String[] args) {
		//Byte
		Byte 바이트값 = 10;
		//Byte 객체로 된 값을 객체가 아닌 기본 byte 값으로 쓸 때
		byte 기본바이트값 = 바이트값.byteValue();
		System.out.println("바이트 값 : " + 바이트값);
		System.out.println("기본바이트값 : " + 기본바이트값);
		
		//Short
		Short 쇼트값 = 20;
		short 기본쇼트값 = 쇼트값.shortValue();
		System.out.println("쇼트값 : " + 쇼트값);
		System.out.println("기본쇼트값 : " + 기본쇼트값);
		
		//Integer
		Integer 인티져값 = 30;
		int 기본인티져값 = 인티져값.intValue();
		System.out.println("인티져값 : " + 인티져값);
		System.out.println("기본인티져값 : " + 기본인티져값);
		
		//Long
		Long 롱값 = 40L;
		long 기본롱값 = 롱값.longValue();
		System.out.println("롱값 : " + 롱값);
		System.out.println("기본 롱값 : " + 기본롱값);
		
		//Float
		Float 플로트값 = 50.5f;
		float 기본플로트값 = 플로트값.floatValue();
		System.out.println("플로트값 : " + 플로트값);
		System.out.println("기본 플로트값 : " + 기본플로트값);
		
		//Double
		Double 더블값 = 60.6;
		double 기본더블값 = 더블값.doubleValue();
		System.out.println("더블 값 : " + 더블값);
		System.out.println("기본 더블값 : " + 기본더블값);
		
		//Character
		Character 캐릭터값 = 'A';
		char 기본캐릭터값 = 캐릭터값.charValue();
		System.out.println("캐릭터 값 : " + 캐릭터값);
		System.out.println("기본 캐릭터값 : " + 기본캐릭터값);
		
		//Boolean
		Boolean 불리언값 = true;
		boolean 기본불리언값 = 불리언값.booleanValue();
		System.out.println("불리언 값 : " + 불리언값);
		System.out.println("기본 불리언값 : " + 기본불리언값);
		
		
	}
}
