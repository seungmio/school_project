import java.util.Scanner;
class Employee 
{
	private String name;		// �����̸�
	private String address;		// �ּ�
	private int salary;			// ����
	private int phonenum;		// ��ȭ��ȣ
	
	// ���� �ʵ忡 ���Ͽ� getter�� setter �޼ҵ� �ۼ��Ѵ�.
	
	public String getName()			// �����̸�
	{
		return name;
	}	
	public void setName(String name)		
	{
		this.name = name;
	}
	public String getAddress()			// �ּ�
	{
		return address;
	}	
	public void setAddress(String address)	
	{
		this.address = address;
	}
	public int getSalary()			// ����
	{
		return salary;
	}	
	public void setSalary(int salary)		
	{
		this.salary = salary;
	}
	public int getPhonenum()			// ��ȭ��ȣ
	{
		return phonenum;
	}
	public void setPhonenum(int phonenum)	
	{
		this.phonenum = phonenum;
	}

	// toString() �޼ҵ带 �ۼ��Ѵ�.
	// ��ü�� print�� �� toString() �ڵ� ȣ���� �ȴ�.
	public String toString()		// ���ڿ��� ����� ����
	{
		return "name : "+name+"	Address : "+address+"	annual_salary : "+salary+"	phone : "+phonenum;
	}
}
