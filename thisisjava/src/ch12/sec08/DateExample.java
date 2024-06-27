package ch12.sec08;

import java.text.*;
import java.util.*;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date(); // 우리 computer 의 시간과 같음
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now); // 형식화된 format 에 현재 객체를 넣어줘야 됨!
		System.out.println(strNow2);
	}
}

