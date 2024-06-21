package ch06.problem06;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요 (이름 전화번호 학교)");
		
		// 친구정보 입력받기
		Friend friend;
		
		for (int i = 0; i < 3; i++) {
			// Friend 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
			friend = new Friend(); 
			
			// 할때마다 새로운 객체를 생성해야 제대로된 값이 들어감! 
			// 같은 객체에 넣어주게 되면 그 객체의 값이 계속 바뀌기때문에 나중에 출력했을 때 이상한 값이 나옴!!
			String info = sc.nextLine();
			
			// 입력받은 친구정보를 공백으로 분리 String 클래스에 split(" ") -> array
			String[] realInfo = info.split(" ");
			friend.setName(realInfo[0]);
			friend.setHp(realInfo[1]);
			friend.setSchool(realInfo[2]);
			
			// 배열에 추가하기 ( friendArray <- friend객체 )
			friendArray[i] = friend;
//			System.out.print(friendArray[i].getName() + " ");
//			System.out.print(friendArray[i].getHp() + " ");
//			System.out.print(friendArray[i].getSchool() + " ");
			
			if(i==2) {
				// 친구정보 출력
				friend.showInfo(friendArray);
			}
		}

		sc.close();
		
//		Friend[] friendArray = new Friend[3];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("친구를 3명 등록해 주세요");
//
//		for (int i = 0; i < friendArray.length; i++) {
//			// 친구정보 입력받기
//			String temp = sc.nextLine();
//
//			// 입력받은 친구정보를 공백으로 분리 String 클래스에 split(" ") -> array
//			String[] tempArr = temp.split(" ");
//
//			// Friend 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
//			Friend f = new Friend(tempArr[0], tempArr[1], tempArr[2]);
//
//			// 배열에 추가하기 ( friendArray <- friend객체 )
//			friendArray[i] = f;
//		}
//
//		// 친구정보 출력
//		for (int i = 0; i < friendArray.length; i++) {
//			// 친구정보 출력 메소드 호출
//			friendArray[i].showInfo();
//		}
//
//		sc.close();
	}

}
