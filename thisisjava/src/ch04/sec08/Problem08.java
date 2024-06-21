package ch04.sec08;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args) {

		boolean run = true;
		int money = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {

			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");

			System.out.print("선택>");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				System.out.print("예금액>");
				int in = Integer.parseInt(sc.nextLine());
				money += in;
			} else if (menu == 2) {
				System.out.print("출금액>");
				int out = Integer.parseInt(sc.nextLine());
				if (money - out < 0) {
					System.out.println("출금액이 예금액을 초과합니다.");
				} else {
					money -= out;
				}

			} else if (menu == 3) {
				System.out.println("잔고액>" + money);
			} else if (menu == 4) {
				run = false;
			} else {
				System.out.println("다시입력해주세요");
			}

		} // end of while

		System.out.println("프로그램 종료");
	}

}
