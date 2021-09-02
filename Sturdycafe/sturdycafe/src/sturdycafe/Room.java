package sturdycafe;

public class Room {
	//배열에 room 객체를 생성할 때 비어있는 좌석은 true 값을 가지도록 구현한다.
	boolean isEmpty = true;
	// 1인용 100번대, 4인용 400번대, 6인용 600번대
	int numOfRoom = 0;	//방 번호 
	boolean isDelete = true;	//삭제된 방:false, 삭제되지 않은 방:true
	//손님 이름, 전화번호, 방 번호
	String name = null;
	String phonenum = null;
	int roomChoice = 0;
	//체크인 시간
	String checkInTime;
	//체크아웃 시간
	String checkOutTime;
	
	Room() {;}
	
	//방의 기본 정보 : 방 상태(비어있음 or 비어이있지 않음/삭제됨 or 삭제되지 않음), 방 번호 
	Room(boolean isEmpty, boolean isDelete, int numOfRoom, int roomChoice, String name, String phonenum, String checkInTime) { 
		this.isDelete = isDelete; 
		this.isEmpty = isEmpty;
		this.numOfRoom = numOfRoom;
		this.roomChoice = roomChoice;
		this.name = name;
		this.phonenum = phonenum;
		this.checkInTime = checkInTime;
	}
	 //체크인, 체크아웃 생성자
//	Room(boolean isEmpty, int roomChoice, String name, String phonenum, String checkInTime) {	//방 상태, 방 번호, 이름, 전화번호
//		this.isEmpty = isEmpty;
//		this.roomChoice = roomChoice;
//		this.name = name;
//		this.phonenum = phonenum;
//		this.checkInTime = checkInTime;
//	}
}
