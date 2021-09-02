import java.util.Scanner;
class Employee 
{
	private String name;		// 직원이름
	private String address;		// 주소
	private int salary;			// 연봉
	private int phonenum;		// 전화번호
	
	// 각각 필드에 대하여 getter와 setter 메소드 작성한다.
	
	public String getName()			// 직원이름
	{
		return name;
	}	
	public void setName(String name)		
	{
		this.name = name;
	}
	public String getAddress()			// 주소
	{
		return address;
	}	
	public void setAddress(String address)	
	{
		this.address = address;
	}
	public int getSalary()			// 연봉
	{
		return salary;
	}	
	public void setSalary(int salary)		
	{
		this.salary = salary;
	}
	public int getPhonenum()			// 전화번호
	{
		return phonenum;
	}
	public void setPhonenum(int phonenum)	
	{
		this.phonenum = phonenum;
	}

	// toString() 메소드를 작성한다.
	// 객체를 print할 때 toString() 자동 호출이 된다.
	public String toString()		// 문자열로 만들어 리턴
	{
		return "name : "+name+"	Address : "+address+"	annual_salary : "+salary+"	phone : "+phonenum;
	}
}
