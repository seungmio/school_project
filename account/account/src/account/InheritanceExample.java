package account;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InheritanceExample {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		int money;	// ����ڰ� �Է��� ��
		boolean play = true;	// ���α׷� ���Ḧ �����Ű�� ���� ����
		String cardNum;	// ����ڰ� �Է��� ī���ȣ
			
		// ���¹�ȣ, ������ �̸�, �ܰ�, ī���ȣ ��ü ����
		CheckingAccount obj = new CheckingAccount("000-11-111111", "�輱��", 10000, "111-222");
		int choice;
		
		while(play) {
			
			try {
				System.out.println("�ش� ��ȣ�� ��������");
				System.out.println("1.����\n2.����\n3.ī�� ����\n4.����");
				choice = scan.nextInt();
				
				switch(choice) {
				case 1 :
					System.out.println("���ݾ� : ");
					money = scan.nextInt();
					obj.deposit(money);
					System.out.println("�ܰ�� "+obj.balanceInfo()+" �Դϴ�.");
					break;
			
				case 2 :
					try {
						System.out.println("����� : ");
						money = scan.nextInt();
						obj.withdraw(money);
						System.out.println("�ܰ�� "+obj.balanceInfo()+" �Դϴ�.");
					}
					catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
			
				case 3 :
					try {
						System.out.println("ī�� ��ȣ : ");
						cardNum = scan.next();
						System.out.println("ī�� ���Ҿ� : ");
						money = scan.nextInt();
						obj.pay(cardNum, money);
						System.out.println("�ܰ�� "+obj.balanceInfo()+" �Դϴ�.");
					}
					catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
			
				case 4 :
					System.out.println("���α׷� ����");
					play = false;
					break;
				
				default :
					System.out.println("�߸� �����̽��ϴ�.");
					break;
				}	
			}


			catch(InputMismatchException ime) {
				System.out.println("�߸� �����̽��ϴ�.");
				scan.next();
				choice = 0;
				}
			}
		}
}

