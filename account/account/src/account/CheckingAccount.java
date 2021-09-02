package account;

// 직불 계좌 클래스
public class CheckingAccount extends Account {	
	String cardNo;	// 카드번호
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);	// Account 클래스 생성자 호출
		this.cardNo = cardNo;
	}
	// 카드 번호 오류 혹은 출금하려는 돈이 잔고보다 많은 경우
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo) || (getBalance() < amount))
			throw new Exception("지불이 불가능합니다.");
		return withdraw(amount);
	}
}
