package ch06.problem02;

public class Base {
	
	public void service(String state) {
		// 코드작성
//		if(state.equals("밤")) {
//			night();
//		}else if(state.equals("낮")) {
//			day();
//		}else {
//			afternoon();
//		}
		
		switch(state) {
		case "밤" : night(); break;
		case "낮" : day(); break;
		default : afternoon();
		}
	}

	public void day() {
		System.out.println("낮에는 열심히 일하자");
	}

	public void night() {
		// 코드작성
		System.out.println("night");
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}

}
