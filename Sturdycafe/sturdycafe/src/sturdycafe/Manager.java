package sturdycafe;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.management.RuntimeErrorException;

public class Manager{
	//�����ڰ� 1.���߰� 2.����� 3.*�ο� �� �� ã�� 4.���� �� �ϳ��� �������� ��, ����ϴ� �޼ҵ带 �����Ѵ�.
	//�����ڰ� ���Ḧ �����ϱ� ������ �ݺ��Ѵ�.
	Room[] roomFor1 = new Room[100];	//1�ο� �� �迭
	Room[] roomFor4 = new Room[100];	//4�ο� �� �迭
	Room[] roomFor6 = new Room[100];	//6�ο� �� �迭
	int lengthOfroomFor1 = 0;
	int lengthOfroomFor4 = 0;
	int lengthOfroomFor6 = 0;
	
	//���� üũ�� �ð�
	SimpleDateFormat checkin = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
	String checkInTime = checkin.format(System.currentTimeMillis());
	
	//���� üũ�ƿ� �ð�
	SimpleDateFormat checkout = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
	String checkOutTime = checkout.format(System.currentTimeMillis());
	
	//�ܰ� ����
	int unitPrice = 0;
	
	//�� �߰� �޼ҵ� ����
	void plusRoom(int roomNum) {
		switch(roomNum) {
		//����ִ� �¼��� true ���� ������.
		case 1://1�ο�, �� ��ȣ : 100~
			roomFor1[lengthOfroomFor1] = new Room(true, true, 100+lengthOfroomFor1, 0, null, null, null);
			lengthOfroomFor1++;			
			break;
		case 2:	//4�ο�, �� ��ȣ : 400~
			roomFor4[lengthOfroomFor4] = new Room(true, true, 400+lengthOfroomFor4, 0, null, null, null);
			lengthOfroomFor4++;
			break;
		case 3:	//6�ο�, �� ��ȣ : 600~
			roomFor6[lengthOfroomFor6] = new Room(true, true, 600+lengthOfroomFor6, 0, null, null, null);
			lengthOfroomFor6++;
			break;
		default:
			return;
		}
	}
	
	//�� ���� �޼ҵ� ����
	void deleteRoom(int roomNum, int deleteRoom) {
		switch(roomNum) {
		case 1:	//1�ο� �� ������ �¼�
			if (lengthOfroomFor1 == 0) { throw new RuntimeException(); }	//���� �������� �ʾ��� ��� RuntimeException�� �߻���Ų��.
			for(int i = 0; i < lengthOfroomFor1; i++) {	//����ִ� ������ �˻��Ѵ�.
				if(roomFor1[i].isEmpty == true) { 
					roomFor1[deleteRoom-100].isDelete = false;
					roomFor1[deleteRoom-100].isEmpty = false;
				}
			}
			break;
		case 2:	//4�ο� �� ������ �¼�
			if (lengthOfroomFor4 == 0) { throw new RuntimeException(); }
			for (int i = 0; i < lengthOfroomFor4; i++) {
				if(roomFor4[i].isEmpty == true) { 
					roomFor4[deleteRoom-400].isDelete = false;
					roomFor4[deleteRoom-100].isEmpty = false;
				}
			}
			break;
		case 3:	//6�ο� �� ������ �¼�
			if (lengthOfroomFor6 == 0) { throw new RuntimeException(); }
			for (int i = 0; i < lengthOfroomFor6; i++) {
				if(roomFor6[i].isEmpty == true) { 
					roomFor6[deleteRoom-600].isDelete = false; 
					roomFor6[deleteRoom-100].isEmpty = false;
				}
			}
			break;
		default :
			break;
		}
	}
	
