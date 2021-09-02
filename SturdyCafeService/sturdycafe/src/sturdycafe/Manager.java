package sturdycafe;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Manager {
	//room ������
	private Room[] roomArray = new Room[100];	//�� ��ü
	private int roomsNum = 0;	//������ ���� ����
	
	//income ������
	Room room = new Room();
	private int income = 0;	//���� ����

	public Room[] getRoomArray() {
		return roomArray;
	}

	public void setRoomArray(Room[] roomArray) {
		this.roomArray = roomArray;
	}

	public int getRoomsNum() {
		return roomsNum;
	}

	public void setRoomsNum(int roomsNum) {
		this.roomsNum = roomsNum;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}
	
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	long checkInTime = System.currentTimeMillis();
	String timeCheckIn = format.format(checkInTime);
	long checkOutTime = System.currentTimeMillis();
	String timeCheckOut = format.format(checkOutTime);
	
	
	//�� �� ã��
	Room[] searchEmptyRoom() {
		Room[] emptyRoom = new Room[100];
		int emptyRoomNum = 0;
		
		for (int i = 0; i < roomsNum; i++) {
			if(!roomArray[i].getRoomFull()) {
				emptyRoom[emptyRoomNum] = roomArray[i];
				emptyRoomNum++;
			}
		}return emptyRoom;
	}
	
	//��� �� ����
	Room[] showRoom() {
		Room[] allRoom = new Room[100];
		int allRoomNum = 0;
		
		for (int i = 0; i < roomsNum; i++) {
			allRoom[allRoomNum] = roomArray[i];
			allRoomNum++;
		}return allRoom;
	}
	
	//�� ����
	void createRoom(int max, String roomName, int unitPrice, boolean isfull) {
		roomArray[roomsNum] = new Room(max, roomName, unitPrice, isfull);
		roomsNum++;
	}
	
	//�� ����
	void deleteRoom(String roomName) throws Exception {
		boolean deleteRoomName = false;
		
		for (int i = 0; i < roomsNum; i++) {
			if(roomName.equals(roomArray[i].getRoomName())) {
				if(!roomArray[i].getRoomFull()) {
					deleteRoomName = true;
					for (int j = i; j < roomsNum; j++) {
						roomArray[i] = roomArray[i+1]; 
					}
					roomsNum--;
				}if(!deleteRoomName) {throw new Exception("Full Room. Choose another room");}
			}
		}
		if(!deleteRoomName) {throw new Exception("There is no "+roomName+" Room");}
	}
	
	//üũ��
	void checkIn(String roomName, String name, String phonenum) throws Exception {
		boolean checkInRoomName = false;

		for (int i = 0; i < roomsNum; i++) {
			if(roomName.equals(roomArray[i].getRoomName())) {
				if(!roomArray[i].getRoomFull()) {
					roomArray[i].getCustomer().setName(name);
					roomArray[i].getCustomer().setPhoneNumber(phonenum);
					roomArray[i].setRoomFull(true);
					room.setCheckInTime(checkInTime);
					checkInRoomName = true;
				}else {
					throw new Exception("Full Room. Choose another room");
				}
			}
		}
		if(!checkInRoomName) { throw new Exception("There is no "+roomName+" Room"); }
	}
	
	
	//üũ�ƿ�
	void checkOut(String roomName) throws Exception {
		boolean checkOutRoomName = false;
		
		for (int i = 0; i < roomsNum; i++) {
			if(roomName.equals(roomArray[i].getRoomName())) {
					roomArray[i].getCustomer().setName(null);
					roomArray[i].getCustomer().setPhoneNumber(null);
					roomArray[i].setRoomFull(false);
					room.setCheckOutTime(checkOutTime);
					checkOutRoomName = true;
			}
		}
		if(!checkOutRoomName) { throw new Exception("There is no "+roomName+" Room"); }
	}
	
	//�ĺ� �ݾ�
	int pay(String roomName) {
		int pay = 0;
		for (int i = 0; i < roomsNum; i++) {
			if(roomName.equals(roomArray[i].getRoomName())) {
				long timeDiffer = (room.getCheckOutTime() - room.getCheckInTime())/3600000;
				pay = (int) (timeDiffer * room.getUnitPrice());
				income += pay;
			}
		}
		return pay;
	}
}
