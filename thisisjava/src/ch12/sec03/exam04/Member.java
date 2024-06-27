package ch12.sec03.exam04;

// JDK 14 ~ 
public record Member(String id, String name, int age) {
	
	// # 선언된 레코드 소스를 컴파일하면, 변수의 타입과 이름을 이용해서
	// - private final field가 자동생성
	// - 생성자 및 Getter 메소드 자동으로 추가
	// - hashCode(), equal(), toString() 메소드를 재정의한 코드 자동 추가
}
