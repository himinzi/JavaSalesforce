package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Users/User/git/JavaSalesforce/thisisjava/src/ch18/sec02/exam01/test.db"); // 실제 존재하는 경로 부여
		
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush(); // 출력 버퍼에 잔류하는 모든 바이트를 출력 
			os.close(); // 출력 스트림을 닫고 사용 메모리 해제
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


