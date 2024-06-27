package ch15.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Goods> gList = new ArrayList<>();

		System.out.println("상품 3개를 입력해주세요.");
		for(int i = 0; i < 3; i++) {
			String[] prod = sc.nextLine().split(" ");
			gList.add(new Goods(prod[0], Integer.parseInt(prod[1]), Integer.parseInt(prod[2])));
			
		}
		
		int cnt = 0;
		for(Goods g: gList) {
			g.print();
			cnt += g.getCnt();
		}
//		
//		콜라 1000 10
//		사이다 900 40
//		맥주 2000 200
		
		System.out.println("모든 상품의 갯수는 "+ cnt + "개 입니다.");
		
		sc.close(); // 안 써도 자동으로 되지만(by garbage collector), 써주면 조움 ㅎㅎㅎ
	}
}
