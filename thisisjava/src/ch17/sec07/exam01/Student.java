package ch17.sec07.exam01;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() { return name; }
	public int getScore() { return score; }

	@Override // 구현을 해야만 쓸 수 있음!
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}
}
