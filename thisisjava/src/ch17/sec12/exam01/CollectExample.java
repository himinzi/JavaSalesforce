package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("감자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));
		
		//남학생들만 묶어 List 생성
		/*List<Student> maleList = totalList.stream()
				.filter(s->s.getSex().equals("남"))
				.collect(Collectors.toList());*/
		List<Student> maleList = totalList.stream()
				.filter(s->s.getSex().equals("남"))
				.toList();
		
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		//학생 이름을 key 로 Student 객체를 value 으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
				.collect(
					Collectors.toMap(
						s -> s.getName(),  //Student 객체에서 키가 될 부분 리턴
						s -> s.getScore()   //Student 객체에서 값이 될 부분 리턴
					)
				);
		
		System.out.println(map.toString()); // Map 출력결과 => {오해영=93, 홍길동=92, 감자바=95, 김수영=87}
		//Map 인터페이스의 구현체(대표적으로 HashMap 등)에서 toString을 호출하면 
		//내부적으로 Map 을 탐색하는 Iterator 를 만들어 각 Entry 를 key=value 형식의 문자열로 변환
	}
}