	//����ִ� �� ã�� �޼ҵ� ����
	String findEmptyRoom(int roomNum) {	
		//����ִ� �¼��̰� �������� ���� �¼��̸� ������ �� �� ��ü�� �� ���� ��ȣ�� ���� �ǰ�
		//result�� ����ִ� �� ��ȣ�� �ϳ��� ���� �ȴ�.
		String result = "";
		switch(roomNum) {	//�� �ο� �濡 �ִ� �� �¼��� �� ������ �Է¹޴´�.
		case 1:	//1�ο� �� �¼�
			int[] emptyRoomFor1 = new int[lengthOfroomFor1];
			for (int i = 0; i < lengthOfroomFor1; i++) {
				if(roomFor1[i].isEmpty == true) {
					if(roomFor1[i].isDelete == true) { 
						emptyRoomFor1[i] = roomFor1[i].numOfRoom;
						result += emptyRoomFor1[i]+"�� �� ";
					}
				}
			}
			return result;
		case 2:	//4�ο� �� �¼�
			int[] emptyRoomFor4 = new int[lengthOfroomFor4];
			for (int i = 0; i < lengthOfroomFor4; i++) {
				if(roomFor4[i].isEmpty == true) {
					if(roomFor4[i].isDelete == true) { 
						emptyRoomFor4[i] = roomFor4[i].numOfRoom; 
						result += emptyRoomFor4[i]+"�� �� ";
					}
				}
			}
			return result;
		case 3:	//6�ο� �� �¼�
			int[] emptyRoomFor6 = new int[lengthOfroomFor6];
			for (int i = 0; i < lengthOfroomFor6; i++) {
				if(roomFor6[i].isEmpty == true) {
					if(roomFor6[i].isDelete == true) { 
						emptyRoomFor6[i] = roomFor6[i].numOfRoom;
						result += emptyRoomFor6[i]+"�� �� ";
					}
				}
			}
			return result;
		default:
			return null;
		}
	}
	
	//üũ�� �޼ҵ�
	boolean checkIn(int roomNum, int roomChoice, String name, String phonenum) {	//�ο�,��,�̸�,��ȭ��ȣ�� main���� �Է¹޴´�.
		boolean result = false;
		
		switch(roomNum) {
		case 1:
			if(roomFor1[roomChoice-100] == null) {throw new NullPointerException();}
				if(roomFor1[roomChoice - 100].isEmpty == true) {
						roomFor1[roomChoice - 100].isEmpty = false;
						roomFor1[roomChoice - 100].name = name;
						roomFor1[roomChoice - 100].phonenum = phonenum;
						roomFor1[roomChoice - 100].roomChoice = roomChoice;
						result = true;
				}
			break;
		case 2:
			if(roomFor4[roomChoice-400] == null) {throw new NullPointerException();}
			for (int i = 0; i < lengthOfroomFor4; i++) {
				if(roomFor4[roomChoice - 400].numOfRoom == roomChoice) {
					if(roomFor4[roomChoice - 400].isDelete == true) {
						if(roomFor4[roomChoice - 400].isEmpty == true) {
							roomFor4[roomChoice - 400].isEmpty = false;
							roomFor4[roomChoice - 400].name = name;
							roomFor4[roomChoice - 400].phonenum = phonenum;
							roomFor4[roomChoice - 400].roomChoice = roomChoice;
							result = true;
						}
					}
				}
			}
			break;
		case 3:
			if(roomFor6[roomChoice-600] == null) {throw new NullPointerException();}
			for (int i = 0; i < lengthOfroomFor6; i++) {
				if(roomFor6[roomChoice - 600].numOfRoom == roomChoice) {
					if(roomFor6[roomChoice - 600].isDelete == true) {
						if(roomFor6[roomChoice - 600].isEmpty == true) {
							roomFor6[roomChoice - 600].isEmpty = false;
							roomFor6[roomChoice - 600].name = name;
							roomFor6[roomChoice - 600].phonenum = phonenum;
							roomFor6[roomChoice - 600].roomChoice = roomChoice;
							result = true;
						}
					}
				}
			}
			break;
		default:
			return result;
		}
		return result;
	}
	
}

