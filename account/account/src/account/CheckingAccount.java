package account;

// ���� ���� Ŭ����
public class CheckingAccount extends Account {	
	String cardNo;	// ī���ȣ
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);	// Account Ŭ���� ������ ȣ��
		this.cardNo = cardNo;
	}
	// ī�� ��ȣ ���� Ȥ�� ����Ϸ��� ���� �ܰ��� ���� ���
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo) || (getBalance() < amount))
			throw new Exception("������ �Ұ����մϴ�.");
		return withdraw(amount);
	}
}
