package ch14.sec05.exam02;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join(); // join() : 일시정지상태
		} catch (InterruptedException e) { 
			// 일시 정지 상태일 경우, InterruptedException 을 발생시켜
			// 실행대기 상태 또는 종료 상태로 만듦.
		}
		System.out.println("1~100 합: " + sumThread.getSum());
	}
}

