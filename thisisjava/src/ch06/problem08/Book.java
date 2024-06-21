package ch06.problem08;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book(int bookNo, String title, String author, int stateCode) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = stateCode;
	}
	
	public Book(int bookNo, String title, String author) {
		this(bookNo, title, author, 1);
	}

	//getter setter
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	public void rent() {
		if(this.getStateCode() == 1) {
			System.out.println(this.title + "이(가) 대여 됐습니다.");
			this.setStateCode(0);
		}else {
			System.out.println("책의 재고가 부족합니다.");
		}
	}
	
	public void back(int num) {
		
		if(this.getStateCode() == 1) {
			System.out.println("이미 반납완료된 책입니다.");
		}else {
			System.out.println(this.title + " 반납완료!");
			this.setStateCode(1);
		}
	}
	
	public void print() {
		System.out.printf("%d 책제목 : %s, 저자 : %s, 대여유무 : %s", this.getBookNo(), this.getTitle(),
				this.getAuthor(), this.getStateCode() == 1 ? "재고있음" : "대여중");
		System.out.println();
	}

//	private int bookNo;
//	private String title;
//	private String author;
//	private int stateCode;
//
//	public int getBookNo() {
//		return bookNo;
//	}
//
//	public void setBookNo(int bookNo) {
//		this.bookNo = bookNo;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//
//	public int getStateCode() {
//		return stateCode;
//	}
//
//	public void setStateCode(int stateCode) {
//		this.stateCode = stateCode;
//	}
//
//	public Book() {
//		super();
//	}
//
//	public Book(int bookNo, String title, String author, int stateCode) {
//		super();
//		this.bookNo = bookNo;
//		this.title = title;
//		this.author = author;
//		this.stateCode = stateCode;
//	}
//
//	public Book(int bookNo, String title, String author) {
//		this(bookNo,title,author,1);
//	}
//
//	public void rent() {
//		this.stateCode = 0;
//		System.out.println(this.getTitle() + "이(가) 대여 됐습니다");
//	}
//
//	public void print() {
//		String temp = "";
//		temp += this.bookNo;
//		temp += " 책제목 : " + this.title ;
//		temp += " 저자 : " + this.author ;
//		temp += " 대여 유무 : " +( (this.stateCode==1) ? "재고 있음":"대여중" );
//		System.out.println( temp );
//	}

}
