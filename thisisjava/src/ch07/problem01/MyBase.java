package ch07.problem01;

public class MyBase extends Base {

	// 코드작성

	@Override
	public void service(String state) {

		if (state.equals("낮")) {
			day();
		} else if (state.equals("오후")) {
			afternoon();
		} else {
			night();
		}
	}

	@Override
	public void day() {
		System.out.println("낮에는 열심히 일하자");
	}

	@Override
	public void night() {
		System.out.println("night");
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}

}