package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Users/User/git/JavaSalesforce/thisisjava/src/ch18/sec02/exam01/test.db");
			
			while(true) {
				int data = is.read();
				if(data == -1) break; // 더 이상 읽을 것이 없을 경우
				System.out.println(data);
			}
			
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

