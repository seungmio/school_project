package sturdycafe;

public class Room {
	private int max;	//최대 인원
	private String roomName;	//방 이름
	private int unitPrice;	//단가
	private	boolean isfull;	//비어있는 좌석인지
		
	private long checkInTime;	//체크인 시간
	private long checkOutTime;	//체크아웃 시간
	
	private Customer customer = new Customer();


	//생성자
	Room() {;}
	
	Room(int max, String roomName, int unitPrice, boolean isfull) {
		this.max = max;
		this.roomName = roomName;
		this.unitPrice = unitPrice;
		this.isfull = isfull;
	}
	
	//getter&setter
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	int getMax() {
		return max;
	}
	void setMax(int max) {
		this.max = max;
	}
	String getRoomName() {
		return roomName;
	}
	void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	int getUnitPrice() {
		return unitPrice;
	}
	void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	boolean getRoomFull() {
		return isfull;
	}
	void setRoomFull(boolean isfull) {
		this.isfull = isfull;
	}
	long getCheckInTime() {
		return checkInTime;
	}
	void setCheckInTime(long checkInTime) {
		this.checkInTime = checkInTime;
	}
	long getCheckOutTime() {
		return checkOutTime;
	}
	void setCheckOutTime(long checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	
}
