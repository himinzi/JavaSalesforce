package ch18.sec08;

import java.io.*;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		// DataOutputStream 생성
		FileOutputStream fos = new FileOutputStream(
				"C:/Users/User/git/JavaSalesforce/thisisjava/src/ch18/sec08/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);

		// 기본 타입 출력
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);

		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);

		dos.flush();
		dos.close();
		fos.close();

		// DataInputStream 생성
		FileInputStream fis = new FileInputStream(
				"C:/Users/User/git/JavaSalesforce/thisisjava/src/ch18/sec08/primitive.db");
		DataInputStream dis = new DataInputStream(fis);

		// 기본 타입 입력
		// => 데이터 타입의 크기가 모두 다름 -> DataOutputStream 으로 출력한 데이터를 다시 DataInputStream 으로
		// 읽어올 때는
		// 출력한 순서와 동일한 순서로 읽어야 함
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}

		dis.close();
		fis.close();
	}
}
