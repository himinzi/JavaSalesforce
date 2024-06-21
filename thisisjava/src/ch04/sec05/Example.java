package ch04.sec05;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
//		for(int i=1; i<=100; i++) {
//			if(i%5 == 0 && i%7 == 0) {
//				System.out.println(i);
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		String num = sc.nextLine();
//		
////		for(int i=1; i<=Integer.parseInt(num); i++) {
////			for(int j=1; j<=i; j++) {
////				System.out.print(i);
////			}
////			System.out.println();
////		}
//		
//		for(int i=Integer.parseInt(num); i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%d*%d=%d\t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=9; i++) {
//			for(int j=2; j<=9; j++) {
//				System.out.printf("%d*%d=%d\t", j, i, i*j);
//			}
//			System.out.println();
//		}
//		
		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요.");
//		
//		int max = 0;
//		
//		for(int i=0; i<=4; i++) {
//			System.out.print("숫자: ");
//			int num = sc.nextInt();
//			if(num-max > 0) {
//				max = num;
//			}
//		}
//		System.out.println("최대값은 " + max + "입니다.");
//		for(int i=0; i<10; i++) {
//			for(int j=1; j<=10; j++) {
//				System.out.print(i+j+"\t");
//			}
//			System.out.println();
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요");
//		
//		int num = sc.nextInt();
//		int sum = 0;
//		int i;
//		
//		if(num%2==0) {
//			i = 0;
//		}else {
//			i = 1;
//		}
//		
//		for(; i<=num; i=i+2) {
//			sum += i;
//		}
//		System.out.println("결과값 : " + sum);
		
		///////////////////////////////////////////
		
		int random = (int)(Math.random()*100)+1;
		System.out.println(random);
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		System.out.println("=================");
		System.out.println("[숫자맞추기게임 시작]");
		System.out.println("=================");
		
		while(run) {
			System.out.print(">>");
			int num = Integer.parseInt(sc.nextLine());
			if(random > num) {
				System.out.println("더 높게");
			}else if(random < num) {
				System.out.println("더 낮게");
			}else if(random == num) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				String end = sc.nextLine();
				if(end.equals("y")) {
					run = false;
				}
				break;
			}
		}
		System.out.println("=================");
		System.out.println("[숫자맞추기게임 종료]");
		System.out.println("=================");
		
		
		
	}// end of main
	
}

