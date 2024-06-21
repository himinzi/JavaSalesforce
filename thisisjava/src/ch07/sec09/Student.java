package ch07.sec09;

public class Student extends Person {
	//필드 선언
	public int studentNo;
	
	//생성자 선언
	public Student(String name, int studentNo) {
		super(name); // 부모 생성자가 매개변수를 필요로 함
		this.studentNo = studentNo;
	}
	
	//메소드 선언
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
