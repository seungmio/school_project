package sturdycafe;

public class Room {
	//�迭�� room ��ü�� ������ �� ����ִ� �¼��� true ���� �������� �����Ѵ�.
	boolean isEmpty = true;
	// 1�ο� 100����, 4�ο� 400����, 6�ο� 600����
	int numOfRoom = 0;	//�� ��ȣ 
	boolean isDelete = true;	//������ ��:false, �������� ���� ��:true
	//�մ� �̸�, ��ȭ��ȣ, �� ��ȣ
	String name = null;
	String phonenum = null;
	int roomChoice = 0;
	//üũ�� �ð�
	String checkInTime;
	//üũ�ƿ� �ð�
	String checkOutTime;
	
	Room() {;}
	
	//���� �⺻ ���� : �� ����(������� or ��������� ����/������ or �������� ����), �� ��ȣ 
	Room(boolean isEmpty, boolean isDelete, int numOfRoom, int roomChoice, String name, String phonenum, String checkInTime) { 
		this.isDelete = isDelete; 
		this.isEmpty = isEmpty;
		this.numOfRoom = numOfRoom;
		this.roomChoice = roomChoice;
		this.name = name;
		this.phonenum = phonenum;
		this.checkInTime = checkInTime;
	}
	 //üũ��, üũ�ƿ� ������
//	Room(boolean isEmpty, int roomChoice, String name, String phonenum, String checkInTime) {	//�� ����, �� ��ȣ, �̸�, ��ȭ��ȣ
//		this.isEmpty = isEmpty;
//		this.roomChoice = roomChoice;
//		this.name = name;
//		this.phonenum = phonenum;
//		this.checkInTime = checkInTime;
//	}
}
