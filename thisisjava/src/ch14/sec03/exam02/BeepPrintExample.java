package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) { 		// 메인 스레드
		Thread thread = new Thread(new Runnable() { // 작업 스레드
			@Override // 익명 구현 객체 => 더 많이 사용
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {} // 0.5초간 일시정지
				}
			}
		});
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}


