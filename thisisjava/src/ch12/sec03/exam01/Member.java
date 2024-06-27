package ch12.sec03.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	//Override 메소드 자체를 지워버리면, 둘 다 동등하지 않다고 나옴!
	@Override // Object(: 주소 equals) 로 부터 overriding 했음. 
	public boolean equals(Object obj) { 
		// Object 는 최상위. 모든 객체가 들어갈 수 있음. 
		if(obj instanceof Member target) {
			if(id.equals(target.id)) { 
				// id 는 String class 의 id => String 의 equals 가 됨!
				return true;
			}
		}
		return false;
	}
}
