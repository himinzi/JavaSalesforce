package ch12.sec05;

public class StringBuilderExample {
	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		System.out.println(data);
		
		String d = new StringBuilder().append("d").replace(0,1, "Dk").insert(2,"ddkk").toString();
		System.out.println(d);
	}
}
