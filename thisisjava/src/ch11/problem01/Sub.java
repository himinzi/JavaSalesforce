package ch11.problem01;

public class Sub {
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		System.out.println(">> " + (this.a-this.b));
		return a-b; 
	};
}
