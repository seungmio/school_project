import java.util.Scanner;

class TestEmployee
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		// private ���� ���� ��ü ����
		String n;
		String a;
		int s;
		int p;

		// �迭 ���� ������ �����Ѵ�.
		Employee[] employees;

		// ũ�Ⱑ 2�� Employee �迭 employees�� �����Ѵ�.
		employees = new Employee[2];
		
		// ����ڷκ��� 2���� ��� �����͸� �޾Ƽ� �迭�� �߰��Ͽ� ����.
		for(int i=0;i<employees.length; i++)
		{
			employees[i] = new Employee();
		}

		for(int i=0; i<employees.length; i++)
		{	
			System.out.printf("�̸��� �Է��ϼ��� [������ȣ%d] : ",i+1);
			n = scan.nextLine();
			employees[i].setName(n);
			System.out.printf("�ּҸ� �Է��ϼ��� [������ȣ%d] : ",i+1);
			a = scan.nextLine();
			employees[i].setAddress(a);
			System.out.printf("������ �Է��ϼ��� [������ȣ%d] : ",i+1);
			s = scan.nextInt();
			employees[i].setSalary(s);
			System.out.printf("��ȭ��ȣ�� �Է��ϼ��� [������ȣ%d] : ",i+1);
			p = scan.nextInt();
			employees[i].setPhonenum(p);
			scan.nextLine();		// ���๮�ڸ� �����Ѵ�.
			
		}
		// ����
		System.out.println("�����Ͻðڽ��ϱ�?");
		String modify = scan.nextLine();
		if (modify.equals("y"))			// ������ �ϴ� ���
		{
			System.out.println("�����ϰ� ���� ������ȣ�� �Է��ϼ��� : ");
			int modifyNum = scan.nextInt();
			scan.nextLine();			// ���๮�ڸ� �����Ѵ�.
			int i = modifyNum - 1;		// index �� 0 ���� �����ϱ� ������ ����ڰ� �Է��� ������ȣ�� 1�� ���ش�.

			System.out.printf("�̸��� �Է��ϼ��� : ");
			n = scan.nextLine();
			employees[i].setName(n);
			System.out.printf("�ּҸ� �Է��ϼ��� : ");
			a = scan.nextLine();
			employees[i].setAddress(a);
			System.out.printf("������ �Է��ϼ��� : ");
			s = scan.nextInt();
			employees[i].setSalary(s);
			System.out.printf("��ȭ��ȣ�� �Է��ϼ��� : ");
			p = scan.nextInt();
			employees[i].setPhonenum(p);
			scan.nextLine();
		}
		
			// �迭�� ����� ��� �����͸� ����Ѵ�.
			for(int i=0;i<=employees.length;i++)
			{	
				System.out.println("������ȣ["+(i)+"]		"+employees[i]);
			}

		if (modify.equals("n"))			// ������ ���� �ʴ� ���
		{
			// �迭�� ����� ��� �����͸� ����Ѵ�.
			for(int i=0;i<=employees.length;i++)
			{	
				System.out.println("������ȣ["+(i+1)+"]		"+employees[i]);	// employees[i].toString() ���ص� toString�� �ڵ� ȣ��ȴ�.
			}

		}

	}
}