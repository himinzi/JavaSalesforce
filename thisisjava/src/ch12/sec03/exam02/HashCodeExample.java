package ch12.sec03.exam02;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동"); 

		System.out.println("s1 -> " + s1.getName().hashCode());
		System.out.println("s2 -> " + s2.getName().hashCode());
		
		System.out.println("s1 -> " + s1);
		System.out.println("s2 -> " + s2);
//		두 개체가 같으면 해당 해시 코드가 동일합니다. 그 반대는 사실이 아닙니다.
//		해시 코드가 다르면 개체가 확실히 같지 않습니다.
		// => hasCode method 를 overriding 해서 같게 만들면 두 객체는 같아짐. 
		//객체 해시코드란 객체를 식별하는 하나의 정수값을 말한다. 
		//Object의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴
		// => 객체 마다 다른 값을 가지고 있다. 
		
		
		// 주소 값을 비교하지만, String class 는 같은 값이 들어가면, 
		// JVM 이 같은 객체로 처리 할 수 있음.(항상은 아님. 때에 따라 다름)
		// 그런데 Student 객체는 안에 값이 같아도 다른 객체임.
		if(s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println("동등 객체입니다.");
			} else {
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
			}
		} else {
			System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
		}
	}
}
