package ch06.problem07;

public class Account {
	// field
	private String accountNo;
	private int balance;

	// 생성자 작성
	public Account(String accountNo) {
		this.accountNo = accountNo;
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

}
