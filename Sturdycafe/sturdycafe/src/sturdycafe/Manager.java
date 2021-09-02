package sturdycafe;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.management.RuntimeErrorException;

public class Manager{
	//관리자가 1.방추가 2.방삭제 3.*인용 빈 방 찾기 4.종료 중 하나를 선택했을 시, 기능하는 메소드를 구현한다.
	//관리자가 종료를 선택하기 전까지 반복한다.
	Room[] roomFor1 = new Room[100];	//1인용 방 배열
	Room[] roomFor4 = new Room[100];	//4인용 방 배열
	Room[] roomFor6 = new Room[100];	//6인용 방 배열
	int lengthOfroomFor1 = 0;
	int lengthOfroomFor4 = 0;
	int lengthOfroomFor6 = 0;
	
	//현재 체크인 시간
	SimpleDateFormat checkin = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
	String checkInTime = checkin.format(System.currentTimeMillis());
	
	//현재 체크아웃 시간
	SimpleDateFormat checkout = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
	String checkOutTime = checkout.format(System.currentTimeMillis());
	
	//단가 설정
	int unitPrice = 0;
	
	//방 추가 메소드 선언
	void plusRoom(int roomNum) {
		switch(roomNum) {
		//비어있는 좌석은 true 값을 가진다.
		case 1://1인용, 방 번호 : 100~
			roomFor1[lengthOfroomFor1] = new Room(true, true, 100+lengthOfroomFor1, 0, null, null, null);
			lengthOfroomFor1++;			
			break;
		case 2:	//4인용, 방 번호 : 400~
			roomFor4[lengthOfroomFor4] = new Room(true, true, 400+lengthOfroomFor4, 0, null, null, null);
			lengthOfroomFor4++;
			break;
		case 3:	//6인용, 방 번호 : 600~
			roomFor6[lengthOfroomFor6] = new Room(true, true, 600+lengthOfroomFor6, 0, null, null, null);
			lengthOfroomFor6++;
			break;
		default:
			return;
		}
	}
	
	//방 삭제 메소드 선언
	void deleteRoom(int roomNum, int deleteRoom) {
		switch(roomNum) {
		case 1:	//1인용 중 삭제할 좌석
			if (lengthOfroomFor1 == 0) { throw new RuntimeException(); }	//방이 생성되지 않았을 경우 RuntimeException을 발생시킨다.
			for(int i = 0; i < lengthOfroomFor1; i++) {	//비어있는 방인지 검사한다.
				if(roomFor1[i].isEmpty == true) { 
					roomFor1[deleteRoom-100].isDelete = false;
					roomFor1[deleteRoom-100].isEmpty = false;
				}
			}
			break;
		case 2:	//4인용 중 삭제할 좌석
			if (lengthOfroomFor4 == 0) { throw new RuntimeException(); }
			for (int i = 0; i < lengthOfroomFor4; i++) {
				if(roomFor4[i].isEmpty == true) { 
					roomFor4[deleteRoom-400].isDelete = false;
					roomFor4[deleteRoom-100].isEmpty = false;
				}
			}
			break;
		case 3:	//6인용 중 삭제할 좌석
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
	
	//비어있는 방 찾기 메소드 선언
	String findEmptyRoom(int roomNum) {	
		//비어있는 좌석이고 삭제되지 않은 좌석이면 생성된 빈 방 객체에 빈 방의 번호가 들어가게 되고
		//result에 비어있는 방 번호가 하나씩 들어가게 된다.
		String result = "";
		switch(roomNum) {	//몇 인용 방에 있는 빈 좌석을 볼 것인지 입력받는다.
		case 1:	//1인용 빈 좌석
			int[] emptyRoomFor1 = new int[lengthOfroomFor1];
			for (int i = 0; i < lengthOfroomFor1; i++) {
				if(roomFor1[i].isEmpty == true) {
					if(roomFor1[i].isDelete == true) { 
						emptyRoomFor1[i] = roomFor1[i].numOfRoom;
						result += emptyRoomFor1[i]+"번 방 ";
					}
				}
			}
			return result;
		case 2:	//4인용 빈 좌석
			int[] emptyRoomFor4 = new int[lengthOfroomFor4];
			for (int i = 0; i < lengthOfroomFor4; i++) {
				if(roomFor4[i].isEmpty == true) {
					if(roomFor4[i].isDelete == true) { 
						emptyRoomFor4[i] = roomFor4[i].numOfRoom; 
						result += emptyRoomFor4[i]+"번 방 ";
					}
				}
			}
			return result;
		case 3:	//6인용 빈 좌석
			int[] emptyRoomFor6 = new int[lengthOfroomFor6];
			for (int i = 0; i < lengthOfroomFor6; i++) {
				if(roomFor6[i].isEmpty == true) {
					if(roomFor6[i].isDelete == true) { 
						emptyRoomFor6[i] = roomFor6[i].numOfRoom;
						result += emptyRoomFor6[i]+"번 방 ";
					}
				}
			}
			return result;
		default:
			return null;
		}
	}
	
	//체크인 메소드
	boolean checkIn(int roomNum, int roomChoice, String name, String phonenum) {	//인용,방,이름,전화번호를 main에서 입력받는다.
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

