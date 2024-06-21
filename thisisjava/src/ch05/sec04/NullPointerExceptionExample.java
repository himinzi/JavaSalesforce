package ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		int[] intArray = null;
//		intArray = new int[5];
		intArray[0] = 10;	 //NullPointerException

		String str = null;
//		str = new String();
		System.out.println("총 문자수: " + str.length() );	  //NullPointerException
//		System.out.println(str.charAt(0));
	}
}



