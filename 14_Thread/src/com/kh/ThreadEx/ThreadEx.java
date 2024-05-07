package com.kh.ThreadEx;
/*
	Thread(스레드) : 실
	- 스레드는 컴퓨터에서 실제로 작업을 수행하는 것을 의미
	- 두 개 이상의 스레드를 가지는 프로세스를 멀티스레드라고 함
		* process : program + sucess = 프로그램 실행 성공 = 프로그램 실행중
	
	스레드 생성 방법
	1. Runnable 인터페이스 사용. 클래스 명 옆에 'implements Runnable'
	
	2. Thread 클래스 상속받기. 클래스 명 옆에 'extends Thread'
	- 메서드와 관계없이 스레드를 시작할 때는 start()사용해야함
	
	* 스레드에서 순서는 스레드가 컴퓨터 안에서 생성되고 시작되는 지점에 따라 달라짐
	 
	* 스레드는 기본적으로 우선순위가 5. 우선순위는 1~10까지 존재
	- Thread.MIN_PRIORITY = 우선순위 1			-> CPU자원을 가장 적게 확보
	- Thread.NORM_PRIORITY = 우선순위 5(기본)
	- Thread.MAX_PRIORITY = 우선순위 10       -> CPU자원을 가장 많이 확보
	- 스레드에서 말하는 우선순위는 CPU 자원을 더 많이 확보하는 우선순위
	- 우선순위가 높은 스레드가 항상 먼저 실행되는 것은 아님
	
	- sleep() : n초간 잠자는 상태 유지(알아서 n초 후 실행)
	
	=================================================================
	//현재 사용이 권장 x 
	- suspend() : 일시 중지(알아서 실행되지 않고 resume()을 써야 재시작 가능)
	- resume() : 일시 중지한 스레드 다시 재개
	=================================================================
	
	- wait() : 특정 조건이 충족 될 떄 까지 대기
	- notify() : 대기중인 스레드를 깨워 특정 작업을 진행하도록 함
	
	
	- await() : Condition에 속한 스레드를 일시적으로 대기상태로 전환
	- signal() : await에 의해 대기하고 있는 스레드를 깨움
	
	1, 5, 10 이외의 우선순위를 쓰고 싶다면
	
	ex) 우선순위 3으로 두고 싶다면
		setPriority(3);
		
		우선순위 6으로 두고 싶다면
		setPriority(6);
	
	
	
*/	

public class ThreadEx extends Thread {

	public void run() {
		System.out.println("스레드 실행중");
		
		try {
			
			Thread.sleep(1000);//1초동안 정지
		//	System.out.println("1초 끝");
		} catch (InterruptedException e) {
			
			
			
			e.printStackTrace();
		
		
		
		
	}
	
	}
	
	
}
