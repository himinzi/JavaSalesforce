package ch05.sec10;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
//		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
//		int num = 0;
//		int sum = 0;
//		for(int i=0; i<data.length; i++) {
//			if(data[i]%3 == 0) {
//				num++;
//				sum += data[i];
//			}
//		}
//		
//		System.out.println("주어진 배열에서 3의 배수의 개수=> " + num);
//		System.out.println("주어진 배열에서 3의 배수의 합=> " +sum);

//		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0;
//		
//		for(int i=0; i<5; i++) {
//			num += sc.nextInt();
//		}
//		
//		double avg = (double)num/5;
//		
//		System.out.printf("평균은 %.1f 입니다.", avg);

		/////////////////////////////////////////////////////////////////

//		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l'};
//		
//		String s = "";
//		for(int i=0; i<c.length; i++) {
//			if(c[i] == ' ') {
//				s += ',';
//			}else {
//				s += c[i];
//			}
//		}
//		
//		System.out.println(s);

//		String s = new String(c);
//
//		s = s.replaceAll(",", " ");
//		c = s.toCharArray();
//		System.out.println(s);
//
//		System.out.println(c);

		///////////////////////////////////////////////////////

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("금액: ");
//		
//		int money = sc.nextInt();
//		
//		int[] num = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
//		
////		System.out.println(money/50000);
//		
//		for(int i=0; i<num.length; i++) {
//			System.out.printf("%d원: %d개",num[i], money/num[i]);
//			System.out.println();
//			money -= num[i]*(money/num[i]);
//		}

		///////////////////////////////////////////////////////

		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) { // random 값 넣어주기
			int random = (int) (Math.random() * 6) + 1;

			boolean isNotSelected = true;

//			System.out.println(random);

			// random 값 중복 check
			while (isNotSelected) { 
				for (int j = 0; j < i; j++) {
					if (random == lotto[j] ) { // 같은 값이 나오면 random 다시 돌리고 j 배열 다시 check
						System.out.println("중복값: " + random);
						random = (int) (Math.random() * 6) + 1;
						System.out.println("다시 돌린 값: " + random);
						break;
					} else if(j == i-1) { // 값 추가 후 while 문 빠져나오기
						lotto[i] = random;
						System.out.printf("추가된 값: lotto[%d] : %d \n", i, random);
						isNotSelected = false;
						break;
					}
				} // end of for j
				
				if(i == 0) { // 첫번째 값 정해주기
					System.out.printf("첫번째 값: lotto[%d] : %d \n", i, random);
					lotto[i] = random;
					break;
				}

			} // end of while

		} // end of for i
		
		for(int num:lotto) {
			System.out.print(num +"\t");
		}
		
		
		
		//////////// 교수님 풀이
		
		int[] no = new int[6];
		
		for(int i=0; i<no.length; i++) {
			no[i] = (int)(Math.random()*45)+1;
			
			// 중복검사
			// i 는 현재 입력된 방번호 <-- 중복인지 검사
			// j 비교대상 [0] 부터 순서대로 검사해서 i 이전방까지 검사
			// 비교해서 같은 값 방이 나오면 뒤쪽은 검사하지 않음.
			for(int j=0; j<i; j++) {
				--i;
				break;
			}
			
			for(int j=0; j<no.length; j++) {
				System.out.println(no[j] + " " );
			}
			
		}

		
		
		
		
	}
}
