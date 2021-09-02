package account;

public class Account {
	private String accountNo;		// 계좌번호
	private String ownerName;		// 예금주 이름
	private int balance;			// 잔고
	
	Account(String accountNo, String ownerName, int balance) {	// 생성자
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public String getAccountNo()	// 계좌번호 조회
	{
		return accountNo;
	}
	public void setAccountNo(String accountNo)	// 계좌번호 변경
	{
		this.accountNo = accountNo;
	}
	public String getOwnerName()	// 예금주 이름 조회
	{
		return ownerName;
	}
	public void setOwnerName(String ownerName)	// 예금주 이름 변경
	{
		this.ownerName = ownerName;
	}
	public int getBalance()	// 잔고 조회
	{
		return balance;
	}
	public void setBalance(int balance) {	// 잔고 변경
		this.balance = balance;
	}
	
	public int balanceInfo() {	// 사용자가 잔고를 알 수 있도록 구현하는 메소드 선언
		// System.out.println("현재 잔고는 "+balance+"원입니다.");
		return balance;
	}
	
	public void deposit (int amount) {		// "저금한다" 기능을 구현하는 메소드 선언
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception {		// "인출한다" 기능을 구현하는 메소드 선언
		if (balance < amount) 
			throw new Exception("잔액이 부족합니다.");
		balance -= amount;
		return balance;
	}	
	
}
