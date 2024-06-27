package ch14.sec07.exam02;

public class InterruptExample {
	public static void main(String[] args)  {
		Thread thread = new PrintThread();
		thread.start(); // method run 실행 
		
		try {
			// static method sleep 호출
			Thread.sleep(1000); // 방해할 수 있는 틈을 주는 행위
		} catch (InterruptedException e) {
		}
		
		thread.interrupt(); // main thread 가 print thread 를 제어
	}
}