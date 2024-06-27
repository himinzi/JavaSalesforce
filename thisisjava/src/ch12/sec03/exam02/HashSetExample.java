package ch12.sec03.exam02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet(); 
		// 동일 객체를 중복 저장하지 않음. 
		
		
		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1);
		System.out.println("저장된 객체수: " + hashSet.size());
		
		
		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2);
		System.out.println("저장된 객체수: " + hashSet.size());
		
		
		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3);
		System.out.println("저장된 객체수: " + hashSet.size());
		
		Object obj = new Object();
		System.out.println(obj.toString()); // class 명 + @ + 주소값
		// toString() 메소드 안 넣어도 같은 결과가 나옴!
	}
}