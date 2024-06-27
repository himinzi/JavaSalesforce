package ch18.problem02;

public class Account {
	// field
	private String accountNo;
	private int balance;
	private String time;
	private int inMoney;
	private int outMoney;
	private int money;

	// 생성자 작성
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

	public Account(String time, int inMoney, int outMoney, int money) {
		this.time = time;
		this.inMoney = inMoney;
		this.outMoney = outMoney;
		this.money = money;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getInMoney() {
		return inMoney;
	}

	public void setInMoney(int inMoney) {
		this.inMoney = inMoney;
	}

	public int getOutMoney() {
		return outMoney;
	}

	public void setOutMoney(int outMoney) {
		this.outMoney = outMoney;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBalance() {
		return balance;
	}

	// 필요한 메소드 작성
	// getter setter
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 잔고액
	public void showBalance() {
		System.out.println(balance);
	}
	
	// 예금
	public void deposit(int money) {
		this.balance += money;
	}

	// 출금
	public void withdraw(int money) {
		if (this.balance - money < 0) {
			System.out.println("잔액이 부족합니다.");
		} else {
			this.balance -= money;
		}
	}

	public String getDate() {
		return this.time;
	}

	public void showMoney() {
		System.out.println(balance);
	}

}
