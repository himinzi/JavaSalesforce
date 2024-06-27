package ch16.sec05.exam01;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		//정적 메소드일 경우
		//람다식
		//person.action((x, y) -> Computer.staticMethod(x, y));		
		//메소드 참조
		person.action(Computer :: staticMethod); 
				// static 메소드 호출법 => 굳이 객체 만들 필요가 없음!!
		
		//인스턴스 메소드일 경우
		Computer com = new Computer();
		//람다식
		//person.action((x, y) -> com.instanceMethod(x, y));		
		//메소드 참조
		person.action(com :: instanceMethod); 
				// instance 메소드 호출법 => 객체를 만들어 줘야 함!!
			
	}
}

