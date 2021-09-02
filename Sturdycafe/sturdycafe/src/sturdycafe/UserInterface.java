package sturdycafe;
import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInterface {
	public static void main(String[] args) {
		boolean play = true;	//while���� Ż���ϱ� ���� boolean type ����
		//1. �մ����� ���������� Ȯ���ϰ� �Է¹޴´�.
		String checkMsg = "1. �մ�\n"
				+ "2. ������\n"
				+ "��ȣ�� �Է��ϼ��� : ";
		int choiceWho = 0;	// ���� Ȯ��
		//2-1. ����ڰ� ������ ��带 �����ϸ� �����ְ� �Է¹޴´�.
		String managerMsg = "1. �� �����ϱ�\n"
				+ "2. �� �����ϱ�\n"
				+ "3. *�ο� �� �� ã��\n"
				+ "4.����\n��ȣ�� �Է��ϼ��� : ";	
		int managerChoice = 0;
		// �� �ο��� ������ ������ �����ְ� �Է¹޴´�.
		String roomNumMsg = "1. 1�ο� 2. 4�ο� 3. 6�ο�\n"
				+ "��ȣ�� �Է��ϼ��� : ";
		int roomNum = 0;	//�ο� ���� �Է¹ޱ� ���� ����
		// �����ڰ� �� ������ �����ϸ� �� �� ��(1�ο�:100~/4�ο�:400~/6�ο�:600~)�� ������ ������ �����ְ� �Է¹޴´�.
		String deleteMsg = "������ ���� ȣ���� �Է��ϼ��� : ";
		int deleteRoom = 0;	//������ �� ��ȣ
		
		//2-2. ����ڰ� �մ� ��带 �����ϸ� �����ְ� �Է¹޴´�.
		String customerMsg = "1. üũ��\n2. üũ�ƿ�\n��ȣ�� �Է��ϼ��� : ";
		int check = 0;
		
		//�մ��� üũ���� ������ ���,
		String roomChoiceMsg = "üũ�� �� ���� ȣ���� �Է��ϼ��� : ";
		int roomChoice = 0;
		String nameMsg = "������ �̸� : ";
		String phonenumMsg = "������ ��ȭ��ȣ : ";
		String name = null;
		String phonenum = null;
		
		//�մ��� üũ�ƿ��� ������ ���,
		String roomOutMsg = "üũ�ƿ� �� ���� ȣ���� �Է��ϼ��� : ";
		String checkOutMsg = "üũ�� �ÿ� �Է��ߴ� ��ȭ��ȣ�� �Է��ϼ��� : ";
		
		//����ڰ� �־��� ���� �ܸ� �Է����� ��� �������� �޼���
		String wrongMsg = "�߸� �����̽��ϴ�.\n";
				
		Scanner scan = new Scanner(System.in);
		Manager manager = new Manager();

		//2. 1���� �Է��ϸ� �մԿ� ����¹���, 2���� �Է��ϸ� �����ڿ� ����¹��� �����ش�.
		//���� ����ڰ� 1,2 �� ���ڸ� �Է��ϸ� "�߸� �����̽��ϴ�." �� �Բ� ó������ �̵��Ѵ�.
		while(play) {
			System.out.println(checkMsg);
			choiceWho = scan.nextInt();
			
			switch(choiceWho) {
			case 1 :	//�մԿ�
				System.out.println(customerMsg);
				check = scan.nextInt();
	
				switch(check) {
				case 1:	//üũ��
					try {
						System.out.println(roomNumMsg);
						roomNum = scan.nextInt();
						System.out.println(roomChoiceMsg);
						roomChoice = scan.nextInt();
						System.out.println(nameMsg);
						name = scan.next();
						System.out.println(phonenumMsg);
						phonenum = scan.next();
						manager.checkIn(roomNum, roomChoice, name, phonenum);
						if(manager.checkIn(roomNum, roomChoice, name, phonenum) == false) {
							System.out.println("üũ���� �Ұ����մϴ�.");
						}
						else if(roomNum == 1) {System.out.println(manager.roomFor1[roomChoice-100].checkInTime+"�� üũ�� �ϼ̽��ϴ�.");}
						else if(roomNum == 2) {System.out.println(manager.roomFor4[roomChoice-400].checkInTime+"�� üũ�� �ϼ̽��ϴ�.");}
						else if(roomNum == 3) {System.out.println(manager.roomFor6[roomChoice-600].checkInTime+"�� üũ�� �ϼ̽��ϴ�.");}
					}catch(NullPointerException n) {
						System.out.println("üũ���� �Ұ����մϴ�.");
					}
					break;
				case 2: //üũ�ƿ�
					System.out.println(roomNumMsg);
					roomNum = scan.nextInt();
					System.out.println(roomOutMsg);
					roomChoice = scan.nextInt();
					System.out.println(checkOutMsg);
					phonenum = scan.next();
					break;
				default :
					break;
				}
				break;	
			case 2:		//�����ڿ�
				System.out.println(managerMsg);
				managerChoice = scan.nextInt();
				
				switch(managerChoice) {
				case 1 :	//���߰�
					System.out.println(roomNumMsg);
					roomNum = scan.nextInt();
					manager.plusRoom(roomNum);
					break;
				case 2 :	//�����
					try {
						System.out.println(roomNumMsg);
						roomNum = scan.nextInt();
						System.out.println(deleteMsg);
						deleteRoom = scan.nextInt();
						manager.deleteRoom(roomNum, deleteRoom);
					}catch(RuntimeException e) {
						System.out.println("���� �������� �ʾҽ��ϴ�.");
					}
					break;
				case 3:	//��溸��
					System.out.println(roomNumMsg);
					roomNum = scan.nextInt();
					
					if(manager.findEmptyRoom(roomNum) == null) { System.out.println(wrongMsg); }
					else { System.out.println("����ִ� �� : "+manager.findEmptyRoom(roomNum)); }
					
					break;
				case 4:	//����
					play = false;
					break;
				default :
					System.out.println(wrongMsg);
					break;
				}				
				break;
			default :
				System.out.println(wrongMsg);
				break;
			}
		}
	}
}


