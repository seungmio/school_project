class MethodExample1 {
	public static void main(String args[]) {
		Account obj1 = new Account("111-222-33333333", "�迵��" , 200000);
		Account obj2 = new Account("555-666-77777777", "������" , 1000000);
		obj1.deposit(1000000);
		obj2.withdraw(200000);
		printAccount(obj1);
		printAccount(obj2);
	}
	
	static void printAccount(Account obj) {
		System.out.println("���¹�ȣ: " + obj.getAccountNo());
		System.out.println("������ �̸�: " + obj.getOwnerName());
		System.out.println("�ܾ�: " + obj.getBalance());
		System.out.println(); 	// �� �ٲ� ���� ���
	}
}