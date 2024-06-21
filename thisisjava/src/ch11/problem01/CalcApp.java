package ch11.problem01;

import java.util.Arrays;
import java.util.Scanner;

public class CalcApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.print(">> ");
			String val = sc.nextLine();
			
			if(val.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}
			
			// val 값
			String[] x = val.split(" ");
			int k1 = Integer.parseInt(x[0]);
			int k2 = Integer.parseInt(x[2]);
			String sign = x[1];
			

			switch(sign) {
			case "+" : Add a = new Add(); a.setValue(k1, k2); a.calculate(); break;
			case "-" : Sub b = new Sub(); b.setValue(k1, k2); b.calculate(); break;
			case "*" : Mul m = new Mul(); m.setValue(k1, k2); m.calculate(); break;
			case "/" : Div v = new Div(); v.setValue(k1, k2); v.calculate(); break;
			default : System.out.println("알 수 없는 연산입니다.");
			}
		}
	}
}
