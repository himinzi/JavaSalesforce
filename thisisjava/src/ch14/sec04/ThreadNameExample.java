package ch14.sec04;

public class ThreadNameExample {
	public static void main(String[] args) { // main method 도 thread 임!
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		for(int i=0; i<3; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + " 실행");
				}
			};
			threadA.start(); // start() 가 없으면 thread 가 실행이 안 됨
		}
		
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " 실행");
			}
		};
		chatThread.setName("chat-thread"); // 이름 설정! 원래는 자동으로 'Thread-n' 이라는 이름을 부여함.
		chatThread.start();
	}
}

