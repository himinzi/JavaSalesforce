package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5); // 한꺼번에 대기 탈 수 있는 최대 수 
		//작업 처리 코드...
		System.out.println("...");
		executorService.shutdownNow();
	}
}

