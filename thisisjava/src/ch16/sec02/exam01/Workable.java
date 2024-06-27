package ch16.sec02.exam01;

// 인터페이스가 단 하나의 추상 메소드를 가지는 것을 함수형 인터페이스라고 한다.
// 그걸 람다식으로 줄여서 쓸 수 있는 것이다.
@FunctionalInterface
public interface Workable {
	void work();
}

