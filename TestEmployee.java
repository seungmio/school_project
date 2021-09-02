import java.util.Scanner;

class TestEmployee
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		// private 접근 위한 객체 선언
		String n;
		String a;
		int s;
		int p;

		// 배열 참조 변수를 선언한다.
		Employee[] employees;

		// 크기가 2인 Employee 배열 employees을 생성한다.
		employees = new Employee[2];
		
		// 사용자로부터 2명의 사원 데이터를 받아서 배열에 추가하여 본다.
		for(int i=0;i<employees.length; i++)
		{
			employees[i] = new Employee();
		}

		for(int i=0; i<employees.length; i++)
		{	
			System.out.printf("이름을 입력하세요 [직원번호%d] : ",i+1);
			n = scan.nextLine();
			employees[i].setName(n);
			System.out.printf("주소를 입력하세요 [직원번호%d] : ",i+1);
			a = scan.nextLine();
			employees[i].setAddress(a);
			System.out.printf("연봉을 입력하세요 [직원번호%d] : ",i+1);
			s = scan.nextInt();
			employees[i].setSalary(s);
			System.out.printf("전화번호를 입력하세요 [직원번호%d] : ",i+1);
			p = scan.nextInt();
			employees[i].setPhonenum(p);
			scan.nextLine();		// 개행문자를 제거한다.
			
		}
		// 수정
		System.out.println("수정하시겠습니까?");
		String modify = scan.nextLine();
		if (modify.equals("y"))			// 수정을 하는 경우
		{
			System.out.println("수정하고 싶은 직원번호를 입력하세요 : ");
			int modifyNum = scan.nextInt();
			scan.nextLine();			// 개행문자를 제거한다.
			int i = modifyNum - 1;		// index 가 0 부터 시작하기 때문에 사용자가 입력한 직원번호에 1을 빼준다.

			System.out.printf("이름을 입력하세요 : ");
			n = scan.nextLine();
			employees[i].setName(n);
			System.out.printf("주소를 입력하세요 : ");
			a = scan.nextLine();
			employees[i].setAddress(a);
			System.out.printf("연봉을 입력하세요 : ");
			s = scan.nextInt();
			employees[i].setSalary(s);
			System.out.printf("전화번호를 입력하세요 : ");
			p = scan.nextInt();
			employees[i].setPhonenum(p);
			scan.nextLine();
		}
		
			// 배열에 저장된 모든 데이터를 출력한다.
			for(int i=0;i<=employees.length;i++)
			{	
				System.out.println("직원번호["+(i)+"]		"+employees[i]);
			}

		if (modify.equals("n"))			// 수정을 하지 않는 경우
		{
			// 배열에 저장된 모든 데이터를 출력한다.
			for(int i=0;i<=employees.length;i++)
			{	
				System.out.println("직원번호["+(i+1)+"]		"+employees[i]);	// employees[i].toString() 안해도 toString이 자동 호출된다.
			}

		}

	}
}