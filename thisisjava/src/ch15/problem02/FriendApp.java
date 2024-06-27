package ch15.problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		List<Friend> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

//		String d = "gg dd d".split(" ")[0];
//		System.out.println(d);

		System.out.println("친구를 3명 등록해주세요!");
		for (int i = 0; i < 3; i++) {
			String info = sc.nextLine();
			list.add(new Friend(info.split(" ")[0], info.split(" ")[1], info.split(" ")[2]));
		}

		for (int i = 0; i < list.size(); i++) {
			Friend f = list.get(i);
			f.showInfo();
		}
		
//		for(Friend f:list) {
//			f.showInfo();
//		}

	}

}
