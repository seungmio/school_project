package sturdycafe;

public class Customer {
	private String name;	//손님 이름
	private String phonenum;	//손님 전화번호

	
	//생성자
	Customer() {;}
	
	Customer(String name, String phonenum) {
		this.name = name;
		this.phonenum = phonenum;
	}
	
	// getter & setter
	String getPhoneNum() {
		return phonenum;
	}
	void setPhoneNumber(String phonenum) {
		this.phonenum = phonenum;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
}
