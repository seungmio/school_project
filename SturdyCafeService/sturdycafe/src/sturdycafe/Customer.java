package sturdycafe;

public class Customer {
	private String name;	//�մ� �̸�
	private String phonenum;	//�մ� ��ȭ��ȣ

	
	//������
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
