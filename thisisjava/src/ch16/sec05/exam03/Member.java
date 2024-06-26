package ch16.sec05.exam03;

public class Member {
	private String id;
	private String name;
	
	public Member(String id) {
		this.id = id;
		System.out.println("Member(String id)");
	}
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Member(String id, String name)");
	}
	
	@Override
	public String toString() { 
		// Object 의 toString 메소드 Overriding => 원래는 hashCode 로 나옴
		String info = "{ id: " + id + ", name: " + name + " }";
		return info;		
	}
}
