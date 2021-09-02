package account;

public class Account {
	private String accountNo;		// ���¹�ȣ
	private String ownerName;		// ������ �̸�
	private int balance;			// �ܰ�
	
	Account(String accountNo, String ownerName, int balance) {	// ������
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public String getAccountNo()	// ���¹�ȣ ��ȸ
	{
		return accountNo;
	}
	public void setAccountNo(String accountNo)	// ���¹�ȣ ����
	{
		this.accountNo = accountNo;
	}
	public String getOwnerName()	// ������ �̸� ��ȸ
	{
		return ownerName;
	}
	public void setOwnerName(String ownerName)	// ������ �̸� ����
	{
		this.ownerName = ownerName;
	}
	public int getBalance()	// �ܰ� ��ȸ
	{
		return balance;
	}
	public void setBalance(int balance) {	// �ܰ� ����
		this.balance = balance;
	}
	
	public int balanceInfo() {	// ����ڰ� �ܰ� �� �� �ֵ��� �����ϴ� �޼ҵ� ����
		// System.out.println("���� �ܰ�� "+balance+"���Դϴ�.");
		return balance;
	}
	
	public void deposit (int amount) {		// "�����Ѵ�" ����� �����ϴ� �޼ҵ� ����
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception {		// "�����Ѵ�" ����� �����ϴ� �޼ҵ� ����
		if (balance < amount) 
			throw new Exception("�ܾ��� �����մϴ�.");
		balance -= amount;
		return balance;
	}	
	
}
