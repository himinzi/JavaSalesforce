package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		
		for(int i=0; i<5; i++) {		
			toolkit.beep(); // "띵" 글자가 찍히면서 동시에 소리가 남..!!
			try { Thread.sleep(500); } catch(Exception e) {} // 1초 : 1000
		}

		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}


