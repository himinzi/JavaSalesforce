package ch14.sec07.exam02;

public class PrintThread extends Thread {
	public void run() {	
		//how1
//		try {
//			while(true) {
//				System.out.println("실행 중");
//				Thread.sleep(1); // 방해할 수 있는 틈을 주는 행위(InterruptedException)
//			}	
//		} catch(InterruptedException e) {		
//			System.out.println("interrupt() 호출됨...");
//		}
		
		//how2
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				System.out.println("interrupt() 호출됨...");
				break;
			}
		}
		
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}

