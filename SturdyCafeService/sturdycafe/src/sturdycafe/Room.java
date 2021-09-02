package sturdycafe;

public class Room {
	private int max;	//�ִ� �ο�
	private String roomName;	//�� �̸�
	private int unitPrice;	//�ܰ�
	private	boolean isfull;	//����ִ� �¼�����
		
	private long checkInTime;	//üũ�� �ð�
	private long checkOutTime;	//üũ�ƿ� �ð�
	
	private Customer customer = new Customer();


	//������
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
